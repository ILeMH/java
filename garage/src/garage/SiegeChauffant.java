package garage;

public class SiegeChauffant implements Option{

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
