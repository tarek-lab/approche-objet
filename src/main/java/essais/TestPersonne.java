package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AdressePostale a = new AdressePostale (5,"tulipes",34000,"sete");
		 AdressePostale b = new AdressePostale (6,"lies",34100,"sete");
	 Personne p1= new Personne ("nom","prenom",a);
	
		
		
		Personne p2 = new Personne ("nom","prenom");
		p2.changerNom("zen");
		p2.changerprenom("tarek");
		p2.changerAdresse(b);
		p2.afficheridentite();
	}


}
