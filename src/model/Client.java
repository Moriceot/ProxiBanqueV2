package model;

/**
 * Cette classe représente l'entité Client qui hérite de la classe personne
 * 
 * @author Cyril
 *
 */
public class Client extends Personne {
	// Attributs**************************

	private String adresse;
	private int cp;
	private String ville;
	private String numTel;
	private CompteBancaire compte;
	private Conseiller conseiller;

	// Constructeur
	public Client(String nom, String prenom,String password, String adresse, int cp, String ville, String numero,
			CompteBancaire compte, Conseiller conseiller) {
		super(nom, prenom, password);
		this.adresse = adresse;
		this.cp = cp;
		this.numTel = numero;
		this.ville = ville;
		this.compte = compte;
		this.conseiller=conseiller;
		conseiller.getListeClients().add(this);

	}

	// Getters & Setters

	public CompteBancaire getCompte() {
		return compte;
	}

	public void setCompte(CompteBancaire compte) {
		this.compte = compte;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	@Override
	public String toString() {
		return "Informations concernant le client:\n " + super.toString() + "\n -adresse=" + adresse + ",\n -cp=" + cp
				+ ",\n -ville=" + ville + ",\n -numero=" + numTel + ",\n -compte n°:" + compte.getNumCompte();

	}

}
