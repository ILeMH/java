package garage;
import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicule> voitures;
	
	public String toString()
	{
		String garage = "******************\nGarage Openclassroom\n************";
		String vcl = null;
		try{
			for(Vehicule v: voitures)
			{
				vcl = vcl + v.toString();
			}
		}catch (Exception e) {
			vcl = "Aucune voiture dans le garage !";
			return vcl+"\n"+garage;
		}
		return garage+"\n"+vcl;
	}
	

	public void addVoiture(Vehicule v) {
		this.voitures.add(v);
	}
}
