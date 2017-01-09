package garage;

public class Climatisation implements Option{

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
