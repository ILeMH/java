package garage;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable{

	String name;
	
	double prix = 200;
	
	SiegeChauffant()
	{
		this.name = "Si�ge chauffant";
	}
	
	public Double getPrix()
	{
		return this.prix;
	}
}
