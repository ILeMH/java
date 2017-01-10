package garage;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {
	
	String name;
	
	double prix = 120;

	BarreDeToit()
	{
		this.name = this.getClass().getName();
	}
	
	public Double getPrix()
	{
		return this.prix;
	}

}
