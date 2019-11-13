package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AdressePostale a = new AdressePostale (5,"tulipes",34000,"sete");
	 Personne p1= new Personne ("nom","prenom",a);
	
		
		
		Personne p2 = new Personne ("nom","prenom");
		
	}


}
