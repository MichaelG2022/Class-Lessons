package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Week4Class {

	public static void main(String[] args) {
		
		// Have to use explicit data types in Collections - cannot use primitive data types
			// Integer, Boolean, etc.

		// 2 types of classes in Java: Concrete and Interface
		// List is an Interface class - cannot be implemented - has to use a Concrete class to implement
		// Concrete implementation is a class that represents an interface
			// Concrete classes: ArrayList, LinkedList
		List<String> temp = new ArrayList<String>();
		
		// List has limitations in how it can be accessed
		List<String> students = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			students.add("Student " + i);
		}
		// To find student 500, it takes a search to find that student
		// Would have to go through loop 500 times to find student 500 - Map would be much more efficient
		for (int i = 0; i < students.size(); i++) {
			if ("Student 500".equals(students.get(i))) {
				System.out.println("Student found");
			}
		}
		
		// Similar Class, but different concrete implementation
		// Vehicle v = new Car();
		// Vehicle v1 = new Bike();

		// Interface = Concrete Implementation
		Set<String> s = new HashSet<>();
		
		// Like a dictionary - Key = word, Value = Definition
		// Maps are much more efficient than List for finding a specific item
		// Interface = Concrete Implementation
		Map<String,String> studentMap = new HashMap<>();
		for (int i = 0; i < 1000; i++) {
			studentMap.put("Student " + i, "Student " + i);
		}
		if(studentMap.containsKey("Student 500")) {
			System.out.println("Student was found");
		}
		
		// Using default constructor of Student to instantiate an Object of Student
		//Student s = new Student();
		
		// Storing String and List inside a Map
			// List is empty
		
		//HashMap implementation is most often what we will use for Map
		Map<String, List<String>> studentsMap = new HashMap<String, List<String>>();
		studentsMap.put("A", new ArrayList<String>());
		studentsMap.put("B", new ArrayList<String>());
		studentsMap.put("C", new ArrayList<String>());
		
		// Prints out [] because the list is empty
		System.out.println(studentsMap.get("A"));
		
		studentsMap.get("A").add("Adam");
		studentsMap.get("A").add("Amber");
		
		studentsMap.get("B").add("Bob");
		studentsMap.get("B").add("Brian");
		
		studentsMap.get("C").add("Chris");
		studentsMap.get("C").add("Courtney");
		
		System.out.println(studentsMap.get("C").size());
		
		System.out.println(studentsMap.get("C"));
		for (String name : studentsMap.get("C")) {
			System.out.println(name);
		}
		
		// Demonstrating TreeMap - TreeMap will keep the natural order of the elements - aka ascending (0-9) (a-z), etc
		
		// Main methods for Map is put, get, containsKey, containsValue, empty
			// containsValue is not very useful for Maps because the value could be a List or Set
		
		Map<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(100, "100");
		tMap.put(10, "10");
		tMap.put(1000, "1000");
		
		// Goes through the keyset and returns the values
		for(Integer i : tMap.keySet()) {
			System.out.println(i);
		}
		
		// This does not work because we are using Integer to call String values
//		for(Integer i : tMap.values()) {
//			System.out.println(i);
//		}
		
		for(Map.Entry<Integer, String> e: tMap.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
		// List complexity is linear = very high usage - takes a lot of time
		// Map is Constant Time complexity because of the access method - always takes the same amount of time to find something
		
		// LEARN ABOUT BIG O NOTATION
		
		

	} // end MAIN

} // end CLASS
