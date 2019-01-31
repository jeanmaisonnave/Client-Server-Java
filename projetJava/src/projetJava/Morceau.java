package projetJava;

public class Morceau extends Ingredient {
	
	private String nomAnimal;
	private String nomMorceau;
		
	public Morceau(int idIngredient, String nomIngredient, double cout, Unite uniteIngredient, String nomAnimal, String nomMorceau) {
		super(idIngredient, nomIngredient, cout, uniteIngredient);
		this.nomAnimal = nomAnimal;
		this.nomMorceau = nomMorceau;
	}
	
	public String getNomAnimal() {
		return nomAnimal;
	}
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	public String getNomMorceau() {
		return nomMorceau;
	}
	public void setNomMorceau(String nomMorceau) {
		this.nomMorceau = nomMorceau;
	}
	
}
