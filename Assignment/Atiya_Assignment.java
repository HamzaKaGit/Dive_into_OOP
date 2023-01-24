import java.util.Scanner;

class Owner {

  private String name;
  private int cnic;
  private int contact;

  Scanner ownerinput = new Scanner(System.in);

  public Owner() {
    System.out.println(" Getting Owner Details ");
  }

  public void setName() {
    System.out.println("Enter Owner Name: ");
    name = ownerinput.nextLine();
  }

  public String getName() {
    return name;
  }

  public void setCnic() {
    System.out.println("Enter your Cnic: ");
    cnic = ownerinput.nextInt();
  }

  public int getCnic() {
    return cnic;
  }

  public void setContact() {
    System.out.println("Enter no of Contacts: ");
    contact = ownerinput.nextInt();
  }

  public int getContact() {
    return contact;
  }

  public void Show_Owner_Info() {
    setName();
    setCnic();
    setContact();
    System.out.println(" Owner Name : " + this.getName());
    System.out.println(" Owner Cnic : " + this.getCnic());
    System.out.println(" Total Contacts : " + this.getContact());
  }
}

 class Car_Ownership {

  private String make;
  private int model;
  private int reg_no;

  Scanner carinput = new Scanner(System.in);

  public Car_Ownership() {
    System.out.println(" Displaying Car Details ");
  }

  public void setMake() {
    System.out.println("Enter Make Name: ");
    make = carinput.nextLine();
  }

  public String getMake() {
    return make;
  }

  public void setModel() {
    System.out.println("Enter Model no : ");
    model = carinput.nextInt();
  }

  public int getModel() {
    return model;
  }

  public void setReg_no() {
    System.out.println("Enter Model no : ");
    reg_no = carinput.nextInt();
  }

  public int getReg_no() {
    return reg_no;
  }

  public void Set_Type() {
    int a = 0;
    int b = 1;
    int handle_type;
    String body_type;
    System.out.print("How this Vehicle can be Handle? ");
    System.out.println("Press '0' for Steering Wheel or '1' for Handle: ");
    handle_type = carinput.nextInt();
    System.out.print("What Would be the Type? ");
    body_type = carinput.nextLine();

    if (handle_type == a) {
      System.out.println(
        "The Vehicle is Drive by Steering Wheel and has " +
        body_type +
        " Body Type."
      );
    } else {
      System.out.println(
        "The Vehicle is Drive be Handle and has " + body_type + " Body Type."
      );
    }
  }

  public void Show_Car_Info() {
    setMake();
    setModel();
    setReg_no();
    Set_Type();
    System.out.println(" Car Make : " + this.getMake());
    System.out.println(" Car Model : " + this.getModel());
    System.out.println(" Registration No : " + this.getReg_no());
  }
}

 class Mobile_Ownership {

  private String name;
  private int screen_size;

  Scanner mobinput = new Scanner(System.in);

  public Mobile_Ownership() {
    System.out.println(" Displaying Mobile Details ");
  }

  public void setName() {
    System.out.println("Enter Mobile Name: ");
    name = mobinput.nextLine();
  }

  public String getName() {
    return name;
  }

  public void setScreen() {
    System.out.println("Enter Enter Screen Size: ");
    screen_size = mobinput.nextInt();
  }

  public int getScreen() {
    return screen_size;
  }

  public void Show_Mobile_Info() {
    setName();
    setScreen();
    System.out.println(" Mobile Name : " + this.getName());
    System.out.println(" Screen Size : " + this.getScreen());
  }
}

public class Atiya_Assignment {

  public static void main(String[] args) {
    Owner o1 = new Owner();
    o1.Show_Owner_Info();
    Car_Ownership c1 = new Car_Ownership();
    c1.Show_Car_Info();
    Mobile_Ownership m1 = new Mobile_Ownership();
    m1.Show_Mobile_Info();
  }
}
