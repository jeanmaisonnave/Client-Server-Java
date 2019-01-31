/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sophie_fonseque.pkg2.pkg0;

/**
 *
 * @author Landry Gato
 */public class Stock {
    private Integer quantite;
private Integer Stock;

    public Stock(Integer quantite) {
        this.quantite = quantite;
    }

    public Stock(Integer quantite, Integer Stock) {
        this.quantite = quantite;
        this.Stock = Stock;
    }

  

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer Stock) {
        this.Stock = Stock;
    }

}
