import java.util.Scanner;




class marks{
int physics_m,bio_m,math_m;


 marks(int a, int b,int c){

     System.out.println(a+b+c) ;
     
     
    }
    
    
}

public class HamzaMehmood_Assignment2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("The sum of marks of three subjects of student 1 is " );
        input.nextInt()
        marks s1;
        s1 = new  marks(s1.physics_m = input.nextInt(),s1.physics_m = input.nextInt(),s1.math_m = input.nextInt());
        System.out.print("The sum of marks of three subjects of student 1 is " );
        marks s2 = new  marks(s2.bio_m = input.nextInt(),s2.physics_m = input.nextInt(),s2.math_m = input.nextInt());
        
        
        
    }

}
