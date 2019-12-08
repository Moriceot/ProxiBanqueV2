package persistance;

import java.util.HashMap;
import java.util.Map;

import model.*;

public class MemoryAgenceDAO implements AgenceDAO{
	//Attributs
	private Map<String, Agence> DB =new HashMap<String, Agence>();
	
	@Override
	public void save(Agence a) {
		DB.put(a.getId(), a);
					
	}
	
	@Override
	public Agence findById(String idAgence) {
		return DB.get(idAgence);
	}

	@Override
	public void delete(String idAgence) {
		DB.remove(idAgence);
		
	}

//	@Override
//	public List<Agence> findAll() {
//		
//		return new ArrayList<Agence>(DB.values());
//	}

//	@Override
//	public void addConseiller(String idAgence, Conseiller e) {
//		Agence a =this.findById(idAgence);
//		a.getListeConseiller().add(e);
//	}

	@Override
	public void addGerant(String idAgence, Gerant g) {
		Agence a =this.findById(idAgence);
		a.setGerant(g);
	}

	

}
