/**
 * matricula
 */
import java.util.*;
public class matricula {

    public static void main(String[] args) {
 
        //objetos
        Student student = new Student();
        Scanner read = new Scanner(System.in);
        registro register = new registro();
        
        

        
        //menu
        int opcion=0, condicion =1;
        while (condicion>0) {

            System.out.println("Matricula Estudiantil:\n1)Agregar Estudiante Nuevo.\n2)Mostrar Notas de Estudiante y Promedio.\n3)Restablecer Contrasena\n4) Salir.");
            System.out.print("-> ");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    register.newUser();
                    
                    break;
                case 2:
                    register.getGreades(student.name);
                    break;
                case 3:
                    register.resetPassword(student.name);
                    
                    break;
                case 4:
                    condicion = 0;
                    break; 
            
                default:
                    System.out.println("ERROR: Elige alguna de las opciones dentro del Menu.");
                    break;
            }
            
        }
        
        
        
        

        
        
        


    }
}