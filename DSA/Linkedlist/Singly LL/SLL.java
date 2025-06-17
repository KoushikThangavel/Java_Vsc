public class SLL{
    private class Node {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

     public void InsertAtBeg(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }

    public void InsertAtEnd(int data)
    {
        Node newnode = new Node(data);
        Node current = head;
        if(head==null)
        {
            head = newnode;
        }
        else{
           while(current.next != null)
           {
            current = current.next;
           }
           current.next = newnode;
        }
    }

    public void InsertAtPos(int data, int index)
    {
        Node newnode = new Node(data);
        if(index==0 && head==null)
        {
            newnode.next = head;
            head = newnode;
        }
        Node current = head;
        int count =0 ;
        while(current != null && count < index-1)
        {
            current = current.next;
            count++;
        }
        if(current == null)
        {
            System.out.print("Invalid");
            return;
        }

        newnode.next = current.next;
        current.next = newnode;
    }

    public void DelAtBeg()
    {
        if(head == null)
        {
            System.out.print("No elements to delete");
        }
        // if(head.next!=null)
        // {
        //     head = head.next;
        // }
        // else{
        //     head=null;
        // }
        head = head.next;
    }

    public void DelAtEnd()
    {
        if(head == null)
        {
            System.out.print("No elements to delete");
        }
        Node current = head;
        while(current.next.next!=null)
        {
            current = current.next;
        }
        current.next = null;
    }

    public void DelAtPos(int index)
    {
        if(head == null)
        {
            System.out.print("No elements to delete");
        }
        Node current = head;
        int count=0;
        while(current!=null && count<index-1)
        {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
    }

    public void reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev =current;
            current = next;
        }
        head = prev;
    }
    public void count()
    {
        int size=0;
        Node current = head;
        while(current!=null)
        {
            size++;
            current=current.next;
        }
        System.out.println(size);
    }

    public void display()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        SLL list = new SLL ();
        list.InsertAtBeg(10);
        list.InsertAtBeg(20);
        list.InsertAtBeg(30);
        list.InsertAtBeg(100);
        list.InsertAtBeg(50);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtEnd(40);
        list.InsertAtEnd(50);
        list.InsertAtPos(90,4);
        list.DelAtBeg();
        list.DelAtEnd();
        list.DelAtPos(4);
        list.display();
        list.reverse();
        list.display();
        list.count();
    }
}