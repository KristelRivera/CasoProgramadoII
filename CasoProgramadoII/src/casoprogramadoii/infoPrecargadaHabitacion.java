/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramadoii;

/**
 *
 * @author krist
 */
public class infoPrecargadaHabitacion {
    //Atributo
    private Habitacion [] habitacion;
    
    //Constructor que inicializa
        public infoPrecargadaHabitacion() {
            habitacion = new Habitacion[3];
            habitacion[0] = new Habitacion1("Habitacion1", "Numero de habitacion: 1", "Piso: 1");
            habitacion[1] = new Habitacion2("Habitacion2", "Numero de habitacion: 2" , "Piso: 1");
            habitacion[2] = new Habitacion3("Habitacion3", "Numero de habitacion: 3", "Piso: 1");
    }
    
}
