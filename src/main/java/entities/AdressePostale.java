package entities;

public class AdressePostale {

	public int numerodeRue;
	public String libelledelaRue;
	public int codePostale;
	public String ville;

	
	public AdressePostale (int numerodeRue,String libelledelaRue,int codePostale,String ville){
		this.numerodeRue = numerodeRue;
		this.libelledelaRue = libelledelaRue;
		this.codePostale = codePostale;
		this.ville = ville;
		
		
	}
	
}
