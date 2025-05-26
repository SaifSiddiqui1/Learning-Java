
import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[5];

        // for user input
        for (int i = 0; i < str.length; i++) {
            System.out.println(" Please enter the name : ");
            str[i] = input.next(); // used to take string input

        }
        // TO MODIFY
        str[1] = "Saif";

        // for Output
        System.out.println(java.util.Arrays.toString(str));

    }

}
