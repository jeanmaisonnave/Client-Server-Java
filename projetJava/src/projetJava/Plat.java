
public class Plat {

	//atributs
	private Integer idPlat;
	private String nomPlat;
	private double prix;
	private Recette recette;
	
	//constructeur
	public Plat(int idPlat, String nomPlat, double prix, Recette recette) {
		this.idPlat=idPlat;
		this.nomPlat=nomPlat;
		this.prix=prix;
		this.recette=recette;
	}
	
	//getters and setters
	public Integer getIdPlat() {
		return idPlat;
	}
	public void setIdPlat(int idPlat) {
		this.idPlat = idPlat;
	}
	public String getNomPlat() {
		return nomPlat;
	}
	public void setNomPlat(String nomPlat) {
		this.nomPlat = nomPlat;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Recette getRecette() {
		return recette;
	}
	public void setRecette(Recette recette) {
		this.recette = recette;
	}
	
	
	//methodes
	public void afficherPlats(){
		System.out.println("id :"+idPlat+"nom: "+nomPlat+"prix: "+prix);
		recette.afficher();
	}
	
}
