package Queue;

public class Normalqueue {
    int maxSize;
    int[] queue;
    int front;
    int rear;

    // Constructor
    public Normalqueue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
    }

    // Enqueue
    public void enqueue(int data) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        queue[rear] = data;
    }

    // Dequeue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Removed: " + queue[front]);
        front++;
        
    }

    // Peek (returns front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    // Check if empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Display
    public void display() {
        System.out.println("Front " +front);
        System.out.println("Rear " +rear);
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
        
    }

    // Main method to test
    public static void main(String[] args) {
        Normalqueue q = new Normalqueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // 10 20 30
        q.dequeue(); // removes 10
        q.display(); // 20 30
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Should succeed
        q.enqueue(70); // Should show "Queue is Full"
        q.display(); // 20 30 40 50 60
    }
}
