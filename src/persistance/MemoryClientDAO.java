package persistance;

import java.util.*;

import model.*;


public class MemoryClientDAO implements ClientDAO{
	//Attributs
	private static final Map<Integer,Client> DB = new HashMap<>();
	private static int id=0;

	//Methodes
	@Override
	public void save(Client c) {
		c.setId(id);
		DB.put(id, c);
		id++;		
	}

	@Override
	public Client findById(int id) {
		return DB.get(id);
	}

	@Override
	public void delete(int id) {
		DB.remove(id);
	}

	@Override
	public List<Client> findAll() {
		return new ArrayList<Client>(DB.values());
	}

	@Override
	public void updateClient(int id,String nom, String prenom, String adresse, int cp, String ville, String numTel, CompteBancaire compte,Conseiller conseiller) {
		Client c = DB.get(id);
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAdresse(adresse);
		c.setNumTel(numTel);
		c.setCp(cp);
		c.setVille(ville);
		c.setCompte(compte);
		c.setConseiller(conseiller);
		
		
	}

	
}
