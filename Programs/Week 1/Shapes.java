
import java.util.Scanner;

    class Rectangle {
    float Height;
    float Width;
    float Length;
  
    void Rectangle_area() {

        System.out.println("The area of Rectangle is" + (Height * Length * Width));
    }
}
        
        class Square {
            float Width;
            float Length;
        
            void Square_area() {
        
                System.out.println("The area of Square is" + (Length * Width));
        
            }
        }


        class Circle {
            float pi = 3.14f;
            float Radius;
        
            void Circle_area() {
        
                System.out.println("The area of Circle is" + (pi * Radius * Radius));
        
            }}


     public class Shapes{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

       Rectangle big = new Rectangle();
        System.out.println(" ");
        System.out.println("Enter Width for Rectangle");
        big.Width = sc.nextFloat();
        System.out.println("Enter Length for Rectangle");
        big.Length = sc.nextFloat();
        System.out.println("Enter Height for Rectangle");
        big.Height = sc.nextFloat();
        System.out.println(" ");
        System.out.println("Area of Rectangle");
        big.Rectangle_area();

        Square small = new Square();
        System.out.println("Enter Width for Square");
        small.Width = sc.nextFloat();
        System.out.println("Enter Length for Square");
        small.Length = sc.nextFloat();
        System.out.println(" ");
        System.out.println("Area of Square");
        small.Square_area();

        Circle round = new Circle();
        System.out.println("Enter Radius for Circle");
        round.Radius = sc.nextFloat();

        System.out.println(" ");
        System.out.println("Area of Circle");
        round.Circle_area();

    
        }}





   
