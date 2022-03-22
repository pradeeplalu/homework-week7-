package homeworkweek7;

import java.util.Scanner;

public class Program1 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// scanner object creation

        System.out.println("Enter number to test");//please enter a number
        int number = scan.nextInt();

        scan.close();

        //ternary operator to check number

        String result = number%2==0 ? "Even" : "Odd";// odd or even number

        System.out.println(number +" is "+ result);


    }
}
