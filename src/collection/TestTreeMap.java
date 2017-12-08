package collection;

import java.util.TreeMap;

public class TestTreeMap {
	
	public static void main(String[] args){
		
		TreeMap<Employee, Integer> tMap = new TreeMap<Employee, Integer>();  // Key class must implement comparable interface and define proper 
		Employee e1 = new Employee(5);
		Employee e2 = new Employee(6);
		Employee e3 = new Employee(45);
		Employee e4 = new Employee(1);
		
        tMap.put(e1, 5);	
        tMap.put(e2, 6);	
        tMap.put(e3, 7);
        tMap.put(e4, 7);
        System.out.println(tMap);
	}

}
