/**
 * matricula
 * 
 * integrantes:
 * Anthony De Los Santos 
 * Aurora Guevara
 * Cristian Acuna
 * Dioryettee Flores
 * Daniel Dias
 */
import java.util.*;
public class matricula {

    public static void main(String[] args) {
 
        //objetos
        Scanner read = new Scanner(System.in);
        registro register = new registro();
        
        

        
        //menu
        int opcion=0, condicion =1, count=0;
        while (condicion>0) {
            try {
                System.out.println("Matricula Estudiantil:\n1)Agregar Estudiante Nuevo.\n2)Mostrar Notas de Estudiante y Promedio.\n3)Restablecer Contrasena\n4) Mostrar usuarios registrados \n5) Salir.");
            System.out.print("-> ");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    register.newUser(count);
                    count +=1;
                    
                    break;
                case 2:
                    String nombre;
                    System.out.print("Ingresa el nombre del estudiante: ");
                    nombre = read.next();
                    register.getGreades(nombre);
                    break;
                case 3:
                    System.out.print("Ingresa el nombre del estudiante: ");
                    nombre = read.next();
                    register.resetPassword(nombre);
                    
                    break;
                case 4:
                    register.getUsernames();
                    break;
                case 5:
                    condicion = 0;
                    break; 
            
                default:
                    System.out.println("ERROR: Elige alguna de las opciones dentro del Menu.");
                    break;
            }
                
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

            
            
        }
        
        
        
        

        
        
        


    }
}