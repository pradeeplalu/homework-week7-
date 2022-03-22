package homeworkweek7;

public class Program20 {

    public static void main(String[] args) {
        int[] array = {3, 5, 23, 43, 12};
        int element = 23;

        //method calling in main method
        Program20.array1(array, element);
    }
        //no return type with parameter

    public static void array1(int[] array, int element) {
        int[] input = array;//local variable
        int list = element;//local variable
        for (int i = 0; i < input.length; i++) {

            if (input[i] == list)  //condition to check element in array
            { System.out.println("YES");
            }else{
                System.out.println("Element not contains in this array");
            }
        }
    }
}
