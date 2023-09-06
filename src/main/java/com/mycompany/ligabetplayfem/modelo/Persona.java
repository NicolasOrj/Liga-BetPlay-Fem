/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplayfem.modelo;

/**
 *
 * @author niorb
 */

// Encapsulamiento: Propiedades encapsuladas con getters y setters
public class Persona {
    
    // Retorna el arreglo de equipos creado
    private String nombre; // Nombre de la persona
    private String apellido; // Apellido de la persona
    private int edad; // Edad de la persona

    // Método getter para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Método setter para establecer el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el apellido de la persona
    public String getApellido() {
        return apellido;
    }

    // Método setter para establecer el apellido de la persona
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método getter para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }

    // Método setter para establecer la edad de la persona
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Método adicional para obtener una representación de la edad con el nombre de la persona
    public String getEdadStr() {
        return "edad de: " + this.nombre + " es: " + this.edad;
    }
    
    // Constructor con parámetros para inicializar los atributos
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Constructor por defecto
    public Persona() {
        // Este constructor no realiza ninguna acción, deja los atributos en sus valores predeterminados
    }
    
}
