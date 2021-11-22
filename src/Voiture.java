
public class Voiture extends Vehicule {
	private byte nbrWheel ;
	private String typeCarburant ;
	private Short speedMax ;
	private float contenanceReservoir ; //Capacité maximale que peut contenir le réservoir du véhicule
	private float contenuReservoir ; 
	
	
	public Voiture() {
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

	public Voiture(byte nbrWheel, String typeCarburant, Short speedMax) {
		super();
		this.nbrWheel = nbrWheel;
		this.typeCarburant = typeCarburant;
		this.speedMax = speedMax;
	}
	
	public Voiture(String typeCarburant) {
		super();
		this.typeCarburant = typeCarburant;
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
	
	public int getNbreWheel() {
		return   4 ;
	}
	
	public String getTypeEssence() {
		return "essence";
	}
	public String getTypeDiesel() {
		return "diesel";
	}
	
	public Short speedMax() {
		return 130;
	}
	
	
}
