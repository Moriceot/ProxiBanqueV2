package persistance;



import model.*;

public interface ConseillerDAO {

	public void save(Conseiller c);

	public Conseiller findById(int id);

	public void delete(int id);

//	public List<Conseiller> findAll();

	public void addClient(int id, Client e);
	// public void updateConseiller(String nom, String prenom);

}
