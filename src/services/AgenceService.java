package services;

//import java.util.List;

import model.*;

public interface AgenceService {
	public void addAgence(Agence a);

	public Agence findValidatedAgence(String id);

//	public List<Agence> getAllAgence();
		
	public void deleteAgence(String id);

//	public void addNewConseiller(String id, Conseiller e);
	
	public void addNewGerant(String id, Gerant g);
}
