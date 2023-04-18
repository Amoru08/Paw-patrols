
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro
{
    private String nombrePerro;
    private String raza;
    private Profesion profesion;

    public Perro(String nombre, String Raza){
        nombrePerro = nombre;
        raza = Raza;
    }
    public String getNombrePerro() {
        return nombrePerro;
    }
    public String getRaza() {
        return raza;
    }
    public Profesion getProfesion() {
        return profesion;
    }
    
    public void setNombrePerro(String nombre){
        nombrePerro = nombre;
    }
    public void setRaza (String Raza){
        raza = Raza;
    }
    public void setProfesion (Profesion laProfesion){
        profesion = laProfesion;
    }
}