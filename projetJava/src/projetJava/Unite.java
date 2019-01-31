package projetJava;

public class Unite {

	private int idUnite;
	public String nomUnite;
	
	public Unite(int idUnite, String nomUnite) {
		super();
		this.idUnite = idUnite;
		this.nomUnite = nomUnite;
	}

	public int getIdUnite() {
		return idUnite;
	}

	public void setIdUnite(int idUnite) {
		this.idUnite = idUnite;
	}

	public String getNomUnite() {
		return nomUnite;
	}

	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}
	
}
