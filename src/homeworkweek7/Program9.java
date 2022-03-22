package homeworkweek7;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char alpha;// declare char variable

        System.out.println("Please enter alphabet between A to F:");

        alpha = obj.next().charAt(0);//user input..it will consider first character if input string

        char beta = Character.toUpperCase(alpha);//to make it uppercase

//choose city name as per input by using switch-case
        switch (beta){
            case 'A':
                System.out.println("Ankleshwar");
                break;
            case 'B':
                System.out.println("Baroda");
                break;
            case 'C':
                System.out.println("Chicago");
                break;
            case 'D':
                System.out.println("Dahod");
                break;
            case 'E':
                System.out.println("Edmonton");
                break;
            case 'F':
                System.out.println("Florida");
                break;
            default:
                System.out.println("Invalid entry");//for invalid entry
        }

    }
}




