import java.lang.ArithmeticException;
public class LogicalDemo {
    public static void main(String[] args) 
    {
        int n = 2;
        if (n != 0 && n / 0 > 10)
            System.out.println("This is True");
        else
            System.out.println("This is False");

    }
}
