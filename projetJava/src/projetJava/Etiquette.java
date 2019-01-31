/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe
 */
public class Etiquette {
    
    private int idConditionnement;
    private String libConditionnement;
    private static  int nbreEtiquette = 0;
    
    public Etiquette() {
        //contructeur
        //On incrémente la variable à chaque appel du constructeur
        nbreEtiquette++;
    }
    
    public Etiquette(int idConditionnement, String libConditionnement) {
        //contructeur
        nbreEtiquette++;
    }
    
    public int getIdConditionnement() {
        return idConditionnement;
    }

    public void setIdConditionnement(int idConditionnement) {
        this.idConditionnement = idConditionnement;
    }

    public String getLibConditionnement() {
        return libConditionnement;
    }

    public void setLibConditionnement(String libConditionnement) {
        this.libConditionnement = libConditionnement;
    }
    
}
