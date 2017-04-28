package reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import databases.ConnectDB;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		//Connection conn=null;
		ConnectDB connectsql=new ConnectDB();
		connectsql.
//end

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		String textFile="//Users//kafiluddin//Desktop//test.rtf";
		 FileReader fr=null;
         BufferedReader br=null;
         try{
       	  String text="";
       	  fr=new FileReader(textFile);
       	  br=new BufferedReader(fr);
       	  while((text=br.readLine())!=null){
       		  System.out.println(text);
       	  }
         }catch(Exception e){
       	  e.printStackTrace();
         }finally{
       	  if(br!=null){
       		  try{
       			  br.close();
       		  }catch(Exception a){
       			  a.printStackTrace();
       		  }
       		  if(fr!=null){
       			  try{
       				  
       			  }catch(Exception r){
       				  r.printStackTrace();
       				  
       			  }
       			  
       		  }
       	  }
         }

	
	}

}
