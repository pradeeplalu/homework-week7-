package homeworkweek7;

public class Program11 {
        public static void main(String args[]) {
            System.out.println("\nDivided by 3: ");
            for (int i=1; i<100; i++) {//range 1 to 100
                if (i%3==0)//logic for number divisible by 3
                    System.out.print(i +", ");
            }

            System.out.println("\n\nDivided by 5: ");//number divisible by 5
            for (int i=1; i<100; i++) {
                if (i%5==0) System.out.print(i +", ");
            }


            System.out.println("\n");
        }
}






