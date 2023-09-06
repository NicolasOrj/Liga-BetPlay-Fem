/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ligabetplayfem.modelo;

/**
 *
 * @author niorb
 */
public enum PosicionesEnum {
    
    // Valores de la enumeración junto con sus códigos y nombres
    DELANTERA_CENTRO(1, "delantero centro"),
    DEFENSA_CENTRAL(2, "defensa centro"),
    PORTERA(3, "portera"),
    MEDIOCAMPISTA(4, "mediocampista"),
    DEFENSA_LATERAL(5, "defensa lateral"),
    DELANTERA_LATERAL(6, "delantera lateral");
    
    // Atributos de la enumeración
    private final int codigo; // Código numérico de la posición
    private final String nombre; // Nombre descriptivo de la posición
    
    // Constructor de la enumeración que inicializa los atributos
    PosicionesEnum(final int codigo, final String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Método getter para obtener el código de la posición
    public int getCodigo() {
        return codigo;
    }

    // Método getter para obtener el nombre de la posición
    public String getNombre() {
        return nombre;
    }
   
}
