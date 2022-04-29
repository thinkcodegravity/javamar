package arraysAndExcceptions;

public class ExceptinoTest3 {

	public static void main(String[] args) {
	
		Bank b=new Bank();
		try {
			b.withdraw(150);
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
