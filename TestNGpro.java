package pom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.testng.annotations.Test;

public class TestNGpro {

	@Test
	public void runTest() {		
	
	        List<String> names = new ArrayList<>();
	        names.add("abc");
	        names.add("kkk");
	        names.add("ABC");
	        names.add("&*^$&%^(^(");
	        names.add("oooq");
	        names.add("jkjkljkl");
	        names.add("nbhjereendkd86");
	        names.add("abc");
	        names.add("sss");

	        // Count occurrences of each name
	        Map<String, Integer> nameCountMap = countNames(names);

	        // Print the results
	        for (Entry<String, Integer> entry : nameCountMap.entrySet()) {
	        	System.out.println("Name: " + entry.getKey() + ", Count: " + entry.getValue());
	        }
}

	    // Method to count names
	    public static Map<String, Integer> countNames(List<String> names) {
	        Map<String, Integer> nameCountMap = new HashMap<>();
	        
	        for (String name : names) {
	            // If the name is already in the map, increment its count
	            if (nameCountMap.containsKey(name)) {
	                nameCountMap.put(name, nameCountMap.get(name) + 1);
	            } else {
	                // If the name is not in the map, add it with count 1
	                nameCountMap.put(name, 1);
	            }
	        }
	        
	        return nameCountMap;
	    }
	
}

