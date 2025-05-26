// package Array.LinearSearch;

public class FirstLinear {
    public static void main(String[] args) {
        int[] nums = {23, 5, 88, 57, 51, 87, -78, 65};
        int target=87;
        int ans = linearSearchFound(nums,target);
        System.out.println(ans);
        
        
    }
// Search in the array : return if the index is item found
//otherwise if not found return -1 

static int linearSearchFound(int[] arr, int target){
    if(arr.length == 0){
        return -1;
    }

    //run a for loop
    for(int index = 0;index<arr.length ;index++){
        int element = arr[index];
        if(element == target){
            return index;
        }
    }

    // this line will execute if none of return executed is not found
    return -1;

}

    
}
