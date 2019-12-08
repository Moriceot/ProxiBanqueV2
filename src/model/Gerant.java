package model;

import java.util.*;

public class Gerant extends Personne{

	
	//Attributs
	private Agence agence;
	private List<Conseiller>listeConseillers=new ArrayList<>();
	
	
	
	

	//Constructeur
	public Gerant(String nom, String prenom, String password,Agence a) {
		super(nom, prenom, password);
		this.agence=a;
		a.setGerant(this);
		// TODO Auto-generated constructor stub
	}
	
	//Getters Setters
	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public List<Conseiller> getListeConseillers() {
		return listeConseillers;
	}

	public void setListeConseillers(List<Conseiller> listeConseillers) {
		this.listeConseillers = listeConseillers;
	}
	

	@Override
	public String toString() {
		return "Gerant ["+super.toString() + ", getNom()="
				+ getNom() + ", getPrenom()=" + getPrenom() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
