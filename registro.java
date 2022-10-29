/**
 * registro
 * integrantes:
 * Anthony De Los Santos 
 * Aurora Guevara
 * Cristian Acuna
 * Dioryettee Flores
 * Daniel Dias
 */
import java.util.*;

public class registro {
    Student student = new Student();
    variables variable = new variables();
    Scanner read = new Scanner(System.in);

    public void newUser(int id) {
        // funcion para ingresar un nuevo usuario , contrasena y 5 notas
            
            System.out.print("Ingresa el nombre el estudiante: ");
            student.name = read.next();
            variable.usernames[id] = student.name;
            System.out.print("Ingresa contrasena del estudiante: ");
            student.passwd = read.next();
            variable.passwords[id] = student.passwd;

            if (variable.passwords[id].length() >=8) {
                System.out.print("Usuario "+student.getStudent_name()+" creado exitosamente\n");
                
            }

            else {
                System.out.print("La contrasena es debil!\nAsegurate de que la contrasena tenga mas de 8 digitos.");
            }
            for (int i = 0; i < 5; i++) {
                    System.out.print("Ingresa nota del estudiante: " );
                    variable.grades[id][i] = read.nextDouble();
                    
                }
            
            
    
            
        }
  


        
    public void getUsernames() {
        //funcion para imprimir el total de los usuarios creados
        for (int i = 0; i < variable.usernames.length; i++) {
            
            try {
                if (variable.usernames[i].equals(null)) {
                    continue;
                }
                else{
                    System.out.println(variable.usernames[i]);
                
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
            
           
            
        }
        
    }
    public void getGreades(String username) {
        // funcion para imprimir nota del usuario y promedio
        double suma=0, promedio;
        int id=0;
        for (int i = 0; i < variable.usernames.length; i++) {
            if (username.equals(variable.usernames[i])){
                id = i;
            }
            
        }


        System.out.println("\nnotas: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(variable.grades[id][i]+ " ");
            suma = suma + variable.grades[id][i];

            
        }

        promedio = suma/5;
        System.out.println("\nPromedio: "+promedio);
        
    }
    public void resetPassword(String username) {
        //funcion para actualizar la contrasena actual
        //debe verificar contrasena actual y reemplazarla por la nueva

        int id=0;
        for (int i = 0; i < variable.usernames.length; i++) {
            if (username.equals(variable.usernames[i])){
                id = i;
            }
            
        }
        String actual_passwd="";
        System.out.print("Ingresa la antigua contrasena del estudiante: ");
        actual_passwd = read.next();
        if (actual_passwd.equals(variable.passwords[id])) {
            System.out.print("Ingresa la nueva contrasena del estudiante: ");
            variable.passwords[id] = read.next();
            System.out.print("Contrasena Restablecida Correctamente.");
            
        }

        else {
            System.out.print("Las contrasenas no coinsiden.");
        }

        
    }
}