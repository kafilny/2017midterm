package datastructure;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;



import java.sql.ResultSet;

import java.sql.Statement;


import java.util.Properties;

import databases.ConnectDB;

public class UseArrayList {
	 public static ResultSet resultSet = null;

	public static void main(String[] args)throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		
		 ArrayList list=new ArrayList();
		    list.add(2);
		    list.add(3);
		    list.add(4);
		    list.add("kafil");
		    list.add(5);
		    list.add(6);
		    System.out.println(list);
		    System.out.println("size of array: "+list.size());
		    list.remove(5);
		    list.remove("kafil");
		    list.remove(2);
		    System.out.println("size of arraylist after remove: "+list.size());
		    System.out.println("removed list item"+list);
		    InsertDataFromArrayListToMySql(list, null, null);
		    getResultSetData(resultSet, null);
	}
		    
		    public static void InsertDataFromArrayListToMySql(List<Object> list,String tableName, String columnName)
		    {
		        try {
		        	 // connectToMySql();
		        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/myaraylist?useSSL=false","root","Comp1986");
					System.out.println("Connection success");
		            for(Object st:list){
		            	PreparedStatement  ps = conn.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
		                ps.setObject(1,st);
		                ps.executeUpdate();
		            }

		        } 
		        catch (SQLException e) {
		            e.printStackTrace();
		        } 
		    }
		    public static  List<String> getResultSetData(ResultSet resultSet2, String columnName) throws SQLException {
		        List<String> dataList = new ArrayList<String>();
		        while(resultSet.next()){
		            String itemName = resultSet.getString(columnName);
		            dataList.add(itemName);
		        }
		        return dataList;
		    }
	}


