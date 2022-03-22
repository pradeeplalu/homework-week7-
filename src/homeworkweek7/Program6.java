package homeworkweek7;

import java.util.Scanner;

public class Program6 {
    //main method
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);// create scanner object

        System.out.println("Enter a number: ");

        int num = reader.nextInt();

        if(num % 2 == 0) //number can divide by 2 is even
            System.out.println(num + " is even");
        else
        System.out.println(num + " is odd");

    }
}
