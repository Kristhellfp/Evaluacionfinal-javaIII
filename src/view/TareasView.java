package src.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;


    public class TareasView extends JFrame {
        private int[] pantalla = {1300, 800};

        public TareasView(HashMap<String, String> DataTarea) {
            setSize(pantalla[0], pantalla[1]);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Gestión de tareas");
            setLayout(new BorderLayout());


            JPanel headerPanel = new JPanel();
            headerPanel.setPreferredSize(new Dimension(1300, 60));
            headerPanel.setBackground(new Color(33, 47, 61)); // Fondo azul oscuro
            headerPanel.setLayout(new BorderLayout());

            JLabel Tarealabel = new JLabel("Gestión de tareas");
            Tarealabel.setForeground(new Color(255, 255, 255)); // Texto blanco
            Tarealabel.setFont(new Font("Sans-Serif", Font.BOLD, 18)); // Tipo de letra cambiado
            headerPanel.add(Tarealabel, BorderLayout.WEST);

            JPanel userPanel = new JPanel(new GridBagLayout());
            userPanel.setBackground(new Color(33, 47, 61)); // Mismo fondo oscuro que el header
            GridBagConstraints gbc = new GridBagConstraints();

            JPanel logoPanel = new JPanel();
            logoPanel.setPreferredSize(new Dimension(50, 50));
            logoPanel.setBackground(Color.ORANGE); // Puedes ajustar este color según tu diseño
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridheight = 2;
            userPanel.add(logoPanel, gbc);

            JLabel nombreTarea = new JLabel(DataTarea.get("Titulo"));
            nombreTarea.setForeground(new Color(255, 255, 255)); // Texto blanco
            nombreTarea.setFont(new Font("Sans-Serif", Font.BOLD, 16));
            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.gridheight = 1;
            userPanel.add(nombreTarea, gbc);

            JLabel DescripcionTarea = new JLabel(DataTarea.get("Descripción"));
            DescripcionTarea.setForeground(new Color(192, 192, 192)); // Texto gris claro
            DescripcionTarea.setFont(new Font("Sans-Serif", Font.PLAIN, 14));
            gbc.gridx = 1;
            gbc.gridy = 1;
            userPanel.add(DescripcionTarea, gbc);

            headerPanel.add(userPanel, BorderLayout.EAST);

            add(createPatientPanel(), BorderLayout.CENTER);

            setVisible(true);
        }

        private JScrollPane createPatientPanel() {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            JScrollPane scrollPane = new JScrollPane(panel);
            return scrollPane;
        }



        public static void main(String[] args) {
            HashMap<String, String> dummyData = new HashMap<>();
            dummyData.put("Titulo", "");
            dummyData.put("Descripción", "");
            new TareasView(dummyData);
        }
    }


