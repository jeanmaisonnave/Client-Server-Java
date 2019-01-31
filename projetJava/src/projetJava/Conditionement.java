
public class Conditionement {

	//attributs
	private Integer idConditionement;
	private String libConditionement;
	
	//constructeur
	public Conditionement(Integer idConditionement, String libConditionement) {
		this.idConditionement=idConditionement;
		this.libConditionement=libConditionement;
	}
	
	//getters and setters
	public Integer getIdConditionement() {
		return idConditionement;
	}
	public void setIdConditionement(int idConditionement) {
		this.idConditionement = idConditionement;
	}
	public String getLibConditionement() {
		return libConditionement;
	}
	public void setLibConditionement(String libConditionement) {
		this.libConditionement = libConditionement;
	}
}
