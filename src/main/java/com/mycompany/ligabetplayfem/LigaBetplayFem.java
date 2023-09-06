/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ligabetplayfem;
import com.mycompany.ligabetblayfem.vista.Login;
import com.mycompany.ligabetplayfem.modelo.DirectorTecnico;
import com.mycompany.ligabetplayfem.modelo.Equipo;
import com.mycompany.ligabetplayfem.modelo.Jugador;
import com.mycompany.ligabetplayfem.modelo.PosicionesEnum;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author niorb
 */
public class LigaBetplayFem {
    
    public static void main(String[] args) {
        Equipo[] equipos = crearEquipos(); // Crea dos equipos y los almacena en el arreglo "equipos"
/*
Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte el numero del equipo");
        System.out.println("0: Santa Fe");
        System.out.println("1: America");
        
        int equipoSeleccionado = sc.nextInt(); // Lee el número de equipo seleccionado por el usuario
        
        // Muestra información del equipo seleccionado
        System.out.println("equipo: " + equipos[equipoSeleccionado].getNombre());
        System.out.println("DT "+ equipos[equipoSeleccionado].getDt().getNombre() + "Apellido"+ equipos[equipoSeleccionado].getDt().getApellido());
        System.out.println("Plantel: ");
        equipos[equipoSeleccionado].listarJugadoras(); // Llama al método para listar las jugadoras del equipo
 */

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login(); // Crear una instancia de la aplicación
            }
        });

    }
    
    private static Equipo[] crearEquipos(){
        Equipo[] equipos = new Equipo[2]; // Crea un arreglo de equipos con capacidad para 2 equipos
        
        // Crea y configura el primer equipo (Santa Fe)
        Equipo equipo1 = new Equipo();
        
        // Crea y configura el segundo equipo (America)
        Equipo equipo2 = new Equipo();
        
        equipo1.setNombre("Santa Fe");
        DirectorTecnico dt = new DirectorTecnico();
        dt.setNombre("Omar Antonio");
        dt.setApellido("Ramirez Rengifo");
        dt.setEdad(30);
        dt.setNacionalidad("Colombiano");
        equipo1.setDt(dt);
        
        // Crea y configura las jugadoras del primer equipo
        Jugador[] jugadoras = new Jugador[11];
        
        jugadoras[0] = new Jugador("Valentina","Gonzalez", 21, PosicionesEnum.PORTERA, 1);
        jugadoras[1] = new Jugador("Laura","Tovar",16,PosicionesEnum.DEFENSA_CENTRAL,3);
        jugadoras[2] = new Jugador("Andrea", "Perez", 21, PosicionesEnum.DEFENSA_CENTRAL,4);
        jugadoras[3] = new Jugador("Nubiluz", "Rangel", 29, PosicionesEnum.DEFENSA_LATERAL,5);
        jugadoras[4] = new Jugador("Kelly", "Ibargüen", 20, PosicionesEnum.DEFENSA_LATERAL,14);
        jugadoras[5] = new Jugador("Daniela", "Garavito", 18, PosicionesEnum.MEDIOCAMPISTA,16);
        jugadoras[6] = new Jugador("Karla", "Viancha", 17, PosicionesEnum.MEDIOCAMPISTA,20);
        jugadoras[7] = new Jugador("Liana", "Salazar", 30, PosicionesEnum.MEDIOCAMPISTA, 10);
        jugadoras[8] = new Jugador("Enyer", "Higuera", 22, PosicionesEnum.DELANTERA_CENTRO,9);
        jugadoras[9] = new Jugador("Heidy", "Mosquera", 27, PosicionesEnum.DELANTERA_LATERAL,7);
        jugadoras[10] = new Jugador("Paula","Quiroga", 18, PosicionesEnum.DELANTERA_LATERAL,11);
        equipo1.setJugadoras(jugadoras);
        
        equipo2.setNombre("America");
        DirectorTecnico dt2 = new DirectorTecnico();
        dt2.setNombre("Carlos");
        dt2.setApellido("Hernandez");
        dt2.setEdad(57);
        dt2.setNacionalidad("Colombiano");
        equipo2.setDt(dt2);
        
        // Crea y configura las jugadoras del segundo equipo
        Jugador[] jugadoras2 = new Jugador[11];
        
        
        jugadoras2[0] = new Jugador("Nathalia","Giraldo",20, PosicionesEnum.PORTERA,1);
        jugadoras2[1] = new Jugador("Daniela","Arias",28,PosicionesEnum.DEFENSA_CENTRAL,3);
        jugadoras2[2] = new Jugador("Fabiana", "Yanten", 24, PosicionesEnum.DEFENSA_CENTRAL,5);
        jugadoras2[3] = new Jugador("Tatiana", "Castañeda", 32, PosicionesEnum.DEFENSA_LATERAL,17);
        jugadoras2[4] = new Jugador("Leury", "Basanta", 30, PosicionesEnum.DEFENSA_LATERAL,16);
        jugadoras2[5] = new Jugador("Catalina", "Usme", 33, PosicionesEnum.MEDIOCAMPISTA,10);
        jugadoras2[6] = new Jugador("Daniela", "Castellanos", 20, PosicionesEnum.MEDIOCAMPISTA,20);
        jugadoras2[7] = new Jugador("Mariana", "Samorano", 20, PosicionesEnum.MEDIOCAMPISTA, 28);
        jugadoras2[8] = new Jugador("Orianna", "Quintero", 17, PosicionesEnum.DELANTERA_CENTRO,9);
        jugadoras2[9] = new Jugador("Ingrid", "Vidal", 32, PosicionesEnum.DELANTERA_LATERAL,7);
        jugadoras2[10] = new Jugador("Wendy","Bonilla", 21, PosicionesEnum.DELANTERA_LATERAL,11);
        
        equipo2.setJugadoras(jugadoras2);
        
        equipos[0] = equipo1; // Almacena el primer equipo en el arreglo
        equipos[1] = equipo2; // Almacena el segundo equipo en el arreglo
        return equipos; // Retorna el arreglo de equipos creado
    }
}
