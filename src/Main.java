
//Vehicule
public class Main {

	public static void main(String[] args) {
		Voiture car = new Voiture();
		//Faire varier les 3 paramètres suivants pour tester le code
		car.setTypeCarburant("essence");
		car.setContenuReservoir(10);
		car.setContenanceReservoir(60);
		//Fin paramètres
		Pompe pump = new Pompe("essence", 1000, 1000);
		car.fairePlein(pump);
	}

}
