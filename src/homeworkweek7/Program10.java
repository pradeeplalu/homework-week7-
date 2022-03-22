package homeworkweek7;

import java.util.Scanner;

public class Program10 {
    // main method
    public static void main(String[] args) {
        char ch;

        //create object for scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");// enter the first number

        int num1 = scan.nextInt();
        System.out.println("Enter the second number");// enter second number
        int num2 = scan.nextInt();

        System.out.println("Enter the operator you want(+,-,/,*):");// enter operator
        ch = scan.next().charAt(0);

        if (ch == '+') {
            System.out.println("Addition of " + num1 + "+" + num2 + " = " + (num1 - num2));
       //If- else statement
        } else if (ch == '-') {
            System.out.println("Substraction of " + num1 + "-" + num2 + " = " + (num1 - num2));
        } else if (ch == '/') {
            System.out.print("Division of " + num1 + "/" + num2 + " = " + (num1 / num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + "x" + num2 + " = " + (num1 * num2));
        }
           else{
                System.out.print("Operator is not available" );
           }

        }
    }




