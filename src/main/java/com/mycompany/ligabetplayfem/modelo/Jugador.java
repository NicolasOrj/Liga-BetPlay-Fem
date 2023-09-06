/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplayfem.modelo;

/**
 *
 * @author niorb
 */
// Herencia: Jugador hereda de Persona
public class Jugador extends Persona {
    
    // Atributos de la clase Jugador
    private PosicionesEnum posicion; // Posición del jugador en el campo (defensa, mediocampo, delantera, etc.)
    private int dorsal; // Número dorsal que identifica al jugador en el equipo

    // Método getter para obtener la posición del jugador
    public PosicionesEnum getPosicion() {
        return posicion;
    }

    // Método setter para establecer la posición del jugador
    public void setPosicion(PosicionesEnum posicion) {
        this.posicion = posicion;
    }

    // Método getter para obtener el número dorsal del jugador
    public int getDorsal() {
        return dorsal;
    }
 
    // Método setter para establecer el número dorsal del jugador
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    // Constructor con parámetros que inicializa los atributos heredados y propios
    public Jugador(String nombre, String apellido, int edad, PosicionesEnum posicion, int dorsal) {
        
        // Llama al constructor de la clase padre (Persona) para inicializar los atributos heredados
        super(nombre, apellido, edad);
        this.posicion = posicion; // Inicializa la posición del jugador
        this.dorsal = dorsal; // Inicializa el número dorsal del jugador
    }
    
    
}
