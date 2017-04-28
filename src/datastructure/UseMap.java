package datastructure;
import java.util.List;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		
		List<String> cityOfUSA = new ArrayList<String>(10);
        cityOfUSA.add("NeworkY");
        cityOfUSA.add("CAlifornia");
        cityOfUSA.add("FLorida");
        List<String> cityOfCanada = new ArrayList<String>();
        cityOfCanada.add("Toronto");
        cityOfCanada.add("Montreal");
        cityOfCanada.add("missisaga");
        List<String> cityOfUK = new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Oxford");
        cityOfUK.add("Liverpool");
        Map<String, List<String>> cityList = new LinkedHashMap<String,List<String>>();
        cityList.put("USA:", cityOfUSA);
        cityList.put("UK:", cityOfUK);
        cityList.put("Canada:", cityOfCanada);
        for(Map.Entry<String,List<String>> map:cityList.entrySet()) {
            List<String> cityName = map.getValue();
            System.out.print(map.getKey());
            for(String city:cityName){
                System.out.print(" " + city);
            }
            
            System.out.println();
        }

	}

}

