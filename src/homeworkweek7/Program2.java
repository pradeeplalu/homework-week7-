package homeworkweek7;

import java.util.Scanner;

public class Program2 {
//main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any year");

        int year = s.nextInt();
        boolean isleap = false;
        if(year % 400 == 0)// if the year is divided by 400
        {
            isleap = true;
        }
        else if (year % 100 == 0)// if the year is century
        {
            isleap = false;
        }
        else if(year % 4 == 0)// if the year is divided by 4
        {
            isleap = true;
        }
        else
        {
            isleap= false;
        }
        if(isleap)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}

