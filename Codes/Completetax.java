public class Completetax extends Tax2021{
	public Completetax(double amount){
	super(amount);
	}
	public double extraIncomeTax(){
	return super.amount*11;
	}
}