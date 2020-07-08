package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {

	Connection conn = null;

	public void connectToDatabase() {
		try {
			String dbURL = "jdbc:mysql://localhost:3309/World";
			String userName = "root";
			String password = "Volvo9400$l";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, userName, password);
		} catch (Exception exception) {
			System.out.println(exception);
			exception.printStackTrace();
		}
	}
	
	public int addStudents(int rollNumber,String StudentName,String DeptName) {
		int count=0;
		try {
		Student st = new Student();
		st.rollNumber = rollNumber;
		st.sName = StudentName;
		st.dName = DeptName;
		String query = "INSERT INTO World.Student(rollNumber,name,department) VALUES(?,?,?)";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1,st.rollNumber);
		statement.setString(2, st.sName);
		statement.setString(3, st.dName);
		 count = statement.executeUpdate();
		System.out.println("Row/s Modified" + ":"+count);
		statement.close();
		conn.close();
		
		}catch(Exception exception) {
			System.out.println(exception);
			exception.printStackTrace();
		}
		return count;
	}

	public Student getStudent(int rollNumber) {
		Student st = new Student();
		st.rollNumber = rollNumber;
		try {
			String query = "Select * from World.Student";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			rs.next();
			while (rs.next()) {
				if (rs.getInt(1) == rollNumber) {
					st.sName = rs.getString(2);
					st.dName = rs.getString(3);
				}
			}

		} catch (Exception exception) {
			System.out.println(exception);
			exception.printStackTrace();
		}
		return st;
	}
}
