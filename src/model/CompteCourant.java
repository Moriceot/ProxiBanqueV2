package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompteCourant extends CompteBancaire{

	private double decouvertAutorise = -1000.0;
	private List<CarteBancaire> cb = new ArrayList<CarteBancaire>();
			
	//Constructeur
	public CompteCourant(int numCompte, double solde, LocalDate dateOuverture, boolean compteEntreprise) {
		super(numCompte, solde, dateOuverture, compteEntreprise);
	}

	//GETTERS SETTERS
	public List<CarteBancaire> getCb() {
		return cb;
	}

	public void setCb(List<CarteBancaire> cb) {
		this.cb = cb;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	
	

}
