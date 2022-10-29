/*integrantes:
 * Anthony De Los Santos 
 * Aurora Guevara
 * Cristian Acuna
 * Dioryettee Flores
 * Daniel Dias */
public class Student {
    /*Se creo una clase llamada Student como maqueta para cada estudiante
     * ya que antes de ingresar la información al array (nuestra "base de datos") necesitamos validarla y sanitizarla 
     * por lo cual nos sirve para este objetivo.
     */
    String name, passwd;
    double[] grades = new double[5];

    public String getStudent_name() {
        return name;
        
    }
    public double[] getStudent_grades() {
        return grades;
    }


        

   
    



}
