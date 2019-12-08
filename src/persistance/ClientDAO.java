package persistance;

import java.util.List;

import model.*;

public interface ClientDAO {
	
public void save(Client c);
	
	public Client findById(int id);
	
	public void delete(int id);
	
	public List<Client> findAll();
	
	public void updateClient(int id,String nom, String prenom, String adresse, int cp, String ville, String numTel, CompteBancaire compte,Conseiller conseiller);
	
}
