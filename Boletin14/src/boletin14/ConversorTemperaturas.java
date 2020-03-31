package boletin14;

/**
 *
 * @author carli
 */
class ConversorTemperaturas {
    public final float limite=80;
    
    public ConversorTemperaturas(){
        
    }
    
    public float CtoF(float C) throws TemperaturaErradaException{
        float res;
       if(C>limite){
            throw new TemperaturaErradaException("Temperatura Superior a 80C");
        }
        res=(9f/5f*C)+32.4f;
        return res;
    }
    
    public void CtoRe(float C) throws TemperaturaErradaException{
        if(C>limite){
            throw new TemperaturaErradaException("Temperatura superior a 80C");
        }
        System.out.println("Reamur: " + (4f/5f*C));
    }
}