/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplayfem.modelo;

/**
 *
 * @author niorb
 */
// Abstracción: Equipo abstrae las propiedades y comportamientos de un equipo
public class Equipo {
    
    // Atributos de la clase Equipo
   private String nombre; // Nombre del equipo
    private int juegosJugados; // Cantidad de juegos jugados por el equipo
    private int juegosGanados; // Cantidad de juegos ganados por el equipo
    private int juegosEmpatados; // Cantidad de juegos empatados por el equipo
    private int juegosPerdidos; // Cantidad de juegos perdidos por el equipo
    private int golesFavor; // Cantidad total de goles marcados por el equipo
    private int golesEnContra; // Cantidad total de goles encajados por el equipo
    private Jugador[] jugadoras; // Arreglo de jugadoras que pertenecen al equipo
    private DirectorTecnico dt; // Director técnico del equipo

    
    // Polimorfismo: Método listarJugadoras en la clase Equipo
    // Método para listar la información de las jugadoras del equipo
    public void listarJugadoras(){
        for(Jugador jugadora : this.jugadoras){
            System.out.println("Nombre: " + jugadora.getNombre());
            System.out.println("Apellido "+ jugadora.getApellido());
            System.out.println("Edad"+ jugadora.getEdad());
            System.out.println("Posicion"+ jugadora.getPosicion().getNombre());
            System.out.println("Dorsal"+ jugadora.getDorsal());
        }
    }
    
    // Métodos getters y setters para los atributos de la clase Equipo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getJuegosJugados() {
        return juegosJugados;
    }

    public void setJuegosJugados(int juegosJugados) {
        this.juegosJugados = juegosJugados;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }

    public int getJuegosEmpatados() {
        return juegosEmpatados;
    }

    public void setJuegosEmpatados(int juegosEmpatados) {
        this.juegosEmpatados = juegosEmpatados;
    }

    public int getJuegosPerdidos() {
        return juegosPerdidos;
    }

    public void setJuegosPerdidos(int juegosPerdidos) {
        this.juegosPerdidos = juegosPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public Jugador[] getJugadoras() {
        return jugadoras;
    }

    public void setJugadoras(Jugador[] jugadoras) {
        this.jugadoras = jugadoras;
    }

    public DirectorTecnico getDt() {
        return dt;
    }

    public void setDt(DirectorTecnico dt) {
        this.dt = dt;
    }
    
    
}
