package garage;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{

	String name;
	
	double prix = 60;
	
	VitreElectrique()
	{
		this.name = this.getClass().getName();
	}
	
	public Double getPrix() {
		return this.prix;
	}

}
