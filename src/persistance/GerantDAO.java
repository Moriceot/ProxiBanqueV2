package persistance;


import model.*;

public interface GerantDAO {
	public void save(Gerant g);

	public Gerant findById(int idGerant);

	public void delete(int idGerant);

//	public List<Gerant> findAll();

	public void addConseiller(int idGerant, Conseiller e);

	// public void updateGerant(String nom, String prenom);

}
