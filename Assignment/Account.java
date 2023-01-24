class acount {
    
         int a;
         int b;
         public void setData(int a ,int b){
         this.a = a;
         this.b = b; }
         public void showData(){
         System.out.println("Value of A ="+a);
         System.out.println("Value of B ="+b);}}
         public class Account{
         public static void main(String args[]){
         acount obj = new acount();
         acount obj1 = new acount();
         obj.setData(2,3);
         obj1.setData(5,7);
         obj.showData();
         obj1.showData();
         }}
         

