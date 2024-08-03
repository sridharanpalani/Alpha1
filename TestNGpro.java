package pom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGpro extends SpecificMethod {
	@BeforeTest
    public void setup() {
	  excelFile="Data";
}
	@Test(dataProvider = "fetchData")
	public void runTest(String[][] allData) {		
	
	       List<String> names = new ArrayList<>();
	       for (String[] rowData : allData) {
	            for (String name : rowData) {
	                if (name != null && !name.isEmpty()) { 
	                    names.add(name);
	                }
	            }
	        }

	        Map<String, Integer> nameCountMap = countNames(names);

	        for (Entry<String, Integer> entry : nameCountMap.entrySet()) {
	        	System.out.println("Name: " + entry.getKey() + ", Count: " + entry.getValue());
	        }
}
	

	    
	    public static Map<String, Integer> countNames(List<String> names) {
	        Map<String, Integer> nameCountMap = new HashMap<>();
	        
	        for (String name : names) {
	            if (nameCountMap.containsKey(name)) {
	                nameCountMap.put(name, nameCountMap.get(name) + 1);
	            } else {
	                nameCountMap.put(name, 1);
	            }
	        }
	        return nameCountMap;
	    }
	    
}

