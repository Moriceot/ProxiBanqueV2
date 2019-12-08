package services;



import model.*;

public interface GerantService {
	public void addGerant(Gerant g);

	public Gerant findValidatedGerant(int idGerant);

//	public List<Agence> getAllAgence();
		
	public void deleteGerant(int idGerant);

	public void addNewConseiller(int idGerant, Conseiller e);
	

}
