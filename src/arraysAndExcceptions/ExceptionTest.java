package arraysAndExcceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
	// abnoramlly/abrupt/failed terminate
	// graceful/succesfull termination
	int a; // default value 0
	static FacebookCustomer fbc = new FacebookCustomer(); // null

	public static void main(String[] args) {

		try {
			// null pointer exception
			// when applied dot on the right of a null variable
			System.out.println(fbc.school.toString());
			// mandatory block
			// write code that we suspect MIGHT fail
			System.out.println("1");
			// runtime exception
			// ArithmeticException
			int i = 10 / 0;// infinity

			String[] names = new String[4];// indexes are 0-3
			// runtime exception : NOT REQUIRED TO BE HANDLED
			// ArrayIndexOutOFBoundException
			System.out.println(names[5]);

			// compiletime/checked exception : HAS TO BE HANDLED
			File f = new File("S:/test.txt");
			// below line is creating file in hard drive
			// this drive location MIGHT NOT exist
			f.createNewFile();
		}
		// child/sub class
		catch (NullPointerException npe) {

		} catch (ArrayIndexOutOfBoundsException a) {

		} catch (IOException i) {

		} catch (Exception e) {

		} // parent/super class
		catch (Throwable t) {

		} 

		// exception buckets

		System.out.println(i);
		System.out.println("2");

	}

}
