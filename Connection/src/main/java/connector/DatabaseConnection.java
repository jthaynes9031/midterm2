/**
 * 
 */
package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import connector.Employee;

/**
 * @author jthay
 *
 */
public class DatabaseConnection{
	
	Connection connection = null;

	
	// Constructor (connector method below main method )
	public DatabaseConnection() {

		String url = "jdbc:mysql://localhost:3306/midterm";
		String user = "root";
		String password = "Password1";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	
	//EVERYTHING RUNS ON HERE!!!
	// main method
	public static void main(String[] args) {
	
		Employee employeeObject = new Employee();
		Scanner input = new Scanner(System.in);
		connector();
		
		String i = input.nextLine();
		
		String m = "clock in or out";
		String j = "go to main";
		String f = "find employee";
		String a = "add employee";
		String d = "delete employee";
		String u = "update employee";

		
		if(i.contains(m)) {			
			employeeObject.employeeAtt();
		}
		else if(i.contains(f)) {
			employeeObject.findEmployee();
		}
		else if(i.contains(a)) {
			employeeObject.addEmployee();
		}
		else if (i.contains(d)) {
			employeeObject.deleteEmployee();			
		}
		else if (i.contains(u)) {
			employeeObject.updateEmployee();			
		}
		else if(i.contains(j)) {
			connector();
		}
		
	}
	
	//connector method
	public static void connector() {
		
		
		String url = "jdbc:mysql://localhost:3306/midterm";
		String user = "root";
		String password = "Password1";
		
		//Try statement to connect to database
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(url, user, password);
				    System.out.println("Welcome");				    
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
	}catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

}
