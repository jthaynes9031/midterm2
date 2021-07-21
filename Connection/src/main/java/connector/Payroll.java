package connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Payroll extends Employee {
	DatabaseConnection databaseConn = new DatabaseConnection();
	Employee emp = new Employee();
	Scanner input = new Scanner(System.in);
	
	

	//possible constructor
	public Payroll() {
		
	}
	
	//set pay rate
	public void setPayrate(){
		
	}
	
	//retrieve employee pay rate
	public void payrate() {
		//find employee payrate
		try 
		{
		
		String payRate  ="SELECT * payroll WHERE first_name = ?";
		PreparedStatement statement = databaseConn.connection.prepareStatement(payRate);
		System.out.println("Enter First name");
		statement.setString(1, myObj.nextLine());
		ResultSet result1 = statement.executeQuery();
		while(result1.next()) {
			
			System.out.println("pay rate for who");
			String find = result1.getString(myObj.nextLine());
			System.out.println(find);	
		}
		
		}catch (Exception e) {
			e.printStackTrace();			
	}	
		
	}
	
	//net pay
	public void netPay() {
		//HOLD OFF
	}
	
	// Update Pay
	public void updatePay() {
		// ability to update payrate
	}
	
	//Add Pay
	public void addPay() {
		
	}
	
	//direct deposit boolean
	public void deposit() {
		
	}
	
	//gross Pay
	public void grossPay() {
		
	}

}
