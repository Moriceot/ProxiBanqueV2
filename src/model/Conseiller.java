package model;

import java.util.*;

public class Conseiller extends Personne{
	//Attributs
	private List<Client> listeClients=new ArrayList<Client>();
	private Gerant gerant;

	
	
	

	//Constructeur
	public Conseiller(String nom, String prenom,String password, Gerant gerant) {
		super(nom, prenom, password);
		this.gerant=gerant;
		gerant.getListeConseillers().add(this);
		
	}

	//Getters & Setters
	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}
	
	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	//Méthode d'affichage
	@Override
	public String toString() {
		return "Informations concernant le conseiller:\n "+super.toString()+"\n -liste des clients :"+listeClients.toString(); 
					
	}
	
	
}
