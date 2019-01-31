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
    
    private integer idConditionnement;
    private String libConditionnement;
    
    public Etiquette() {
        //contructeur
        //On incrémente la variable à chaque appel du constructeur
        
    }
    
    public Etiquette(int idConditionnement, String libConditionnement) {
        //contructeur
        this.idConditionnement = idConditionnement;
        this.libConditionnement = libConditionnement;
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
