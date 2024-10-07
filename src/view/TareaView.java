package src.view;

import src.model.Tarea;
import src.services.DataTareas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;



    public class TareaView {

        public static JPanel panel(ArrayList<Tarea> Tareas){

            // Crear panel principal
            JPanel panelPrincipal = new JPanel(new BorderLayout());
            panelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20));
            panelPrincipal.setBackground(Color.WHITE);

            // Título de la tabla
            JLabel titulo = new JLabel("Gestión de tareas", SwingConstants.CENTER);
            titulo.setFont(new Font("SansSerif", Font.BOLD, 28));
            titulo.setForeground(new Color(0, 102, 204));
            titulo.setBorder(new EmptyBorder(10, 0, 20, 0));

            // Crear modelo de tabla con columnas y sin datos por defecto
            String[] columnas = {"Titulo", "Descripción", "Fecha", "Estado"};
            DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

            // Llenar la tabla con la lista de medicinas
            for (Tarea tareas : Tareas.toArray(new Tarea[0])) {
                String[] fila = {tareas.getTitulo(), tareas.getDescripcion(), tareas.getFecha(), String.valueOf(tareas.getEstado())};
                modelo.addRow(fila);
            }

            // Crear la tabla
            JTable tabla = new JTable(modelo);
            tabla.setFont(new Font("SansSerif", Font.PLAIN, 16));
            tabla.setRowHeight(30);
            tabla.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 18));
            tabla.getTableHeader().setBackground(new Color(0, 102, 204));
            tabla.getTableHeader().setForeground(Color.WHITE);
            tabla.setGridColor(new Color(224, 224, 224));
            tabla.setFillsViewportHeight(true);

            // Alineación centrada para los datos de la tabla
            DefaultTableCellRenderer centeredRenderer = new DefaultTableCellRenderer();
            centeredRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                tabla.getColumnModel().getColumn(i).setCellRenderer(centeredRenderer);
            }

            // Scroll para la tabla en caso de que sea grande
            JScrollPane scrollPane = new JScrollPane(tabla);
            scrollPane.setPreferredSize(new Dimension(500, 600));

            // Agregar el título y la tabla al panel principal
            panelPrincipal.add(titulo, BorderLayout.NORTH);
            panelPrincipal.add(scrollPane, BorderLayout.CENTER);

            return panelPrincipal;
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Gestión de tareas");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 700); // Tamaño de la ventana


            ArrayList<Tarea> listaTareas = new DataTareas().getData();
            JPanel panelTarea = panel (listaTareas);


            frame.add(panelTarea);
            frame.setVisible(true);
        }
    }






