/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramadoii;

/**
 *
 * @author krist
 */
public class Habitacion {

    //Atributos
    private int numeroPiso;
    private int numeroHabitacion;

    //Constructor con parametros
    public Habitacion(int numeroPiso, int numeroHabitacion) {
        this.numeroPiso = numeroPiso;
        this.numeroHabitacion = numeroHabitacion;
    }

    //Constructor sin parametros
    public Habitacion() {
    }
    
    //Sett y gett
    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
    
    //to String 
    @Override
    public String toString() {
        return "Habitacion{" + "numeroPiso=" + numeroPiso + ", numeroHabitacion=" + numeroHabitacion + '}';
    }
    

}
