package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo_Aa2 {

	public static void main(String[] args) {
		try {
			String dBURL="jdbc:mysql://localhost:3309/sakila";
			String userName = "root";
			String password = "Volvo9400$l";
			int userid=202;
			String userNme="Varsha M";
			String lastName="Udupa";
			String lastUpdate = "2020-01-23 04:34:33";
			String query = "INSERT INTO Sakila.Actor(actor_id,first_name,last_name,last_update) VALUES('"+userid+"','"+userNme+"','"+lastName+"','"+lastUpdate+"')";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dBURL, userName, password);
			Statement statement = connection.createStatement();
			int count = statement.executeUpdate(query);
			System.out.println("Row/s affected"+":"+ count);
			statement.close();
			connection.close();
			
		}catch(Exception exception) {
			System.out.println(exception);
			exception.printStackTrace();
		}

	}

}
