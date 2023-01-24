public class Account{
	private double balance;
	
	public void setbalance(double balance){
		this.balance = balance;
	}
	public double getbalance(){
		return this.balance;
	}
	public Account(){
	}
	public Account(double balance){
		this.balance = balance;
	}
	public double Deposit(double amount){
		this.balance = balance+amount;
		return this.balance;
	}
	public double Withdraw(double amount){
		this.balance = balance-amount;
		return this.balance;
	}
}
	
