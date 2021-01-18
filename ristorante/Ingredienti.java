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
public class Ingredienti {

    private String Descrizione;
    private int Quantità;
    private double Prezzo;

    public Ingredienti(String Descrizione, int Quantità, double Prezzo) {
        this.Descrizione = Descrizione;
        this.Quantità = Quantità;
        this.Prezzo = Prezzo;
        
    }

    public String getDescizione() {
        return Descrizione;
    }
   public void setDescrizione(String Descrizione){
   this.Descrizione=Descrizione;
   }
    public int getQuantità() {
        return Quantità;
    }
     public void setQuantità(int Quantità) {
        this.Quantità=Quantità;
    }

    public double getPrezzo() {
        return Prezzo;
    }
 public void setPrezzo(double Prezzo) {
        this.Prezzo=Prezzo;
    }
    public double prezzoTot() {

    }
}
