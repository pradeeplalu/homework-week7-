package homeworkweek7;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        int a, b, c, d;
        String name;

        Scanner marks = new Scanner(System.in);//Scanner object creation

        System.out.println("Enter name:");
        name = marks.next(); //user input

        System.out.println("Enter Roll num:");
        a = marks.nextInt();//user input

        System.out.println("Enter Maths Marks: ");
        b = marks.nextInt();//user input

        if(b>=0&&b<=100) {
            System.out.println("Enter Science Marks: ");
            c = marks.nextInt();//user input

            if (c >= 0 && c <= 100) {

                System.out.println("Enter English Marks: ");
                d = marks.nextInt();//user input
                if(d>=0&&d<=100){

                    System.out.println("_______________________________");
                    System.out.println("|                             |");
                    System.out.println("|       Mark Sheet            |");
                    System.out.println("|_____________________________|");
                    if (b >= 0 && c >= 0 && d >= 0 && a <= 100 && b <= 100 & c <= 100) {
                        int percentage = (((b + c + d) * 100) / 300);//percentage calculation

                        System.out.println("| Name     :        " + name + "         |");
                        System.out.println("| Roll No. :    " + a + "             |");
                        System.out.println("|_____________________________|");
                        System.out.println("| Subject :      Marks        |");
                        System.out.println("|_____________________________|");
                        System.out.println("|Maths        :        " + b + "     |");
                        System.out.println("|Science      :        " + c + "     |");
                        System.out.println("|English      :        " + d + "     |");
                        System.out.println("|_____________________________|");
                        System.out.println("|Total        :          " + (b + c + d) + "  |");
                        System.out.println("|_____________________________|");
                        System.out.println("|Percentage   :     " + percentage + "        |");
                        if (b >= 35 && c >= 35 && d >= 35) {
                            System.out.println("|Result       :     Pass      |");
                        } else {
                            System.out.println("|Result       :     Fail      |");
                        }
                        if (percentage >= 80) {
                            System.out.println("|Grade       :      A+        |");
                        } else if (percentage < 80 && percentage >= 60) {
                            System.out.println("|Grade       :      A         |");
                        } else if (percentage < 60 && percentage >= 50) {
                            System.out.println("|Grade       :      B         |");
                        } else if (percentage < 50 && percentage >= 35) {
                            System.out.println("|Grade       :      C         |");
                        } else {
                            System.out.println("|Grade       :        -        |");
                        }
                        System.out.println("|_____________________________|");

                    } else//if marks are not in range

                    {
                        System.out.println("Invalid Input, Marks should between 0 to 100");
                    }
                } else {
                    System.out.println("Invalid marks");


                }
            }else{
                System.out.println("Invalid marks");}
        } else{
            System.out.println("Invalid marks");
        }
    }
}




