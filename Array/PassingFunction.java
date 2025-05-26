
public class PassingFunction {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 8 };

        change(arr);

        add(10, 5);
    }

    public static void change(int[] arr) {
        arr[0] = 99;
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static int add(int a, int b) {
        int Result = 0;
        Result = a + b;
        System.out.println(Result);
        return Result;
    }
}
