package jdbc;

import java.sql.*;
import java.util.ArrayList;

public class Demo_Aa1 {

	public static void main(String[] args)  {
		
		try {
		String URL="jdbc:mysql://localhost:3309/Sakila";
		String username="root";
		String password="Volvo9400$l";
		//String query="Select * from sakila.actor where actor_id=201;";
		String query="Select * from Sakila.Actor;";
		Class.forName("com.mysql.jdbc.Driver");
		// TODO Auto-generated method stub
		Connection conn=DriverManager.getConnection(URL, username, password);
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(query);
		rs.next();
		ArrayList<String> array = new ArrayList<String>();
		/*while(rs.next()) {
			String firstName=rs.getString("first_name");
			
			array.add(firstName);
			System.out.println(firstName);
		}*/
		System.out.println(rs.getFetchSize());
		while(rs.next()) {
		String userData = rs.getInt(1) + ":" + rs.getString(2);
		System.out.println(userData);
		}
		/*if(array.contains("VISHESH RAAJ")) {
			System.out.println("Data is fetched from the Database");
		}else {
			System.out.println("Unable to fetch the data from the Database");
		}*/
	
		statement.close();
		conn.close();
		}catch(Exception exception) {
			System.out.println(exception);
			exception.printStackTrace();
		}
	}

}
