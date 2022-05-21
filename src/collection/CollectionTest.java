package collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
public class CollectionTest {
	public static void main(String[] args) {
		int x=0;
		String y="jane";
		// library/inbuilt data types = dont need to write hashcode(categor) equals(dupliate)
		// dont need to write code for SORTING
		TreeSet<String> names=new TreeSet<String> ();
		names.add("john");  
		names.add("jane");
		names.add("jane");	   
		System.out.println(names);
		
		HashSet<Integer> a=new HashSet<Integer> ();
		a.add( 123 );  // INTEGER values allowed in collection of INTEGER
		a.add(x);	   // INTEGER variables allowed in collection of INTEGER	
	//	a.add("john"); // STRING values not allowed in collection of INTEGER
	//	a.add(y);      // STRING variables not allowed in collection of INTEGER
		
		// userdefined data types = need to write hashcode(categor) equals(dupliate)
		//							in your userdefined program
		// need to write sorting = implement Comparable interface
		TreeSet<Student> school=new TreeSet<Student> ();
		Student s1=new Student("john", 1);		
		Student s2=new Student("jane", 2);		
		Student s3=new Student("mike", 1);		
		Student s4=new Student("mike", 1);		

		school.add(s1); // STUDENT variable is allowed in collection of STUDENT
		school.add(s2); 
		school.add(s3); 
		school.add(s4); 
		// school.add( "john" ); // STRING values not allowed in collection of STUDENT
		
		System.out.println(school.size());
		
		
		
	  //HashMap<Key,Value>
		// treemap = sorted by KEY
		TreeMap<String,Integer> studentScore=new TreeMap<String,Integer> (); 
		studentScore.put("john", 55);
		studentScore.put("jane", 45);
		studentScore.put("mike", 35);
		System.out.println(  studentScore );
		/*
	
		// collections only work on object/complex data type
		// Wrapper class int=Integer, float=Float, boolean=Boolean,
		// char=Character , double=Double, byte=Byte, short=Short, long=Long
		// Object like features for primitive data type
		ArrayList<Integer> scores=new ArrayList<Integer>();
		//scores.add("john");
		scores.add(20);
		scores.add(30);
	
		
		int a=10; // primitive data type has literal value only
		Student s=new Student("john",1); // Object data type has sub-information(variables) 
								// and method
		// arrays only work on primitive/simple and object/complex data type
		int[] numbers=new int[5];
		numbers[0]=1234;
		
		String[] cart=new String[5];
		cart[0]="iphone";
		cart[1]="ipad";
		cart[2]="ipod";
		cart[3]="samsung";
		cart[4]="iphone";
		
		Product p1=new Product();
		Product p2=new Product();
		ArrayList<Product> shoppingCart=new ArrayList<Product> ();
		shoppingCart.add(p1);
		shoppingCart.add(p2);
		//shoppingCart.add("iphone"); // cannot add string value if collection is of Product
		
		Vector<String> collCart=new Vector<String>();
		// adding item in first come first serve basis
		collCart.add("iphone");
		collCart.add("ipad");
		collCart.add("ipod");
		System.out.println(collCart);// iphone,ipad,ipod
		// read items by index
		System.out.println(collCart.get(1));// ipad
		// insert items by index
		collCart.add(1,"sony");
		System.out.println(collCart);// iphone,sony,ipad,ipod
		System.out.println(collCart.get(1));// sony
		// delete by name
		collCart.remove("ipad");
		System.out.println(collCart);// iphone,sony,ipod
		// delete a name by its index
		collCart.remove(1);
		System.out.println(collCart); // iphone, ipod
		
		// add, remove, get,set
		// HashSet - "Unordered" = rearranging in same order and removing dup
		// takes time.. Hashset is fastest in sset category
		// LinkedHashset - "Ordered"
		// TreeSet - "Sorted"
		TreeSet<String> names=new TreeSet<String>();
		names.add("john");
		names.add("jane");
		names.add("john");
		names.add("andy");
		names.add("mike");
		names.remove("andy");
		System.out.println(names);
		
		
*/		
		
		
	}

}
