
/**
 * Write a description of class Carnes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carnes implements Alimentos
{
    // instance variables - replace the example below with your own
    private float peso;
    private String corte;
    private String animal;
    /**
     * Constructor for objects of class Carnes
     */
    public Carnes(float p, String c, String animal)
    {
        peso = p;
        corte = c;
        this.animal = animal;
    }
    
    public String comer(){
        return "Se está comiendo carnes";
    }

  
}
