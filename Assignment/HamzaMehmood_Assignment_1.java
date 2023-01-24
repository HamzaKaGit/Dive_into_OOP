// Author:-Hamza Mehmood SP-21-110
/* Program Title:-Write a program that contains variables to hold employee data like; employee Code,employee Name and date Of Joining.
Write a function that assigns the user defined values to these variables. Write another function that asks the user to enter current date and then checks if the employee tenure is more than three years or not. Call the functions in main.
Now write a runner class that declares two employee objects and check their tenure periods.*/

import java.util.Scanner;

class getdata {
    int code;
    String name;
    int date;
    int month;
    int year;
    int c_date;
    int c_month;
    int c_year;
    int tenure_y;

    void setdata() {

        System.out.println("Employee Code: " + code);
        System.out.println("Employee name: " + name);
        System.out.println("Date of Joining: " + date + "-" + month + "-" + year);
    }

    void current_date() {

        System.out.println("Current Date is: " + c_date + "-" + c_month + "-" + c_year);

    }

    void tenure_period() {
        int tenure_y = c_year - year;

        if (tenure_y == 1 && c_month == month && c_date == date) {

            System.out.println("Tenure Period of Employee  is " + tenure_y + " year which isn't more then 3 years ");
        } else if (tenure_y == 2 && c_month == month && c_date == date) {
            System.out
                    .println("Tenure Period of Employee is " + tenure_y + " years which isn't more then 3 years ");

        } else if (tenure_y >= 3 && c_month == month && c_date == date) {
            System.out.println("Tenure Period of Employee is " + tenure_y + " years which is equal to 3 years ");
        } else if (tenure_y < 3 && c_month == month) {

            System.out.println("Tenure Period of Employee is not more then 3 years");
        } else if (tenure_y > 3) {

            System.out.println("Tenure Period of Employee is more then 3 years");
        } else if (((tenure_y == 1 || tenure_y == 2 || tenure_y == 3) && (date<c_date || month<c_month))|| (date>c_date || month>c_month) ) {

            System.out.println("Tenure Period of Employee is less then 3 years");
        }

    }

}

public class HamzaMehmood_Assignment_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        getdata employee1 = new getdata();
        getdata employee2 = new getdata();
        System.out.println(" ");

        System.out.println("Enter Code for Employee One:");
        employee1.code = sc.nextInt();

        System.out.println("Enter Name of Employee One:");
        employee1.name = sc.next();

        System.out.println("Enter Date of Joining of Employee One in " + "DD/MM/YY Format:");
        employee1.date = sc.nextInt();
        employee1.month = sc.nextInt();
        employee1.year = sc.nextInt();

        System.out.println("Enter Current Date in DD/MM/YY Format for employee One");
        employee1.c_date = sc.nextInt();
        employee1.c_month = sc.nextInt();
        employee1.c_year = sc.nextInt();
        System.out.println("");

        System.out.println("Enter Code for Employee Two:");
        employee2.code = sc.nextInt();

        System.out.println("Enter Name of Employee Two: ");
        employee2.name = sc.next();

        System.out.println("Enter Date of Joining of Employee Two in " + "DD/MM/YY Format:");
        employee2.date = sc.nextInt();
        employee2.month = sc.nextInt();
        employee2.year = sc.nextInt();

        System.out.println("Enter Current Date in DD/MM/YY Format for employee Two");
        employee2.c_date = sc.nextInt();
        employee2.c_month = sc.nextInt();
        employee2.c_year = sc.nextInt();
        System.out.println("");

        System.out.println("Data of Employee One:");
        employee1.setdata();
        employee1.current_date();
        employee1.tenure_period();

        System.out.println(" ");
        System.out.println("Data of Employee Two:");
        employee2.setdata();
        employee2.current_date();
        employee2.tenure_period();
        System.out.println(" ");

    }

}
