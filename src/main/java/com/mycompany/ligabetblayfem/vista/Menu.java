/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetblayfem.vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author niorb
 */
public class Menu {


    public void createMainFrame() {
        final JFrame mainFrame = new JFrame("| Politecnico Internacional | Liga Betplay Fem |");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setLocationRelativeTo(null);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton botonEquipos = new JButton("Equipos");
        botonEquipos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainFrame, "Has hecho clic en el Botón Equipos");
            }
        });

        JButton botonTablaPosiciones = new JButton("Tabla de posiciones");


        buttonPanel.add(botonEquipos);
        buttonPanel.add(Box.createVerticalStrut(10)); 
        buttonPanel.add(botonTablaPosiciones);


        mainFrame.add(buttonPanel, BorderLayout.CENTER);

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
