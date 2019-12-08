package model;

import java.time.LocalDate;


public class Agence {
	private String id;
	private LocalDate dateCreation;
//	private List<Conseiller> listeConseiller = new ArrayList<>();
	private Gerant gerant;

	//Constructeur
	public Agence(String id, LocalDate dateCreation) {

		this.id = id;
		this.dateCreation = dateCreation;
	}
	
	
	
	//Getters Setters
	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
		gerant.setAgence(this);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}


//	public List<Conseiller> getListeConseiller() {
//		return listeConseiller;
//	}
//
//	public void setListeConseiller(List<Conseiller> listeConseiller) {
//		this.listeConseiller = listeConseiller;
//	}

}
