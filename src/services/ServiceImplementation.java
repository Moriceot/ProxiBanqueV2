package services;

import java.util.List;

import model.*;
import persistance.*;

/**
 * @author Cyril & Jean-Michel Cette clase "ServiceImplementation" impl�mente
 *         toutes les m�thodes des interfaces "ClientService" et
 *         "VirementService". Elle sert d'interm�diaire entre l'IHM et la
 *         persistence pour transf�rer toutes les requ�tes utilisateurs telles
 *         que: -cr�er, supprimer, actualiser, rechercher un client...
 *         -op�rations bancaires (virement) -op�rations administratives (audit)
 */
public class ServiceImplementation implements GerantService, ClientService, VirementService, ConseillerService,AgenceService {

	// Attributs****************************************
	private ClientDAO cDAO = new MemoryClientDAO();
	private ConseillerDAO consDAO = new MemoryConseillerDAO();
	private AgenceDAO aDAO=new MemoryAgenceDAO();
	private GerantDAO gDAO=new MemoryGerantDAO();

	// Client********************************************************
	@Override
	public void addClient(Client c) {
		if (c != null) {
			cDAO.save(c);
		} else {
			System.out.println("Veuillez renseigner un client");
		}
	}

	@Override
	public Client findValidatedClient(int idClient) {
		return cDAO.findById(idClient);
	}

	@Override
	public List<Client> getAllClient() {
		return cDAO.findAll();
	}

	@Override
	public void deleteClient(int idClient) {
		cDAO.delete(idClient);
	}

	@Override
	public void updateClient(int idClient, String nom, String prenom, String adresse, int cp, String ville, String numTel,
			CompteBancaire compte,Conseiller conseiller) {
		cDAO.updateClient(idClient, nom, prenom, adresse, cp, ville, numTel, compte, conseiller);
	}

	// M�thodes virement ****************************************

	@Override
	public void virement(CompteBancaire debiteur, CompteBancaire crediteur, double montant) {
		// V�rification solde d�biteur apr�s op�ration
		double soldeFinal = debiteur.getSolde() - montant;

		if (soldeFinal < debiteur.getDecouvertAutorise()) {
			System.out.println("Virement impossible. Solde client trop faible : " + debiteur.getSolde());
		} else {
			debiteur.setSolde(soldeFinal);
			crediteur.setSolde(crediteur.getSolde() + montant);
			System.out.println("Virement effectu�");

		}
	}
	//Conseiller***********************************************************
	@Override
	public void addConseiller(Conseiller c) {
		if (c != null) {
			consDAO.save(c);
		} else {
			System.out.println("Veuillez renseigner un conseiller");
		}
	}

	@Override
	public Conseiller findValidatedConseiller(int idConseiller) {
		return consDAO.findById(idConseiller);
	}

//	@Override
//	public List<Conseiller> getAllConseiller() {
//		return consDAO.findAll();
//	}

	@Override
	public void deleteConseiller(int idConseiller) {
		consDAO.delete(idConseiller);

	}

	@Override
	public void addNewClient(int idConseiller, Client e) {
		consDAO.addClient(idConseiller, e);

	}
	//Agence*****************************************************
	@Override
	public void addAgence(Agence a) {
		if (a != null) {
			aDAO.save(a);
		} else {
			System.out.println("Veuillez renseigner une agence");
		}
		
	}

	@Override
	public Agence findValidatedAgence(String idAgence) {
		
		return aDAO.findById(idAgence);
	}

//	@Override
//	public List<Agence> getAllAgence() {
//		return aDAO.findAll();
//	}
	
	

	@Override
	public void deleteAgence(String idAgence) {
		aDAO.delete(idAgence);
		
	}

//	@Override
//	public void addNewConseiller(String idAgence, Conseiller e) {
//		aDAO.addConseiller(idAgence, e);
//		
//	}

	@Override
	public void addNewGerant(String idAgence, Gerant g) {
		aDAO.addGerant(idAgence, g);
	}

	
	
	//Gerant**********************************************************

	@Override
	public void addGerant(Gerant g) {
		if (g != null) {
			gDAO.save(g);
		} else {
			System.out.println("Veuillez renseigner un g�rant");
		}
	}


	@Override
	public void deleteGerant(int idGerant) {
		gDAO.delete(idGerant);
	}

	@Override
	public void addNewConseiller(int idGerant, Conseiller e) {
		gDAO.addConseiller(idGerant, e);
	}

	@Override
	public Gerant findValidatedGerant(int idGerant) {
		return gDAO.findById(idGerant);
	}

	

	
}
