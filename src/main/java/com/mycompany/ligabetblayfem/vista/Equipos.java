/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetblayfem.vista;

/**
 *
 * @author niorb
 */
/**
 * La clase Equipos representa un equipo deportivo con un nombre y una ciudad.
 */
public class Equipos {
    // Atributos de la clase Equipos
    private String nombre;  // Nombre del equipo
    private String ciudad;  // Ciudad a la que pertenece el equipo

    /**
     * Constructor de la clase Equipos.
     *
     * @param nombre El nombre del equipo.
     * @param ciudad La ciudad a la que pertenece el equipo.
     */
    public Equipos(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el nombre del equipo.
     *
     * @return El nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la ciudad a la que pertenece el equipo.
     *
     * @return La ciudad a la que pertenece el equipo.
     */
    public String getCiudad() {
        return ciudad;
    }
}

