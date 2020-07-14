package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_ResultSetScrolling extends Object {

	public static void main(String[] args) {
		fetchAllRecords();
	}

	public static void fetchAllRecords() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		try {
			connection = DatabaseUtil.getConnection(DataBaseType.MYSQL_DB);
			statement = connection.createStatement();
			resultset=statement.executeQuery("Select * from DELDB.EMPLOYEE1");
			while (resultset.next()) {
				System.out.println(resultset.getString("EMPLOYEE_NAME"));
				System.out.println(resultset.getInt("EMPLOYEE_ID"));
				System.out.println(resultset.getString("COMPANY"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				resultset.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
