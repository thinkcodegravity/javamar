package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;
public class CollectionTest {
	public static void main(String[] args) {
		
		String[] cart=new String[5];
		cart[0]="iphone";
		cart[1]="ipad";
		cart[2]="ipod";
		cart[3]="samsung";
		cart[4]="iphone";
		
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
