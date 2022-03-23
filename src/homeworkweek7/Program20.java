package homeworkweek7;

import java.util.Scanner;

public class Program20 {
    
    public static void main(String[] args) {

        int a[] = {100, 200, 240, 410, 250, 160};
        boolean check = false;

        Scanner sc = new Scanner(System.in);//scanner object creation

        System.out.println("Enter number you want to find: ");
        int num = sc.nextInt();//user input

        int i;
        for( i =0;i<a.length;i++)
        {
            if(a[i] == num)  //to check element in array
            {
                check=true;
                break;
            }
        }
        if(check)
        {
            System.out.println("Element found in the array");
            for ( int j = 0 ; j < a.length ; j++ )
            {
                System.out.print(a[j] + " ");
            }

        }
        else
        {
            System.out.println("Element not found");
        }

    }
}


   
