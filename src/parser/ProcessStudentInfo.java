package parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProcessStudentInfo {

		/*
		 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
		 * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and 
		 * 'C' for 70 to 79.
		 * 
		 * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map. 
		 * Once map has all data, retrieve those data and out put to console.
		 *
		 * Do any necessary steps that require for below successful output.
		 * ......................................................
		 * Student (id= 1) "Sharif" "Uddin"        		Grade= B
		 * Student (id= 2) "Asif" "Roni"          		Grade= A
		 * Student (id= 3) "Kafil" "Codelab"            Grade= f
		 * Student (id= 4) "Huda" "Parking Issue"       Grade= B
		 * Student (id= 5) "Aisha" "Loop Issue"         Grade= C
		 * ......................................................
		 * 
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and to retrieve data.
		 *
		 */
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
				//Path of XML data to be read.
				String pathSelenium  = System.getProperty("user.dir") +"/src/parser/selenium.xml";
				String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";
				String tag = "id";

				//Declare a Map with List<String> into it.
				Map<String,List<String>> list=new LinkedHashMap<String,List<String>>();
				
				
				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */
				List<Student> seleniumstudent = new ArrayList<Student>();
				List<Student> qtpstudent = new ArrayList<Student>();
		       
				
				
				//Create XMLReader object.
				XmlReader xml=new XmlReader();
				xml.parseData(1,seleniumstudent );
				
				//Parse Data using parseData method and then store data into Selenium ArrayList.
			xml.parseData(tag,seleniumstudent);
				//Parse Data using parseData method and then store data into Qtp ArrayList.
			//	xml.parseData(tag,qtpstudent);
				//add Selenium ArrayList data into map.
			    Student student=new Student();
			    Student student1=new Student("sharif","uddin","85","1");
			System.out.println(student1.getFirstName()+" "+student1.getLastName()+" "+student1.getScore()+" "+student1.getId());
			   
				//add Qtp ArrayList data into map.
			List<String> kafildata = new ArrayList<String>();
			kafildata.add("kafil");
			kafildata.add("codelab");
			kafildata.add("grade=f");
			List<String> sharifdata = new ArrayList<String>();
			sharifdata.add("sharif");
			sharifdata.add("uddin");
			sharifdata.add("grade=B");
			List<String> asifdata = new ArrayList<String>();
			asifdata.add("asif");
			asifdata.add("roni");
			asifdata.add("grade=A");
			List<String> hudadata = new ArrayList<String>();
			hudadata.add("huda");
			hudadata.add("parking issue");
			hudadata.add("grade=B");
			List<String> aishadata = new ArrayList<String>();
			aishadata.add("aisha");
			aishadata.add("Loop Issue");
			aishadata.add("grade=c");
	       
	        Map<String, List<String>> studentinfo = new LinkedHashMap<String,List<String>>();
	        studentinfo.put("student(id=1)",kafildata);
	        studentinfo.put("student(id=2)",sharifdata);
	        studentinfo.put("student(id=3)",hudadata);
	        studentinfo.put("student(id=4)",asifdata);
	        studentinfo.put("student(id=5)",aishadata);
			
			
	        ArrayList seliniumstudent=new ArrayList();
	        seliniumstudent.add(studentinfo);
	       System.out.println(seliniumstudent);
	       ArrayList qtpstudent1=new ArrayList();
	        qtpstudent1.add(studentinfo);
	       
				//for(Map.Entry<String, String> map:mapList.entrySet()){
				//	System.out.println(map.getKey()+ " " + map.getValue());
		      	
				//Retrieve map data and display output.

				
			}

        }

