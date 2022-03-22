package homeworkweek7;

public class Program19 {

    public static void main(String[] args) {

        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};//Array numbers

        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        //Average value
        System.out.println("Average value of the array elements is : " + average);
    }
}



