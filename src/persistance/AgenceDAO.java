package persistance;


import model.*;

public interface AgenceDAO {
	public void save(Agence a);
	
	public Agence findById(String idAgence);

	public void delete(String idAgence);

//	public List<Agence> findAll();

//	public void addG(String idAgence, Conseiller e);
	
	public void addGerant(String id, Gerant g);
	
//	public void updateAgence(String nom, String prenom);
}
