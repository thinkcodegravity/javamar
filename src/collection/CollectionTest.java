package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;
public class CollectionTest {
	public static void main(String[] args) {
		
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
		
		// collections only work on object/complex data type
		// Wrapper class int=Integer, float=Float, boolean=Boolean,
		// char=Character , double=Double, byte=Byte, short=Short, long=Long
		// Object like features for primitive data type
		ArrayList<Integer> scores=new ArrayList<Integer>();
		scores.add("john");
		scores.add(20);
		scores.add(30);
		
		Product p1=new Product();
		Product p2=new Product();
		ArrayList<Product> shoppingCart=new ArrayList<Product> ();
		shoppingCart.add(p1);
		shoppingCart.add(p2);
		shoppingCart.add("iphone"); // cannot add string value if collection is of Product
		
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
		
		
		
		
		
	}

}
