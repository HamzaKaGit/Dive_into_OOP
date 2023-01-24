import java.util.Scanner;
class income2
{
	public static void main(String arg[])
	{
	double tax=0,it;
	it=Double.parseDouble(arg[0]); 
	System.out.println("Annual Income is : "+it);
	if(it<=200000)
		tax=0;
	else if(it<=300000)
		tax=0.1*(it-200000);
	else if(it<=500000)
		tax=(0.2*(it-300000))+(0.1*100000);
	else if(it<=1000000)
		tax=(0.3*(it-500000))+(0.2*200000)+(0.1*100000);
	else
		tax=(0.4*(it-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
	System.out.println("Income tax amount is "+tax);
	}
}