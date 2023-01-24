// Author:-Hamza Mehmood
// Program Title:-
import java.util.Scanner;
public class Input{
public static void main(String[] args) {
System.out.println("Take input from user");
Scanner ss = new Scanner(System.in); 
System.out.println("Enter Number 1");
int a= ss.nextInt();
System.out.println("Enter Number 2");
int b= ss.nextInt();
int sum = a+b;
System.out.println("The sum of 2 num is " + sum);

}
}