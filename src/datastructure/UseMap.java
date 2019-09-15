package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		// create List to store Students name
		List<String> students = new ArrayList();
		students.add("Samian");
		students.add("Mafi");
		students.add("jayn");

		// create List to store Students departments
		List<String> departments = new ArrayList();
		departments.add("Computer Science");
		departments.add("Human resource");
		departments.add("Economics");

		// create List to store Students grade
		List<String> grade = new ArrayList();
		grade.add("B");
		grade.add("C");
		grade.add("A");


		//getting all information
		Map<String, List<String>> map = new HashMap<String,List<String>>();
		map.put("Students name", students);
		map.put("Students Departments", departments);
		map.put("Students Grade", grade);

		//for each loop
		for(Map.Entry key: map.entrySet()){
			System.out.println(key.getKey()+" "+key.getValue());
		}

		System.out.println("--------------------------------------------");
		//Iterator with for loop

		Iterator it =map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}



	}

}


