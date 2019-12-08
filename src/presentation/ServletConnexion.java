package presentation;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistance.UtilisationBDD;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletConnexion() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response) Cette m�thode permet de v�rifier si le mot de passe et le user
	 *      sont valide et transf�re la requ�te � la page espace perso.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// R�cup�ration des donn�es renseign�es dans la page de connexion
		String user = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("en cours");
		// Recherche dans la BDD de l'id
		try {
			ResultSet userBDD = UtilisationBDD.select("SELECT `id` FROM `conseiller` WHERE 'id'=" + user);
			ResultSet pwdBDD = UtilisationBDD.select("SELECT `Password` FROM `conseiller` WHERE 'id'=" + user);

			String adresse;
			RequestDispatcher dispatcher;
			

			// V�rification param�tres d'identification
			if ((userBDD != null) && (pwd.equalsIgnoreCase(pwdBDD.getString(0)))) {
				adresse = "espace-conseillers.html";
				System.out.println("ok");
			} else {
				adresse = "connection.html";
				System.out.println("nok");
			}

			// Rerootage vers la page suivante
			dispatcher = request.getRequestDispatcher(adresse);
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
