/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetblayfem.vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author niorb
 */
public class Login  {
    private JFrame loginFrame;
    private final Menu menu;

    // Campos de texto para el nombre de usuario y contraseña, y botón de inicio de sesión
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    // Constructor de la aplicación
    public Login() {
        createLoginFrame();
        menu = new Menu();
    }

    // Crear la ventana de inicio de sesión
    private void createLoginFrame() {
        loginFrame = new JFrame("| Politecnico Internacional | Liga betplay femenina |");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 150);
        loginFrame.setLayout(new GridLayout(3, 2));
        loginFrame.setLocationRelativeTo(null);

        // Crear campos de texto y botón de inicio de sesión
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Iniciar Sesion");

        // Agregar etiquetas, campos de texto y botón a la ventana de inicio de sesión
        loginFrame.add(new JLabel("Usuario:"));
        loginFrame.add(usernameField);
        loginFrame.add(new JLabel("Contraseña:"));
        loginFrame.add(passwordField);
        loginFrame.add(new JLabel());
        loginFrame.add(loginButton);

        // Agregar acción al botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();

                // Lógica de autenticación
                if (username.equals("poli") && new String(password).equals("colombia")) {
                    loginFrame.dispose();
                    menu.createMainFrame();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Usuario o Contraseña Incorrecta.");
                }
            }
        });

        loginFrame.setVisible(true);
    }
    
}
