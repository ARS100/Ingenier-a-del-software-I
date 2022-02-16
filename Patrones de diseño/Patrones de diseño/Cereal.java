
/**
 * Write a description of class Cereal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cereal  implements Alimentos
{
    private Trigo trigo;
    /**
     * Constructor for objects of class Cereal
     */
    public Cereal()
    {
        this.trigo = new Trigo(12, "GRANJA A, DIRECCION SUR");
        
        this.trigo.triturar();
        this.trigo.mezclar();
        this.trigo.añadirAgua();
    }

    public String comer()
    {
        // put your code here
        return "Se está comiendo cereal";
    }
}
