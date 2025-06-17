public class DCLL {
    class Node {
    int data;
    Node next;
    Node prev;

        public Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    Node head;

    public void InsertAtBeg(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            newnode.next = head;
            return;
        }
        Node current = head;
        while(current.next!=head)
        {
            current = current.next;
        }
        newnode.next = head;
        head.prev = newnode;
        current.next = newnode;
        newnode.prev =current;
        head = newnode;
    }

    public void InsertAtEnd(int data)   // If we don't change the newnode as head then it is the InserAtEnd 
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            newnode.next = head;
            return;
        }
        Node current = head;
        while(current.next!=head)
        {
            current = current.next;
        }
        newnode.next = head;
        head.prev = newnode;
        current.next = newnode;
        newnode.prev =current;
    }

    public void InsertAtPos(int data,int index)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            newnode.next = head;
            return;
        }
        Node current = head;
        int count = 0;
        while(current.next!=head && count<index-1)
        {
            current = current.next;
            count++;
        }
        newnode.next = current.next;
        current.next = newnode;
        newnode.prev = current;
        newnode.next.prev = newnode; 
    }

    public void DelAtBeg()
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return;
        }
        Node current = head;
        while(current.next != head)
        {
            current = current.next;
        }
        head = head.next;
        current.next = head;
        head.prev = current;
    }

    public void DelAtEnd()
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return;
        }
        Node current = head;
        while(current.next.next != head)
        {
            current = current.next;
        }
        current.next = head;
        head.prev = current;
    }

    public void DelAtPos(int index)
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return;
        }
        Node current = head;
        int count = 0;
        while(current.next!=head && count<index-1)
        {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
        current.next.prev = current;
    }
    public void display()
    {
        if(head == null)
        {
            System.out.print("List is Empty");
        }
        Node current = head;
        System.out.print("Head ");

        do
        {
            System.out.print(current.data + " <--> ");
            current = current.next;
        }while(current != head);
        System.out.print("Head");
    }


    public static void main(String[] args)
    {
        DCLL list = new DCLL();
        list.InsertAtBeg(10);
        list.InsertAtBeg(20);
        list.InsertAtBeg(30);
        list.InsertAtBeg(40);
        list.InsertAtEnd(50);
        list.InsertAtPos(70,2);
        list.DelAtBeg();
        list.DelAtEnd();
        list.DelAtPos(2);
        list.display();
    }

}