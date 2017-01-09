package garage;

public class SiegeChauffant implements Option{

	String name;
	
	double prix = 200;
	
	SiegeChauffant()
	{
		this.name = this.getClass().getName();
	}
	
	public Double getPrix()
	{
		return this.prix;
	}
}
