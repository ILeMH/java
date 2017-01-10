package garage;

import java.io.Serializable;

public class Climatisation implements Option, Serializable{

	String name;
	
	double prix = 70;
	
	Climatisation()
	{
		this.name = this.getClass().getName();
	}
	public Double getPrix()
	{
		return this.prix;
	}
}
