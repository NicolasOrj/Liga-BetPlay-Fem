/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetblayfem.vista;

import com.mycompany.ligabetplayfem.modelo.Equipo;
import com.mycompany.ligabetplayfem.modelo.Jugador;
import javax.swing.JOptionPane;

/**
 *
 * @author niorb
 */
public class Plantel {
    private Equipo[] equipos;

    // Constructor que recibe los equipos como parámetro
    public Plantel(Equipo[] equipos) {
        this.equipos = equipos;
    }

    // Método para mostrar la información de un equipo
    public void mostrarEquipo(Equipo equipo) {
        String infoEquipo = "Nombre: " + equipo.getNombre() + "\n";
        infoEquipo += "Director Técnico: " + equipo.getDt().getNombre() + " " + equipo.getDt().getApellido() + "\n";
        infoEquipo += "Jugadoras:\n";

        for (Jugador jugadora : equipo.getJugadoras()) {
            infoEquipo += jugadora.getNombre() + " " + jugadora.getApellido() + "\n";
        }

        JOptionPane.showMessageDialog(null, infoEquipo, "Información del Equipo", JOptionPane.INFORMATION_MESSAGE);
    }


}