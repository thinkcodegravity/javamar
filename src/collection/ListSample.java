package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class ListSample {
	public void listStudents()
	{
		System.out.println("\n \n \n");
		// List has 3 types - arraylist,linkedlist and vector.
		ArrayList<String> studentsCollection=new ArrayList<String> ();
		//LinkedList<String> studentsCollection=new LinkedList<String> ();
		//Vector<String> studentsCollection=new Vector<String> ();
		
		// add items to list collection
		studentsCollection.add("ram");
		studentsCollection.add("shyam");
		studentsCollection.add("laxman"); // set(2,"bharat");
		studentsCollection.add("laxman");
		
		/*
		 RHS can be 
			value of same type
			variable of same type = replace its value
			method call = assign returned result to LHS variable
			expression = solve expression to a single value
			new operator = Object data type initialization.. address where object
						was created in memory.. (Reference)
		 */
		// get size of list collection 
		int no_of_students=studentsCollection.size();
		//int no_of_students=4;
		System.out.println("List number of students:"+no_of_students);
		
		// get item from specific index ( not part of set collection )
		String firstStudent=studentsCollection.get(0);
		//String firstStudent="ram";
		System.out.println("List first student:"+firstStudent);
		
		// set item at specific index ( not part of set collection )
		studentsCollection.set(2, "bharat");

		// find the items index ( not part of set collection )
		int itemNo=studentsCollection.indexOf("ram");
		//int itemNo=0;
		System.out.println("List find index of an item:"+itemNo);
		
		// remove an item by index and by item
		// overloaded methods = polymorphism (many forms)... Doing the same function
		///													in many ways
		studentsCollection.remove(0); // ( not part of set collection )
		studentsCollection.remove("shyam");
		
		// iterate items. Read items from the collection list
		Iterator<String> readStudentsCollection=studentsCollection.iterator();
		while(readStudentsCollection.hasNext())
		{
			String studentName=readStudentsCollection.next();
			System.out.println("List student name:"+studentName);
		}
		// 0  , 1    , 2      , 3
		// ram, shyam, laxman, mike
		// for-each , enhanced for loop
		// for(int i=0;i<5;i++)

		// read all contents of collection
		for(String s:studentsCollection) {
			System.out.println(s);
		}
		
		// if u need customization in the process of reading
		for(int i=1;i<studentsCollection.size();i=i+2) {
			String s=studentsCollection.get(i);
			// String s=studentsCollection.get( 3  ); // replace variable value
			// String s="mike"; // replace methods result
			System.out.println(s);
		}
		// I , C , E = i-1, 1 < 4 = true , prints shyam
		// M , C , E = i-3, 3 < 4 = true , prints mike  
		// M , C , E = i-5, 5 < 4 = false
		
		// i=i+2 // i=3+2 // i=5
	}
}
