
/**
 * Write a description of class Profesion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesion
{
   // instance variables - replace the example below with your own
    private String nombreProfesion;
    
    private String rango;
    /**
     * Constructor for objects of class Profesion
     */
    public Profesion(String Profesion, String Rango)
    {
     nombreProfesion = Profesion;
     rango = Rango;
    }
    public String getNombreprofesion() {
        return nombreProfesion;
    }
    public String getRango() {
        return rango;
    }
    public void setNombreprofesion(String profesion) {
        nombreProfesion = profesion;
    }
    public void setRango(String Rango) {
        rango = Rango;
    }
}