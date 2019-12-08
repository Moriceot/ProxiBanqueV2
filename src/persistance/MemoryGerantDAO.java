package persistance;

import java.util.HashMap;
import java.util.Map;

import model.*;

public class MemoryGerantDAO implements GerantDAO {
	//Attributs
	private Map<Integer,Gerant> DB=new HashMap<>();
	private static int id=0;
	
	@Override
	public void save(Gerant g) {
		g.setId(id);
		DB.put(id, g);
		id++;
		
	}

	@Override
	public Gerant findById(int idGerant) {
		
		return DB.get(idGerant);
	}

	@Override
	public void delete(int idGerant) {
		DB.remove(idGerant);
	}

	@Override
	public void addConseiller(int idGerant, Conseiller e) {
		Gerant g =this.findById(idGerant);
		g.getListeConseillers().add(e);
	}
	

}
