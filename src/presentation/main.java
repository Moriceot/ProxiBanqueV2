package presentation;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

import persistance.UtilisationBDD;

public class main {

	public static void main(String[] args) {
		
			ResultSet userBDD = UtilisationBDD.select("SELECT `id` FROM `conseiller` WHERE 'id'=" + 1);
			ResultSet pwdBDD = UtilisationBDD.select("SELECT `Password` FROM `conseiller` WHERE 'id'=" + 1);
			System.out.println(userBDD);
			System.out.println(pwdBDD);
			

		
		

	}

}
