package jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.jdbc.ScriptRunner;

public class ScriptRunnerUtil {

	public static void main(String[] args) {
		try {
			Connection connection = DatabaseUtil.getConnection(DataBaseType.MYSQL_DB);
			// Instantiating the script runner and associating it with the connection.
			ScriptRunner scriptRunner = new ScriptRunner(connection);

			/*
			 * Reader reader = new BufferedReader(new FileReader(
			 * "C:\\Users\\Vishesh and Varsha\\selenium-basic\\Strings\\src\\jdbc\\script-runner-util.sql"
			 * ));
			 */
			Reader reader = new BufferedReader(new FileReader(
					"C:\\Users\\Vishesh and Varsha\\selenium-basic\\Strings\\src\\jdbc\\script-mysql-employee-util.sql"));
			scriptRunner.runScript(reader);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
