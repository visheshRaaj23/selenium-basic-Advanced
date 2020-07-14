package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class InsertPreparedStatement {

	public static void main(String[] args) throws Exception {
		Connection connection=DatabaseUtil.getConnection(DataBaseType.MYSQL_DB);
		String employee_name = "VisheshRaaj";
		String firstName = "Vishesh";
		String lastName = "udupa";
		int employee_id=1013;
		String company = "Synechron";
		Date hireDate = Date.valueOf("2020-1-23");
		double salary = 23000;
		String queryString = "INSERT INTO DELDB.EMPLOYEE1(EMPLOYEE_NAME,FIRST_NAME,LAST_NAME,EMPLOYEE_ID,COMPANY,HIRE_DATE,SALARY) VALUES(?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(queryString);
			for(int rows=1;rows<100;rows++) {
				preparedStatement.setString(1, employee_name+rows);
				preparedStatement.setString(2, firstName+rows);
				preparedStatement.setString(3, lastName+rows);
				preparedStatement.setInt(4,employee_id+rows);
				preparedStatement.setString(5, company);
				preparedStatement.setDate(6, hireDate);
				preparedStatement.setDouble(7, salary);
				int noOfRowsUpdated = preparedStatement.executeUpdate();
				System.out.println("No of Rows Updated"+noOfRowsUpdated);
				
			}
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		
		

	}

}
