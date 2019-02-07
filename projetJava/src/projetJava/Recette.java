/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe
 */
public class Recette {
    
     private interger idRecette;
    private String nomRecette;
    private String libelle;
    private integer ingredient;
    
    public Recette() {
        //contructeur
        //On incrémente la variable à chaque appel du constructeur
        
    }
    public Recette(int idRecette, String nomRecette, String libelle, int ingredient) {
        //contructeur
        //On incrémente la variable à chaque appel du constructeur
        this.idRecette = idRecette;
        this.nomRecette = nomRecette;
        this.libelle = libelle;
        this.ingredient = ingredient;
    }

    public int getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(int idRecette) {
        this.idRecette = idRecette;
    }

    public String getNomRecette() {
        return nomRecette;
    }

    public void setNomRecette(String nomRecette) {
        this.nomRecette = nomRecette;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getIngredient() {
        return ingredient;
    }

    public void setIngredient(int ingredient) {
        this.ingredient = ingredient;
    }
    
    // Cette méthode affiche les ingredients.
	// Joe
	 public void afficherRecette () {
     
     		System.out.println(
            		"id recette  : "+ this.getIdRecette()+
              		"Nom recette : "+ this.getNomRecette() + 
			        "Libelle : "+this.getLibelle() +
			        "Ingredient : "+ this.getIngredient() 
		);
 	}
            
}
