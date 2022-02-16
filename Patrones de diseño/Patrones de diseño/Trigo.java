
/**
 * Write a description of class Trigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trigo
{
    // instance variables - replace the example below with your own
    private float cantidad;
    private String ubicacionEnGranja;
    private String parrafo;
    /**
     * Constructor for objects of class Trigo
     */
    public Trigo(float c, String u)
    {
        cantidad = c;
        ubicacionEnGranja = u;
    }

    public String triturar()
    {
        parrafo = "Se está triturando el trigo";
        System.out.println(parrafo);
        return parrafo;
    }
    
    public String mezclar(){
        parrafo = "Se está mezclando el trigo con otro material";
        System.out.println(parrafo);
        return parrafo;
    }
    
    public String añadirAgua(){
        parrafo = "Se añadió el agua";
        System.out.println(parrafo);
        return parrafo;
    }
}
