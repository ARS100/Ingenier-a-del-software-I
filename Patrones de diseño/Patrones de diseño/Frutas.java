
public class Frutas implements Alimentos 
{
    // instance variables - replace the example below with your own
    private static Frutas instancia;
    public String tipoDeFruta;
    
    private Frutas()
    {
    }

    public static Frutas getInstancia()
    {
        if(instancia == null) {
            instancia = new Frutas();
        }
        return instancia;
    }
    
    public String agregarTipoFruta(String tipodeFruta){
        tipoDeFruta = tipodeFruta;
        return "Se ha agregado la fruta : " + tipoDeFruta ;
    }
    
    public String getTipodeFruta(){
        return tipoDeFruta;
    }
    
    public String comer()
    {
        // put your code here
        return "Se está comiendo frutas";
    }
}
