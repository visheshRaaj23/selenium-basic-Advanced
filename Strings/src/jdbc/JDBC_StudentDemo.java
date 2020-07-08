package jdbc;


//Data Access Model

public class JDBC_StudentDemo {

	public static void main(String[] args) {
	StudentDAO dao = new StudentDAO();
	dao.connectToDatabase();
	Student student=dao.getStudent(3);
	System.out.println("Department Name: "+student.dName);
	System.out.println("Student Name: "+student.sName);
	
	Student Std = new Student();
	Std.rollNumber=4;
	Std.dName = "Varsha";
	Std.dName = "EEE";
	dao.connectToDatabase();
	int rowsModified = dao.addStudents(Std.rollNumber, Std.dName, Std.dName);
	System.out.println(rowsModified);
	
	dao.connectToDatabase();
	Student student1=dao.getStudent(Std.rollNumber);
	System.out.println("Department Name: "+student1.dName);
	System.out.println("Student Name: "+student1.sName);
			
			
	
	
	
	}

}
