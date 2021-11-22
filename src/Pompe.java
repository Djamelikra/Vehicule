
public class Pompe {
	private String typeCarburant ;
	private float contenance ;
	private float contenu ;
	
	public Pompe(String typeCarburant, float contenance, float contenu) {
		super();
		this.typeCarburant = typeCarburant;
		this.contenance = contenance;
		this.contenu = contenu;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String newTypeCarburant) {
		this.typeCarburant = newTypeCarburant;
	}

	public float getContenance() {
		return contenance;
	}

	public float getContenu() {
		return contenu;
	}

	public void setContenu(float newContenu) {
		this.contenu = newContenu;
	}
	
	
}
