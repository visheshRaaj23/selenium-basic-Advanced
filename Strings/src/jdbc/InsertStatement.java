package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class InsertStatement {

	public static void main(String[] args) {
		
		Connection connection = DatabaseUtil.getConnection(DataBaseType.MYSQL_DB);
		
		List<String> employeeData = new ArrayList<String>();
		
		employeeData.add("INSERT INTO DELDB.EMPLOYEE1 VALUES('VISHESH RAAJ','VISHESH','UDUPA','22576','SYNECHRON','2020-11-11',20000,'MARRIED')");
		employeeData.add("INSERT INTO DELDB.EMPLOYEE1 VALUES('SUPRIYA SHANKAR','SUPRIYA','SHANKAR','22577','MPHASIS','2019-04-12',22000,'MARRIED')");
		employeeData.add("INSERT INTO DELDB.EMPLOYEE1 VALUES('SRUTHIMOL CHACKO','SRUTHIMOL','CHACKO','22578','DANSKEIT','2019-01-24',24000,'MARRIED')");
		
		Iterator<String> record = employeeData.iterator();
		
		while(record.hasNext()) {
		Statement statement;
			try {
				statement = connection.createStatement();
				int noOfRowsInserted = statement.executeUpdate(record.next());
				System.out.println("Rows Inserted --->"+noOfRowsInserted);
				
			}catch(Exception exception) {
				exception.printStackTrace();
				System.out.println(exception);
			}
		}
		
		
		

	}

}
