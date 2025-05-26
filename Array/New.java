public class New {
    public static void main(String[] args) {

        int[] values = { 12, 3, 4, 5, 63 };
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println("######");

        for (int value : values) {
            System.out.println(value);
        }
    }
}