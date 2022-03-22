package homeworkweek7;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        double empID,salary;
        String name;

        Scanner obj=new Scanner(System.in); //Scanner object creation

        System.out.println("Enter employee name: ");
        name=obj.nextLine(); //user input

        System.out.println("Enter employee ID  : ");
        empID=obj.nextInt(); //user input

        System.out.println("Enter employee basic salary : ");
        salary=obj.nextDouble(); //user input


        System.out.println("|------------------------------------------------|");
        System.out.println("|                Salary Slip                     |");
        System.out.println("| Employee Id                     :2564          |");
        System.out.println("| Employee Name                   :Jay           |");
        System.out.println("|------------------------------------------------|");
        System.out.println("| Basic Salary                     :25000.0      |");
        System.out.println("| HRA 10%                          :2500.0       |");
        System.out.println("| TA 8%                            :2250.0       |");
        System.out.println("| DA 9%                            :2000.0       |");
        System.out.println("| PF - 20&                         :5000.0       |");
        System.out.println("|------------------------------------------------|");
        System.out.println("| Gross Salary                     :26750.0      |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|------------------------------------------------|");












    }
}
