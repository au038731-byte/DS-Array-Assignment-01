public class Task_01_assigment1 {
    public static void main (String [] args) {
        int arr[] = {10 ,20 ,30 ,40 ,50 ,60,70,80,90,100};

        System.out.println("Normal Array");
        for (int i = 0 ; i < arr.length; i++) {  // loop for interation and arr.length means array length (10)
            System.out.print(arr[i]+" "); // this step for printing array values using i index
        }
        System.out.println("\nReverse Array");
        for (int i = arr.length -1 ; i >=0; i--) {  // We use Reverse loop and the i first value is arr.length-1 because the array length is 10 that way we use arr.length-1 now length is 9 and end on 0
            System.out.print(arr[i]+" ");  // this for print the value
        }
    }
}
