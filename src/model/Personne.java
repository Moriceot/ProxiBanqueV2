package model;

public abstract class Personne {
	//Attributs*****************************************
	private int id;
	private String nom;
	private String prenom;
	private String password;
	
	
	
	//Constructeur*****************************************
	public Personne(String nom, String prenom, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.password=password;
	}
	//Getters & Setters*****************************************
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//Méthode d'affichage*****************************************
	@Override
	public String toString() {
		return "-nom:" + nom + ",\n -prenom:" + prenom;
	}
	
	
	

}
