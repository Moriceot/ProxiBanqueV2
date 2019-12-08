package model;

import java.time.LocalDate;

public class CompteEpargne extends CompteBancaire{

	private static double taux = 0.3;
	private double decouvertAutorise = 0.0;
	
	//Constructeur
	public CompteEpargne(int numCompte, double solde, LocalDate dateOuverture, boolean compteEntreprise) {
		super(numCompte, solde, dateOuverture, compteEntreprise);
	}

	public CompteEpargne() {
		super();
	}
	
	
	//Getters Setters
	public double getTaux() {
		return taux;
	}

	public static void setTaux(double taux) {
		CompteEpargne.taux = taux;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	
	
}
