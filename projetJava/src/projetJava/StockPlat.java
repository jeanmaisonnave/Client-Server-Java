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
    private Integer idPlat;

    public StockPlat(Integer idPlat, Integer idStock, Integer quantite) {
        super(idStock, quantite);
        this.idPlat = idPlat;
    }

    public Integer getIdPlat() {
        return idPlat;
    }

    public void setIdPlat(Integer idPlat) {
        this.idPlat = idPlat;
    }
    
    
    
}
