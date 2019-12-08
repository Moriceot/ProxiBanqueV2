package services;

import model.*;

/**
 * @author Cyril & Jean-Michel
 *Interface listant les méthodes, à implémenter, nécessaires pour traiter l'opération "virement" 
 */
public interface VirementService {
	
	void virement(CompteBancaire debiteur, CompteBancaire crediteur, double montant);
}
