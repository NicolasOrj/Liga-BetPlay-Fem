/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetblayfem.vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

/**
 *
 * @author niorb
 */
public class Menu {

    // Crear la ventana principal con los botones
    public void createMainFrame() {
        final JFrame mainFrame = new JFrame("| Politecnico Internacional | Liga Betplay Fem |");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setLocationRelativeTo(null);

        // Crear un JPanel para contener todo con BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Crear un JLabel para el texto "MENU"
        JLabel menuLabel = new JLabel("MENU");
        menuLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el texto horizontalmente

        // Crear un JPanel para contener los botones con BoxLayout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton botonEquipos = new JButton("Equipos");
        botonEquipos.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JPopupMenu equiposMenu = new JPopupMenu(); // Crea un menú emergente para los equipos

        // Opción para América
        JMenuItem americaItem = new JMenuItem("América");
        americaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir una ventana o realizar acciones específicas para América
                JOptionPane.showMessageDialog(mainFrame, "Seleccionaste América");
            }
        });
        equiposMenu.add(americaItem);

        // Opción para Santa Fe
        JMenuItem santaFeItem = new JMenuItem("Santa Fe");
        santaFeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir una ventana o realizar acciones específicas para Santa Fe
                JOptionPane.showMessageDialog(mainFrame, "Seleccionaste Santa Fe");
            }
        });
        equiposMenu.add(santaFeItem);

        // Muestra el menú emergente en la posición del botón "Equipos"
        equiposMenu.show(botonEquipos, 0, botonEquipos.getHeight());
    }
});

        JButton botonTablaPosiciones = new JButton("Tabla de posiciones");
        botonTablaPosiciones.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        TablaPosiciones tablaPosiciones = new TablaPosiciones();
        JFrame tablaPosicionesFrame = new JFrame("Tabla de Posiciones");
        JTable table = new JTable(tablaPosiciones);
        JScrollPane scrollPane = new JScrollPane(table);
        tablaPosicionesFrame.add(scrollPane);
        tablaPosicionesFrame.pack();
        tablaPosicionesFrame.setVisible(true);
    }
});

        // Agregar los botones al panel
        buttonPanel.add(botonEquipos);
        buttonPanel.add(Box.createVerticalStrut(10)); // Espacio vertical entre los botones
        buttonPanel.add(botonTablaPosiciones);

        // Agregar el JLabel y el panel de botones al panel principal
        mainPanel.add(menuLabel);
        mainPanel.add(buttonPanel);

        // Centrar el panel principal en la ventana principal
        mainFrame.add(mainPanel, BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().createMainFrame();
            }
        });
    }
}
