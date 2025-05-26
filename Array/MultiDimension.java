import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        // It is important to declare rows but not necessary to declare columns as col
        // can be
        // of different sizes and shall contain different values.
        Scanner input = new Scanner(System.in);
        // int[][] arr2D = {
        // { 12, 5, 54 },
        // { 45, 44, 7 },
        // { 78, 11, 5 }

        // };
        multi(arr, input);
        System.out.println(java.util.Arrays.deepToString(arr));
        // The Arrays.deepToString() method comes under the Arrays class in Java.
        // It is used to return a string representation of the “deep contents” of a
        // specified array.
        // It handles multidimensional arrays by including the contents of nested
        // arrays.

        // toString() method doesn’t work well for multidimensional arrays.
        // deepToString() method prints multidimensional arrays properly.
    }

    public static int[][] multi(int[][] arr, Scanner input)
    // here Scanner input is used to take input from user in this function
    // that is outside of the main class , varna kaise pata chalega ki input kha se
    // lena hain and kha use hoga.
    {
        // input from user
        for (int rows = 0; rows < arr.length; rows++) // for loop for rows

        {
            for (int col = 0; col < arr[rows].length; col++) {
                // for loop for col and arr2D[rows].length to take input
                // till that given row number .

                System.out.println("first enter row value");
                System.out.println(" then enter the col value : ");
                arr[rows][col] = input.nextInt();

            }
            System.out.println();
        }
        return arr; // return an integer value
    }
}
