public class QueueArray {

    int arr[] = new int[5];
    int front = -1;
    int rear = -1;

    // Enqueue
    void enqueue(int value) {

        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
        } else {

            if (front == -1) {
                front = 0;
            }

            rear++;
            arr[rear] = value;

            System.out.println(value + " Inserted");
        }
    }

    // Dequeue
    void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {

            System.out.println("Removed: " + arr[front]);
            front++;

            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    // Front
    void showFront() {

        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element: " + arr[front]);
        }
    }

    // Display
    void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {

            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.showFront();

        q.dequeue();

        q.display();
    }
}
