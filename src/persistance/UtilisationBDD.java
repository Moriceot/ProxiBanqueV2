package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 

public class UtilisationBDD {
	private static String url="http://localhost/phpmyadmin/db_structure.php?db=proxibanquev2";
	private static Connection cn=null;
	private static Statement st=null;
	private static ResultSet rs=null;
	
	//Méthode de connection à la BDD
	public static ResultSet select(String stmt) {
		try {
			Class.forName("mysql-connector-java-5.1.37-bin");
			cn= DriverManager.getConnection(url);
			st=cn.createStatement();
			String sql=stmt;
			rs=st.executeQuery(sql);
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				cn.close();
				st.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	
}
