
public class Plat {

	//atributs
	private int idPlat;
	private String nomPlat;
	private double prix;
	
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
	
	//methodes
	public void afficherPlats(){
		System.out.println("id :"+idPlat+"nom: "+nomPlat+"prix: "+prix);
	}
	
}
