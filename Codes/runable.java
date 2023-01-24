public class runable{
	public static void main (String args[]){
		CurrentAccount ca = new CurrentAccount(50000);
		double amount = 6000;
		double currentBalance = ca.deposit(amount);
		System.out.println("Your deposited amounnt is "+amount+"\nYour new blanace is: "=currentBalance);
		amount = 4000;
		currentBalance = ca.Withdraw(amount);
		System.out.println("Your withdrawn amounnt is "+amount+"\nYour new blanace is: "=currentBalance);
		
		SavingAccount sa = new SavingAccount(70000);
		amount =8000;
		currentBalance = ca.deposit(amount);
		System.out.println("Your deposited amounnt is "+amount+"\nYour new blanace is: "=currentBalance);
		amount = 5000;
		currentBalance = ca.Withdraw(amount);
		System.out.println("Your withdrawn amounnt is "+amount+"\nYour new blanace is: "=currentBalance);
		
		
	}
}
		
		