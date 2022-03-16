import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int arraySize = read.nextInt();

        Array array = new Array(arraySize);

        System.out.println("Enter array elements :-");

        for (int i = 0; i < arraySize; ++i) {
            System.out.printf("[%d] : ", i);
            array.addValue(i, read.nextInt());
        }
        System.out.println("Frequency of 5 : " + array.numFrequency(5));
        System.out.println("No of Odds : " + array.noOfOdd());
        System.out.println("Sum of Array : " + array.sumOfArray());
        System.out.println("Minimum of Array : " + array.minOfArray());
        System.out.println("Maximum of Array : " + array.maxOfArray());
    }
}
