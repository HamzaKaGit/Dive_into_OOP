import java.util.Scanner;

class box{

double length,breadth;

box(double a,double b){

System.out.print(a*b);

}

}


public class question_1 {
    public static void main(String[] args) {
        
        System.out.print("Area of first rectangle: " );
        box r1= new box(7.0,4.0);
        System.out.println(r1);
        System.out.print("Area of Second rectangle: "  );
        box r2= new box(5.0,2.0);
        System.out.println("");
        System.out.print("Area of Third rectangle: " );
        box r3= new box(1.0,0.5);
        System.out.println("");
        System.out.print("Area of Four rectangle: "  );
        box r4= new box(13.0,7.0);
        System.out.println("");
    }
    
}
