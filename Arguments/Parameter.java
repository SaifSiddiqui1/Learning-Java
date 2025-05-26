public class Parameter {
    public static void main(String[] args) {
       int num = sumTwoNumbers(10,20);

    //    value passed or given in bracket 10,20 are called arguments.
    // above can also be written as System.out.println(sumTwoNumbers(10,20));
    
        System.out.println(num);
    }
    public static int sumTwoNumbers(int first ,int second){
        // the int first and int second are called as parameters.
        // defining the method with parameters.
        int sum = first + second;
        return sum;
    }
    
}
