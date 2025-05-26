
import java.util.Arrays;
import java.util.Scanner;

public class MultiEnhance {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        Scanner input = new Scanner(System.in);

        multi(arr, input);

        // System.out.println(java.util.Arrays.deepToString(arr));
        // directly returning the values of the function multi.

    }

    public static int[][] multi(int[][] arr, Scanner input)

    {

        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                // System.out.println("first enter row value");
                // System.out.println(" then enter the col value : ");
                arr[rows][col] = input.nextInt();
            }
            // System.out.println();
        }

        // output with regular method
        // for(int rows =0 ;rows<arr.length;rows++){
        // // for each col in every row
        // for(int col=0;col<arr[rows].length;col++){
        // System.out.print(arr[rows][col] + " ");
        // }
        // System.out.println(); // used to print new line and show it as a matrix
        // }

        // Output with Arrays.toString
        // for (int rows = 0; rows < arr.length; rows++) {

        // System.out.println(java.util.Arrays.toString(arr[rows]));
        // used to replace and used to show output easily
        // we need to see only rows as we have value of all the columns in it already
        // }
        // System.out.println();

        // Output with help of enhanced for loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        return arr;
    }
}
