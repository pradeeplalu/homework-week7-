package homeworkweek7;

import java.util.Scanner;

public class Program12 {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);//scanner object
        char ch;
        System.out.print("Enter a character: ");//consider first letter of input
        ch=kb.next(). charAt(0);
        System.out.println(ch>='a'&&ch<='z'?"small case alphabet"
                :ch>='A'&&ch<='Z'?"Capital Alphabet":ch>='0'&&ch<='9'?"Digit":"Symbol");



        }

    }





