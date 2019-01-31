package projetJava;

public class Ingredient {

	private int idIngredient;
	private String nomIngredient;
	private double cout;
	private Unite uniteIngredient;
	
	public Ingredient(int idIngredient, String nomIngredient, double cout, Unite uniteIngredient) {
		super();
		this.idIngredient = idIngredient;
		this.nomIngredient = nomIngredient;
		this.cout = cout;
		this.uniteIngredient = uniteIngredient;
	}
	
	public int getIdIngredient() {
		return idIngredient;
	}
	public void setIdIngredient(int idIngredient) {
		this.idIngredient = idIngredient;
	}
	public String getNomIngredient() {
		return nomIngredient;
	}
	public void setNomIngredient(String nomIngredient) {
		this.nomIngredient = nomIngredient;
	}
	public double getCout() {
		return cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	
	public Unite getUniteIngredient() {
		return uniteIngredient;
	}
	
	public void setUniteIngredient(Unite uniteIngredient) {
		this.uniteIngredient = uniteIngredient;
	}
	
	public void afficherCout() {
		System.out.println("L'ingredient " + nomIngredient + " coute " + cout + "€/" + uniteIngredient);
	}
	
}
