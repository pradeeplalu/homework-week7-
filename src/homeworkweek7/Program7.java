package homeworkweek7;

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {

        int saleID;
        double amount,basic,commision;
        String name;

        Scanner obj=new Scanner(System.in); //Scanner object creation

        System.out.println("Enter sales ID      : ");
        saleID=obj.nextInt();//user input

        System.out.println("Enter seller's name : ");
        name=obj.next();//user input

        System.out.println("Enter basic salary  : ");
        basic=obj.nextDouble();//user input

        System.out.println("Enter sales amount  : ");
        amount=obj.nextDouble();//user input

        //Calculate sales commission for diff sale amount range

        if(amount>=50000){
            System.out.println("Sales Commission :"+((35*amount)/100));}

        else if (amount>=30000 &&amount<50000){
            System.out.println("Sales Commission :"+((20*amount)/100));

        }else if(amount>=20000 && amount<30000){
            System.out.println("Sales Commission :"+((10*amount)/100));

        }else if(amount>=10000 && amount<20000){
            System.out.println("Sales Commission :"+((5*amount)/100));

        }else
            System.out.println("Sales Commission :"+((2*amount)/100));
    }
}


