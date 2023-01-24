
import java.util.Scanner;

class Car {

  int model;
  String car_name;
  int price;
  String owner;

  void detail() {

    System.out.println("Model: " + model);
    System.out.println("Car_name: " + car_name);
    System.out.println("Price: " + price);
    System.out.println("Owner: " + owner);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Car one = new Car();
    System.out.println("Enter Data for Car One");
    System.out.println("Enter MODEL");
    one.model = sc.nextInt();
    System.out.println("Enter Car name");
    one.car_name = sc.next();
    System.out.println("Enter PRICE");
    one.price = sc.nextInt();
    System.out.println("Enter Owner");
    one.owner = sc.next();
    
    Car two = new Car();
    System.out.println("Enter Data for Car Two");
    System.out.println("Enter MODEL");
    two.model = sc.nextInt();
    System.out.println("Enter Car name");
    two.car_name = sc.next();
    System.out.println("Enter PRICE");
    two.price = sc.nextInt();
    System.out.println("Enter Owner");
    two.owner = sc.next();
   
    System.out.println(" ");
    System.out.println("Data of car One is:-");
    one.detail();
    System.out.println(" ");
    System.out.println("Data of car Two is:-");
    two.detail();

  }
}