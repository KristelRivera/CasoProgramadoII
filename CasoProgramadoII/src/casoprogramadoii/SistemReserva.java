/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramadoii;

import java.util.Random;

/**
 *
 * @author krist
 */
public class SistemReserva {
    //Atributos
    private  int numeroHabitacion;
    private String tipoHabitacion;
    private double precioNoche;
    
    //Hacer clase enum
    
    //Debe permitir hacer modificaciones estado, tipo y precio
    
    //Debe permitir hacer una vizualisación de las habitaciones
    
    //hacer matriz 
    int matrizReserva[][] = new int[5][5]; //como ingresar la info a la matriz?
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5; j++) {
                Random rand = new Random();
                matrizReserva[i][j] = rand.nextInt(9);
                System.out.print(matrizReserva[i][j] + "-");
            }
            System.out.println("");    
        }
        
    
    //Constructor con parametros
    public SistemReserva(int numeroHabitacion, String tipoHabitacion, int precioNoche) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche = precioNoche;
    }
    
    //Constructor sin parametros
    public SistemReserva() {
    }
    
    //Sett y gett
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }
    
    //Método suma de la ganancia actual del hotel 
    public int sumaGanancia(){
    //falta 
    }
    
    //Se debe de generar un resumen de estado del hotel 
    
   //to String 
    @Override
    public String toString() {
        return "SistemReserva{" + "numeroHabitacion=" + numeroHabitacion + ", tipoHabitacion=" + tipoHabitacion + ", precioNoche=" + precioNoche + '}';
    }
    
   
}
