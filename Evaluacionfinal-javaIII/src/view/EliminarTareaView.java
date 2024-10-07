package src.view;

import javax.swing.*;
import java.awt.*;


public class EliminarTareaView extends JFrame {


    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public EliminarTareaView() {


        setTitle("Gestión de tareas - Eliminar tarea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);


        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(240, 248, 255));  // Color azul claro


        JPanel tareaPanel = new JPanel();
        tareaPanel.setBackground(new Color(70, 130, 180));  // Azul acero
        JLabel headerLabel = new JLabel("Eliminación de tarea", JLabel.CENTER);
        headerLabel.setFont(new Font("Verdana", Font.BOLD, 24));
        headerLabel.setForeground(Color.WHITE);
        tareaPanel.add(headerLabel);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("Nombre-Tarea:");
        userLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        userLabel.setForeground(new Color(70, 130, 180));  // Mismo azul del encabezado
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(userLabel, gbc);

        userField = new JTextField(15);
        userField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        userField.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));  // Borde del mismo color
        gbc.gridx = 1;
        gbc.gridy = 0;
        formPanel.add(userField, gbc);

        JLabel DescripcionLabel = new JLabel("Descripción:");
        DescripcionLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        DescripcionLabel.setForeground(new Color(70, 130, 180));
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(DescripcionLabel, gbc);

        passwordField = new JPasswordField(15);
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
        gbc.gridx = 1;
        gbc.gridy = 1;
        formPanel.add(passwordField, gbc);


        loginButton = new JButton("Eliminar tarea");
        loginButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        loginButton.setBackground(new Color(70, 130, 180));
        loginButton.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(loginButton, gbc);


        mainPanel.add(tareaPanel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);


        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestión de tareas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700); // Tamaño de la ventana
    }
}