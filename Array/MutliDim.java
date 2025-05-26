public class MutliDim {
    public static void main(String[] args) {
        // int[][] a = new int[3][2];
        // first row then column
        int[][] b = { { 12, 5, 2 }, { 57, 95, 23 }, { 7, 5 }, { 56, 6 } };

        // Jagged array
        /*
         * int[][] a;
         * a= new int[2][3];
         * a[0] =new int[4];
         * a[1] =new int[3]
         * a[0][1] =20;
         * 
         */
        // for(int num : nums)
        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++)

            /*
             * b[i].length ka ye kaam hai ki jb i ki value increase hogi tab length jo b ki
             * hai vo ajyegi (12,5,2)
             * mtlb jb i bhad ke 0 hoga toh fir b[i].length ki value 3 hogi with refernce
             * from b(57,95,23)
             * fir next jb i ki value 2 hogi toh b[i].length ki value 2 hogi (7,5)
             * fir next jb i ki value 3 hogi toh b[i].length ki value 2 hogi(56.6)
             */

            {
                System.out.println(b[i][j]);
            }
            System.out.println();
        }
    }
}

// Imagine b is a 2D array:
// Code

// b = [[1, 2, 3], [4, 5], [6, 7, 8, 9]]
// If i is 0, then b[i] is [1, 2, 3], and b[i].length is 3. The loop condition j
// < b[i].length would be j < 3.

// If i is 1, then b[i] is [4, 5], and b[i].length is 2. The loop condition j <
// b[i].length would be j < 2.

// If i is 2, then b[i] is [6, 7, 8, 9], and b[i].length is 4. The loop
// condition j < b[i].length would be j < 4.

// This ensures that j never goes beyond the valid indices of the inner
// arrays,preventing errors when accessing b[i][j].