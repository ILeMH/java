package garage;
import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicule> voitures;
	
	Garage()
	{
		this.voitures = new ArrayList<Vehicule>();
	}
	
	public String toString()
	{
		String garage = "*********************\nGarage Openclassroom\n*******************";
		for(Vehicule v : voitures)
		{
			garage+="\n"+v.toString();
		}
		return garage;
	}
	

	public void addVoiture(Vehicule v) {
		this.voitures.add(v);
	}
}
