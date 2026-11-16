public class StackArray {

    int arr[] = new int[5];
    int top = -1;

    // Push
    void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " Inserted");
        }
    }

    // Pop
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Removed: " + arr[top]);
            top--;
        }
    }

    // Peek
    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element: " + arr[top]);
        }
    }

    // Display
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {

        StackArray s = new StackArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();

        s.display();
    }
}
