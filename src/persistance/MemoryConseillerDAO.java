package persistance;

import java.util.HashMap;
import java.util.Map;

import model.*;

public class MemoryConseillerDAO implements ConseillerDAO{

	private static final Map<Integer,Conseiller> DB = new HashMap<>();
	private static int id=0;
	
	@Override
	public void save(Conseiller c) {
		c.setId(id);
		DB.put(id, c);
		id++;
		
	}

	@Override
	public Conseiller findById(int id) {
		return DB.get(id);
	}

	@Override
	public void delete(int id) {
		DB.remove(id);
		
	}

//	@Override
//	public List<Conseiller> findAll() {
//		return new ArrayList<Conseiller>(DB.values());
//	}

	@Override
	public void addClient(int id, Client e) {
		Conseiller c =this.findById(id);
		c.getListeClients().add(e);
		
		
		
	}
	
	

}
