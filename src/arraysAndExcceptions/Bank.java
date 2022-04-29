package arraysAndExcceptions;

public class Bank {
	int balance=100;
	public void withdraw(int amount) throws InsufficientFundException {
		if(balance < amount) {
			String message="bank balance is low";
			InsufficientFundException ex=new InsufficientFundException(message);
			// i wish to cause program to fail on this line
			throw ex;
		}
		balance=balance-amount;
		System.out.println("your latest balance is :"+balance);
	}
}
