package garage;

public class MoteurHybride extends Moteur{

	MoteurHybride(String cylinde, Double prix) {
		super(cylinde, prix);
		this.type = TypeMoteur.HYBRIDE;
	}

}