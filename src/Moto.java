
public class Moto extends Vehicule{
	private byte nbrWheel ;
	private String typeCarburant ;
	private Short speedMax ;
	private float contenanceReservoir ; //Capacité maximale que peut contenir le réservoir du véhicule
	private float contenuReservoir ; 
	
	
	
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public float getContenanceReservoir() {
		return contenanceReservoir;
	}


	public float setContenanceReservoir(float contenanceReservoir) {
		return this.contenanceReservoir = contenanceReservoir;
	}


	public float getContenuReservoir() {
		return contenuReservoir;
	}


	public float setContenuReservoir(float contenuReservoir) {
		return this.contenuReservoir = contenuReservoir;
	}

	public byte getNbrWheel() {
		return nbrWheel;
	}
	public String getTypeCarburant() {
		return typeCarburant;
	}
	public Short getSpeedMax() {
		return speedMax;
	}
	
	public int nbrWheel() {
		return  2 ;
	}
	
	public String typeEssence() {
		return "essence";
	}
	public Short speedMax() {
		return 130;
	}
	
	
}
