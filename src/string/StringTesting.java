package string;

public class StringTesting {

	public static void main(String[] args) {
		String m=" JOhn doe ";
		System.out.println( m.trim() );
		System.out.println(m.toUpperCase());
		// substring method is OVERLOADED
		System.out.println(m.substring(3));// n doe
		System.out.println(m.substring(3,6)); // starting from
		// index 3 upto index 6(not including 6)
		
		
		String fullName="john doe";
		String [] nameDetails=fullName.split(" ");
		// nameDetails = 0-john... 1-doe
		System.out.println( nameDetails[0] );// john
		System.out.println( nameDetails[1] );// doe
//		System.out.println( nameDetails[2] );// ArrayIndexOutofBoundException
		
		
		String z="123 456 7890";
		System.out.println(z.replaceFirst(" ", ""));
		//
		String q="java";
		System.out.println(q.replaceAll("a", "b"));
		
		// 1234567890
		// 123 456 7890
		// 123-456-7890
		//(123)4567890
		String number="123 456-7890";
		System.out.println(   number.replaceAll(" ","").replaceAll("-","")
				.replaceAll("\\(", "").replaceAll("\\)", "")
				);
		
		
		String p="java";
		System.out.println(p.lastIndexOf("a"));
		
		
		
		String registerUserid="John";
		String loginUserid=new String("john");
		if(registerUserid.equalsIgnoreCase(loginUserid))
			System.out.println("they are same");
		else
			System.out.println("they are differnet");
		// password = security reason... upper case, lower case, number, special character
		String registerPassword="john1!";
		String loginPassword=new String("John1!");
		if(registerPassword.equals(loginPassword))
			System.out.println("they are same");
		else
			System.out.println("they are differnet");
		
		
		
		
		
		String n="john";
		System.out.println( n.indexOf("h"));
		
		
		
		String email="abc@gmail.com";
		if(email.indexOf("@")!=0 && email.contains("@") && email.endsWith(".com"))
			System.out.println("email is valid");
		else
			System.out.println("email is invalid");
		
		String firstName="john";
		String lastName=" doe";
		
		System.out.println( "welcome mr:" + firstName.concat(lastName));
		
		String a="john";	
		String b="john";	
		String c=new String("john");	
		String d=new String("john");	
			
		System.out.println(a);	
		System.out.println(b);	
		System.out.println(c);	
		System.out.println(d);	
		// do not use == for comparing string variables
		if(c.equals(d))
			System.out.println("they are same");
		else
			System.out.println("they are different");
	}

}
