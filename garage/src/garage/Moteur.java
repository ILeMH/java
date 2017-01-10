package garage;

public abstract class Moteur {

	protected TypeMoteur type;
	protected String cylindre;
	protected Double prix;
	
	Moteur (String cylinde, Double prix)
	{
		this.cylindre = cylinde;
		this.prix = prix;
	}
	
	public String toString()
	{
		return "Moteur "+type+" "+cylindre+"("+ prix+"€)";
	}
	
	public Double getPrix()
	{
		return this.prix;
	}
	
	public void setPrix(double prix)
	{
		this.prix = prix;
	}
	
	public void setCylindre(String cylindre)
	{
		this.cylindre = cylindre;
	}
}
