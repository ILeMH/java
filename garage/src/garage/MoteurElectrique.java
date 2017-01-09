package garage;

public class MoteurElectrique extends Moteur{

	MoteurElectrique(String cylinde, Double prix) {
		super(cylinde, prix);
		this.type = TypeMoteur.ELECTRIQUE;
	}

}
