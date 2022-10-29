/**
 * registro
 */
import java.util.*;

public class registro {
    Student student = new Student();
    Scanner read = new Scanner(System.in);

    public void newUser() {
        // funcion para ingresar un nuevo usuario , contrasena y 5 notas
        System.out.print("Ingresa el nombre el estudiante: ");
        student.name = read.next();
        System.out.print("Ingresa contrasena del estudiante: ");
        student.passwd = read.next();
        if (student.passwd.length() >=8) {
            System.out.print("Usuario "+student.getStudent_name()+" creado exitosamente\n");
            
        }

        else {
            System.out.print("La contrasena es debil!\nAsegurate de que la contrasena tenga mas de 8 digitos.");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa nota del estudiante: " );
            student.grades[i] = read.nextDouble();
        }


        
        
        
        
    }
    public void getUsernames() {
        //funcion para imprimir el total de los usuarios creados
        
    }
    public void getGreades(String username) {
        // funcion para imprimir nota del usuario y promedio
        double suma=0, promedio;
        System.out.println("\nnotas: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(student.grades[i]+ " ");
            suma = suma + student.grades[i];

            
        }

        promedio = suma/5;
        System.out.println("\nPromedio: "+promedio);
        
    }
    public void resetPassword(String username) {
        //funcion para actualizar la contrasena actual
        //debe verificar contrasena actual y reemplazarla por la nueva
        String actual_passwd="";
        System.out.print("Ingresa la antigua contrasena del estudiante: ");
        actual_passwd = read.next();
        if (actual_passwd.equals(student.passwd)) {
            System.out.print("Ingresa la nueva contrasena del estudiante: ");
            student.passwd = read.next();
            
        }

        else {
            System.out.print("Las contrasenas no coinsiden.");
        }

        
    }
}