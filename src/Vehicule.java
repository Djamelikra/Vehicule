import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class Vehicule {
	private byte nbrWheel ;
	private String typeCarburant ;
	private Short speedMax ;
	private float contenanceReservoir ; //Capacité maximale que peut contenir le réservoir du véhicule
	private float contenuReservoir ; //Contenu du réservoir du véhicule à l'instant t 
	
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehicule(byte nbrWheel, String typeCarburant, Short speedMax, float contenanceReservoir,
			float contenuReservoir) {
		super();
		this.nbrWheel = nbrWheel;
		this.typeCarburant = typeCarburant;
		this.speedMax = speedMax;
		this.contenanceReservoir = contenanceReservoir;
		this.contenuReservoir = contenuReservoir;
	}

	public Vehicule(String typeCarburant, float contenanceReservoir, float contenuReservoir) {
	super();
	this.typeCarburant = typeCarburant;
	this.contenanceReservoir = contenanceReservoir;
	this.contenuReservoir = contenuReservoir;
}


	public byte getNbrWheel() {
		return nbrWheel;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}
	
	public String setTypeCarburant(String newTypeCarburant) {
		return this.typeCarburant = newTypeCarburant;
	}

	public Short getSpeedMax() {
		return speedMax;
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
	
	public float setContenuReservoir(float newContenuReservoir) {
		return this.contenuReservoir = newContenuReservoir;
	}

	

	public void fairePlein(Pompe gasPump) {
		//Pour éviter de mélanger essence et gaz oil:
		float quantity = this.getContenanceReservoir()-this.getContenuReservoir();
		if (!(this.typeCarburant.equals(gasPump.getTypeCarburant()))) {
			System.out.println("STOP ! Le type de carburant est incompatible avec celui de votre véhicule !");
		}else {
			//On enlève autant d'essence à la Pompe:
			gasPump.setContenu(gasPump.getContenu() - quantity);
			//On affiche la quantité de carburant délivrée
			if (quantity > 0) {
				System.out.println("Vous avez rempli votre réservoir de : " + quantity + " litres.");
			}else {
				System.out.println("Le réservoir est plein, vérifier le avant de vous déplacer à la pompe !");
			}
			//On affiche la quantité de carburant disponible à la pompe
			System.out.println("Il reste dans la pompe: " + (gasPump.getContenu() - quantity) + "Litres");
		}
		
	}
	
	
}
