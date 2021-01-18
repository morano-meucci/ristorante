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
public class Ordine_Tavolo extends Ordine {

    public String cameriere;

    public Ordine_Tavolo(int identificativo, String Cameriere) {
        super(identificativo);
        this.cameriere = cameriere;
    }

    public double PrezzoTotale() {
        int i = 0;
        int j = 0;
        double guadagno = 0;

        Piatti p = new Piatti("", "");
        for (i = 0; i < Ordinazione.size(); i++) {
            p = (Piatti) Ordinazione.elementAt(i);
            for (j = 0; j < p.GetIngredienti().size(); j++) {
                guadagno += p.GetIngredienti().elementAt(j).getPrezzo();
            }
        }
        return guadagno;
    }
}
