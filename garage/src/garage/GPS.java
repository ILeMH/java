package garage;

public class GPS implements Option {

	String name;
	
	double prix = 110;
	
	GPS()
	{
		this.name = this.getClass().getName();
	}
	
	public Double getPrix() {

		return this.prix;
	}

}
