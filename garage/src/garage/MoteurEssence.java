package garage;

public class MoteurEssence extends Moteur{

	MoteurEssence(String cylinde, Double prix) {
		super(cylinde, prix);
		this.type = TypeMoteur.ESSENCE;
	}

}
