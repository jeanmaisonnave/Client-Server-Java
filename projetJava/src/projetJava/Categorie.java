
public class Categorie {

	//attributs
		private Integer idCategorie;
		private String libCategorie;
		
	//constructeur
	public Categorie(Integer idCategorie, String libCategorie) {
		this.idCategorie=idCategorie;
		this.libCategorie=libCategorie;
	}
	
	//getters et setters
		public Integer getIdCategorie() {
			return idCategorie;
		}
		public void setIdCategorie(int idCategorie) {
			this.idCategorie = idCategorie;
		}
		public String getLibCategorie() {
			return libCategorie;
		}
		public void setLibCategorie(String libCategorie) {
			this.libCategorie = libCategorie;
		}		
}
