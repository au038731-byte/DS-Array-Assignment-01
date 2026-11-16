public class Task_02_assigment1 {
    public static void main(String[] args) {
        int arr[] = {23,41,2,4,33,42,1,52,23}; // this is simple array

        for(int i= 0 ; i < arr.length;  i++) { // this is outer loop for take one value and check by all values of array
            for (int j= 0; j < arr.length-1-i; j++) {  // this is inner loop and they take one input and check with previous value
                if(arr[j] > arr[j+1]) {  // this is our main logic if condition if array[j] is bigger than arr[j+1] then enter in if block
                    int temp = arr[j]; // int temp is a variable like a emty box we can store integer type of values in this  step we store arr[j] in temp
                    arr[j]  = arr[j+1];  //  And in arr[j] we store arr[j+1] value we swap variable with the help of extra variable
                    arr[j+1]  = temp;   // then we store  temp value in arr[j+1]
                }
            }
        }

        // There we display the values of Maximum and Minimum value and also second min value
        System.out.println("Smallest value :"+arr[0]);
        System.out.println("Second smallest value :"+arr[1]);
        System.out.println("Largest value :"+arr[arr.length-1]);

    }
}
