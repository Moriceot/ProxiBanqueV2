package services;

import java.util.List;

import model.*;

public interface ClientService {
	public void addClient(Client c);
	public Client findValidatedClient(int id);
	public List<Client>getAllClient();
	public void deleteClient(int id);
	public void updateClient(int id,String nom, String prenom, String adresse, int cp, String ville, String numTel, CompteBancaire compte, Conseiller conseiller);
}
