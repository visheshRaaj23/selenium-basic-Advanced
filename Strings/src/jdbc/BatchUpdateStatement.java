package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BatchUpdateStatement {

	public static void main(String[] args)throws Exception {
		Connection connection = DatabaseUtil.getConnection(DataBaseType.MYSQL_DB);
		String employee_name = "VisheshRaaj";
		String firstName = "Vishesh";
		String lastName = "udupa";
		int employee_id = 1013;
		String company = "Synechron";
		Date hireDate = Date.valueOf("2020-01-23");
		double salary = 23000;
		String queryString = "INSERT INTO DELDB.EMPLOYEE1(EMPLOYEE_NAME,FIRST_NAME,LAST_NAME,EMPLOYEE_ID,COMPANY,HIRE_DATE,SALARY) VALUES(?,?,?,?,?,?,?)";
		Statement statement;
		try {
			statement = connection.createStatement();
			for (int i = 1; i < 100; i++) {
				statement.addBatch(queryString);
			}
			int rowsInserted[] = statement.executeBatch();
		
			for (int rowInserted : rowsInserted) {
				System.out.println(rowInserted + "I Love You Supriya!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
