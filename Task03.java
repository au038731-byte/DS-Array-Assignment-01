public class Task_03_assigment01 {
    public static void main(String[] args) {
        int arr[] = {23,41,23,4,1,23,22,44,63};
        int sum =0, avg=0, counter=0;

        for(int i = 0 ; i<arr.length; i++) {
            sum += arr[i];
        }
        avg = (sum/arr.length);
        System.out.println("Sum is "+sum);
        System.out.println("Avg is "+avg);

        for (int i = 0 ; i < arr.length;i++) {
            if (arr[i] > avg) {
                counter++;
            }
        }
        System.out.println("Those value is greater than Avg :"+counter);
    }
}
