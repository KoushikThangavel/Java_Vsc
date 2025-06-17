public class SCLL {
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
     public void InsertAtBeg(int data){
        Node newnode = new Node(data);
        if(head== null)
        {
            head= newnode;
            newnode.next = head;
            return;
        }
        Node current = head;
        while(current.next != head)
        {
            current = current.next;
        }
        current.next = newnode;
        newnode.next = head;
        head = newnode;
        return;
    }

    public void InsertAtEnd(int data)
    {
        Node newnode = new Node(data);
         if(head== null)
        {
            head= newnode;
            newnode.next = head;
            return;
        }
        Node current = head;
         while(current.next != head)
        {
            current = current.next;
        }
        current.next=newnode;
        newnode.next= head;
    }

    public void InsertAtPos(int data, int index)
    {
        Node newnode = new Node(data);
         if(head== null)
        {
            head= newnode;
            newnode.next = head;
            return;
        }
        Node current =head;
        int count=0;
        while(count<index-1)
        {
            current = current.next;
            count++;
        }
        newnode.next = current.next;
        current.next = newnode;
    }

    public void DelAtBeg()
    {
        if(head == null)
        {
            System.out.print("List is empty");
        }
        Node current = head;
        while(current.next != head)
        {
            current = current.next;
        }
        head = head.next;
        current.next = head;
    }

    public void DelAtEnd()
    {
        if(head == null)
        {
            System.out.print("List is empty");
        }
        Node current = head;
        while(current.next.next != head)
        {
            current = current.next;
        }
        current.next = head;
    }

    public void DelAtPos(int index)
    {
         if(head == null)
        {
            System.out.print("List is empty");
        }
        Node current = head;
        int count=0;
        while(count<index-1)
        {
            current=current.next;
            count++;
        }
        current.next = current.next.next;
    }

    public void display()
    {
        if(head == null)
        {
            System.out.print("List is empty");
        }
        Node current =head;
        do {
            System.out.print(current.data + " --> ");
            current = current.next;
        } while (current != head);
        System.out.print("Head");
    }

    public static void main(String[] args)
    {
        SCLL list = new SCLL();
        list.InsertAtBeg(10);
        list.InsertAtBeg(20);
        list.InsertAtBeg(30);
        list.InsertAtBeg(40);
        list.InsertAtBeg(50);
        list.InsertAtEnd(60);
        list.InsertAtPos(90,3);
        list.DelAtBeg();
        list.DelAtEnd();
        list.DelAtPos(2);
        list.display();
        // list.InsertAtPos(70,3);
        // list.DelAtBeg();
        // list.DelAtEnd();
        // list.DelAtPos(2);
        // list.displayforward();
        // list.displaybackward();
    }
}
