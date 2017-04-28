package math;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	
	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		 int lowest = array[0];
	       for(int i=1; i< array.length; i++)
	        {
	                if (array[i] < lowest)
	                        lowest = array[i];
	               }
	       System.out.println("Smallest Number is : " + lowest);
	       InsertDataFromArryToMySql(array, null, null);
	}

	 public static void InsertDataFromArryToMySql(int [] ArrayData,String tableName, String columnName)
	    {
	        try {
	        	 // connectToMySql();
	        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/myaraylist?useSSL=false","root","Comp1986");
				System.out.println("Connection success");

	            for(int n=0; n<ArrayData.length; n++){
	            	PreparedStatement ps = conn.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
	                ps.setInt(1,ArrayData[n]);
	                ps.executeUpdate();
	            }

	        }  catch (SQLException e) {
	            e.printStackTrace();
	        } 
	    }
		
		}
	


