/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;
import java.util.Vector;
/**
 *
 * @author 39334
 */
public class Ordine {
    protected int identificativo;
    protected Vector<Piatti> Ordinazione=new Vector<Piatti>();
    public double Prezzo;
    
    public Ordine(int identificativo){
    this.identificativo=identificativo;
    }
    
    public void AggiungiPiatto(Piatti x){
    Ordinazione.addElement(x);
    }
    
    public void RimuoviPiatto(int x){
    Piatti p=new Piatti("","");
    p=(Piatti) Ordinazione.elementAt(x);
    Ordinazione.removeElement(x);
    }
}
