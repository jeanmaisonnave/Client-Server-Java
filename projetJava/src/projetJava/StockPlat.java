/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sophie_fonseque.pkg2.pkg0;

/**
 *
 * @author Landry Gato
 */
public class StockPlat extends Stock{
    private String nomPlat;

    public StockPlat(Integer nomPlat, Integer idStock, Integer quantite) {
        super(nomStock, quantite);
        this.nomPlat =nomPlat;
    }

    public Integer getNomPlat() {
        return nomPlat;
    }

    public void setNomPlat(Integer nomPlat) {
        this.nomPlat = nomPlat;
    }
    
    
    
}
