package boletin14;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           ConversorTemperaturas c;
        Scanner sc;
        float F,temp;
        sc=new Scanner(System.in);
        c=new ConversorTemperaturas();
        System.out.println("Introduce temperatura:");
        temp=sc.nextFloat();
        try{
            System.out.println("Fahrenheit: " + c.CtoF(temp));
            c.CtoRe(temp);
        }catch(TemperaturaErradaException e){
           System.out.println(" " + e.toString());
        }
    }
    
}

