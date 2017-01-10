package garage;

import java.io.Serializable;

public class GPS implements Option, Serializable {

	String name;
	
	double prix = 110;
	
	GPS()
	{
		this.name = "GPS";
	}
	
	public Double getPrix() {

		return this.prix;
	}

}
