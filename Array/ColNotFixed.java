public class ColNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 5, 65 },
                { 5, 3 },
                { 15, 23, 544, 3 }
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++)
            // this arr[row].length is used if the value of col is not fixed
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
