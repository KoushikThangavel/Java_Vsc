package Queue;

public class Circularqueue {

        int maxsize;
        int[] queue;
        int front;
        int rear;
        int count;

        public Circularqueue(int size)
        {
            maxsize = size;
            queue = new int[maxsize];
            front = 0;
            rear = -1;
            count = 0;
        }
    

    public void enqueue(int data)
    {
        if(isfull())
        {
            System.out.print("Queue is Full");
            return;
        }
        rear = (rear+1) % maxsize;
        queue[rear] = data;
        count++;
    }

    public void dequeue()
    {
        if(isempty())
        {
            System.out.print("Queue is Empty");
            return;
        }
        queue[front] = 0;
        front = (front+1) % maxsize;
        count--;
    }

    public int peek()
    {
        if(isempty()){
            System.out.print("Queue is Empty");
        return -1;}
        return queue[front];
    }

    public boolean isempty()
    {
        return count == 0;
    }

    public boolean isfull()
    {
        return count == maxsize;
    }

     public int size() {
        return count;
    }

    public void display()
    {
        int temp = front;
        for(int i=0;i<count;i++)
        {
            System.out.print(queue[temp]+" ");
            temp = (temp+1) % maxsize;
        }
    }

    public static void main(String[] args) {
        Circularqueue q = new Circularqueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("Front: " + q.peek()); // 10
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        System.out.println("New Front: " + q.peek()); // 20
        q.display();
    }
}
