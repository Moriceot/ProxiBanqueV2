package services;

import model.*;

/**
 * @author Cyril & Jean-Michel
 *Interface listant les m�thodes, � impl�menter, n�cessaires pour traiter l'op�ration "virement" 
 */
public interface VirementService {
	
	void virement(CompteBancaire debiteur, CompteBancaire crediteur, double montant);
}
