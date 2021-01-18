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
public class Ordine_Domicilio extends Ordine{
    private String orario;
    private String indirizzo;
    private static double consegna=5;
    public Ordine_Domicilio(int Identificativo,String indirizzo , String orario){
    
    super(identificativo);
    this.indirizzo=indirizzo;
    this.orario=orario;
    }
}
