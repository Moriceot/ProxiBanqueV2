package model;

import java.time.LocalDate;


public abstract class CompteBancaire {
	
	private int numCompte;
	private double solde;
	private LocalDate dateOuverture;
	private boolean compteEntreprise;
	private double decouvertAutorise;
	
	
	//Constructeur
	//TODO a supp
	public CompteBancaire() {
		this.numCompte = 60;
		this.solde = 500;
		this.dateOuverture = LocalDate.now();
		this.compteEntreprise = false;
		
	}
	
	public CompteBancaire(int numCompte, double solde, LocalDate dateOuverture, boolean compteEntreprise) {

		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.compteEntreprise = compteEntreprise;
	}

	

	//Getters Setters
	public int getNumCompte() {
		return numCompte;
	}



	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}



	public double getSolde() {
		return solde;
	}



	public void setSolde(double solde) {
		this.solde = solde;
	}



	public LocalDate getDateOuverture() {
		return dateOuverture;
	}



	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}



	public boolean isCompteEntreprise() {
		return compteEntreprise;
	}



	public void setCompteEntreprise(boolean compteEntreprise) {
		this.compteEntreprise = compteEntreprise;
	}
	
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

//	public  void setDecouvertAutorise(double decouvertAutorise) {
//		CompteBancaire.decouvertAutorise = decouvertAutorise;
//	}


	//Méthode d'affichage
	@Override
	public String toString() {
		return "CompteBancaire [numCompte=" + numCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture
				+ ", compteEntreprise=" + compteEntreprise + ", toString()=" + "]";
	}

	



	
	

}
