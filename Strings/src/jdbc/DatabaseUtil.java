package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {

	private static final String ORACLE_USER = "hr";

	private static final String ORACLE_PASSCODE = "hr";

	private static final String ORACLE_CONNECTION_STRING = "jdbc:oracle:thin@localhost:3309:xe";

	private static final String MY_SQL_USER = "root";

	private static final String MYSQL_PASSCODE = "Volvo9400$l";

	private static final String MYSQL_CONNECTION_STRING = "jdbc:mysql://localhost:3309/sakila";

	public static Connection getConnection(DataBaseType databaseType) {

		Connection connection = null;

		switch (databaseType) {
		case MYSQL_DB: {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING, MY_SQL_USER, MYSQL_PASSCODE);
				break;
			} catch (Exception exception) {
				System.out.println(exception);
				exception.printStackTrace();
			}
		}
		case ORACLE_DB: {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(ORACLE_CONNECTION_STRING, ORACLE_USER, ORACLE_PASSCODE);
				break;
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}

		}
		default: {
			break;
		}
		}

		return connection;
	}
	
	public static void testOracleConnection() {
		Connection connection = null;
		connection = DatabaseUtil.getConnection(DataBaseType.ORACLE_DB);
		if(connection!=null) {
			System.out.println("Connected to Oracle DB");
		}
	}
	
	public static void testMYSQLConnection() {
		Connection connection = null;
		connection=DatabaseUtil.getConnection(DataBaseType.MYSQL_DB);
		if(connection!=null) {
			System.out.println("Connected to MYSQL DB");
		}
	}
}
