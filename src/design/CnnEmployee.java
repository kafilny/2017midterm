package design;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CnnEmployee  {
	
	

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		
		Employee em=new EmployeeInfo();
		em.employeeId();
		em.employeeName();
		em.assignDepartment();
		em.assignDepartment();
		em.calculateSalary();
		em.benefitLayout();
		EmployeeInfo eminfo=new EmployeeInfo();
		eminfo.calculateSalary(40,20);
		eminfo.employeeof_cnn_money_dept();
		eminfo.employeeof_cnn_travel_dept();
		eminfo.employeeof_cnn_us_dept();
		eminfo.employeeof_cnn_world_dept();
		eminfo.calculateEmployeePension(40, 2);
		EmployeeInfo eminfo1=new EmployeeInfo(3);
		System.out.println(eminfo1.getEmployeeId());
		EmployeeInfo eminfo2=new EmployeeInfo("kafil",2);
		System.out.println(eminfo2.getName()+" "+eminfo2.getEmployeeId());
		Absemployee absem=new EmployeeInfo();
		absem.calculateSalary(40, 60);
		absem.employeeof_cnn_health_dept();
		
		InsertDataFromStringToMySql(null, null, null);

	}
	//store data to sql
	 public static void InsertDataFromStringToMySql(String ArrayData,String tableName, String columnName)
	    {
	        try {
	        	// connectToMySql();
	        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/myaraylist?useSSL=false","root","Comp1986");
				System.out.println("Connection success");
				PreparedStatement   ps = conn.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
	            ps.setString(1,ArrayData);
	            ps.executeUpdate();
	        } 
	        catch (SQLException e) {
	            e.printStackTrace();
	        
	        }
	    }
	 //retrive data from sql

}
