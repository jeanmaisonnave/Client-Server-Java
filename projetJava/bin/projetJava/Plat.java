
public class Plat {

	//atributs
	private Integer idPlat;
	private String nomPlat;
	private double prix;
	private Integer conditionement;
	
	//constructeur
	public Plat(int idPlat, String nomPlat, double prix) {
		this.idPlat=idPlat;
		this.nomPlat=nomPlat;
		this.prix=prix;
	}
	
	//getters and setters
	public int getIdPlat() {
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
	public int getConditionement() {
		return conditionement;
	}
	public void setConditionement(int conditionement) {
		this.conditionement = conditionement;
	}
	
	//methodes
	public void afficherPlats(){
		System.out.println("id :"+idPlat+"nom: "+nomPlat+"prix: "+prix+"contitionement: "+conditionement);
	}
	public void afficherPrixConditionement(){
		System.out.println("conditionement: "+conditionement+"prix: "+getPrix)
	
}
