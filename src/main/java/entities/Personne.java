package entities;

import javax.print.attribute.standard.RequestingUserName;

public class Personne {

	public String nom;
	public String prenom;

	public AdressePostale adresse;

	public Personne() {

	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;

	}

	public void afficheridentite() {
		System.out.println(prenom + " " + nom.toUpperCase());
	}

	public void changerNom(String nom) {
		this.nom = nom;

	}

	public void changerprenom(String prenom) {
		this.prenom = prenom;
	}
	public void changerAdresse (AdressePostale adresse){
	    this.adresse = adresse;
	}
	public String recuperernom (){
		return nom;
	}
}
