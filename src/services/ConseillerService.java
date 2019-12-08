package services;

//import java.util.List;

import model.*;

public interface ConseillerService {

	public void addConseiller(Conseiller c);

	public Conseiller findValidatedConseiller(int idConseiller);

//	public List<Conseiller> getAllConseiller();

	public void deleteConseiller(int idConseiller);

	public void addNewClient(int idConseiller, Client e);

}
