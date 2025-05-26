
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println(" Input Array ");
        System.out.print("Please enter 5 input :");

        // 1= For loop to take user input in array /input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }

        // 2=output from user as Array.toString(array name) / output

        System.out.println(java.util.Arrays.toString(arr));

        // 3= -For loop used to print the number taken from the user / input
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // 4=FOR EACH LOOP USED / output

        // for (int num : arr) { // for every element in array print the element
        // System.out.print(num + " "); // num represents element of the array
    }
}
