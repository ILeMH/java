package garage;

import java.util.ArrayList;
import java.util.List;

public class Vehicule {
	
	Double prix;
	String nom;
	ArrayList<Option> options;
	Marque nomMarque;
	Moteur moteur;
	
	public String toString()
	{
		String op = "[";
		double prix = 0;
		for(Option v:options)
		{
			op+=" ";
			op+=v.getClass().getSimpleName()+"("+v.getPrix()+")"+" ";
			prix += v.getPrix();
		}
		op+="]";
		prix+=moteur.getPrix();
		return "Voiture "+nomMarque+" : "+this.nom+" "+this.moteur+op+" prix total : "+prix;
	}
	
	public void addOption(Option option)
	{
		this.options.add(option);
	}
	
	public Marque getMarque()
	{
		return this.nomMarque;
	}
	
	public List<Option> getOption()
	{
		return this.options;
	}
	
	public Double getPrix()
	{
		return this.prix;
	}
	
	public Moteur getmoteur()
	{
		return this.moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur=moteur;
	}


}
