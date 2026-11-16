public class Task_04_assigment01 {
    public static void main(String[] args) {
        int arr[] = {12,40,32,20,32,24,23,25,28,29};
        boolean istrue = false;
        int target = 202;

        for (int i =  0; i < arr.length ; i++) {
            if (target == arr[i]) {
                istrue = true;
                System.out.println("The Number is found and index is :"+i);
                break;

            }
        }
        if (!istrue) {
            System.out.println("the Number is not found");
        }
    }
}
