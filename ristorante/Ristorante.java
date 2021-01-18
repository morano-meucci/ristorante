/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

/**
 *
 * @author 39334
 */
public class Ristorante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ingredienti in=new Ingredienti("pasta",100,3.00);
        Piatti primo=new Piatti("piatto","primo");
        Ordine t=new Ordine(2);
        Ordine_Tavolo t2=new Ordine_Tavolo(3,"Anna");
        Ordine_Domicilio t3=new Ordine_Domicilio(4,"Alessio");
        
    }
    
}
