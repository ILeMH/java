package garage;

public class MoteurDiesel extends Moteur{

	MoteurDiesel(String cylinde, Double prix) {
		super(cylinde, prix);
		this.type = TypeMoteur.DIESEL;
	}

}
