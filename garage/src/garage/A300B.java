package garage;

import java.util.ArrayList;

public class A300B extends Vehicule{

	A300B()
	{
		this.options = new ArrayList<Option>();
		this.nomMarque = Marque.PIGEOT;
		this.nom = "A300B";
	}
}
