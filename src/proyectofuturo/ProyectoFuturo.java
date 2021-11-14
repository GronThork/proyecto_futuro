/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofuturo;

/**
 *
 * @author Samuel
 */
public class ProyectoFuturo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : " + args[1] + " módulos matriculados y " + args[2] + " horas semanales dedicadas al estudio");
        
        System.out.println(veredicto(args[1], args[2]));
    }
    
    public static String veredicto(String value1, String value2){
        if (value1.equals(value2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(value1) < Integer.valueOf(value2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
