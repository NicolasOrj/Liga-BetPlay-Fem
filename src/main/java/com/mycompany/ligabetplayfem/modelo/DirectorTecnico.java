/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplayfem.modelo;

/**
 *
 * @author niorb
 */
// Herencia: DirectorTecnico hereda de Persona
public class DirectorTecnico extends Persona{
    
    // Atributo de la clase DirectorTecnico
    private String nacionalidad; // Nacionalidad del director técnico

    // Método getter para obtener la nacionalidad del director técnico
    public String getNacionalidad() {
        return nacionalidad;
    }

    // Método setter para establecer la nacionalidad del director técnico
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}
