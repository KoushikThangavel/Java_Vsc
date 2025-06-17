public class DLL {
      private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    public void InsertAtBeg(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        newnode.prev = null;
        if (head != null) {         // To avoid Null pointer exception error, becoz null can't refer any value
            head.prev = newnode;
        }
        head = newnode;
    }

    public void InsertAtEnd(int data)
    {
        Node newnode = new Node(data);
        Node current = head;
        if (head == null) {
            head = newnode;
            return;
        }
         while(current.next != null)
         {
            current = current.next;
         }
          current.next = newnode;
          newnode.prev = current;
          newnode.next = null;
    }

    public void InsertAtPos(int data,int index)
    {
        Node newnode = new Node(data);
       if (head == null || index == 0) {
        newnode.next = head;
        newnode.prev = null;
        if (head != null) {
            head.prev = newnode;
        }
        head = newnode;
        return;
        }

    // Traverse to node at index - 1
    Node current = head;
    int count = 0;
    while (current != null && count < index - 1) {
        current = current.next;
        count++;
    }

    // If current is null, index is out of bounds
    if (current == null) {
        System.out.println("Index out of bound");
        return;
    }
        newnode.next = current.next;
        newnode.prev = current;
       if (current.next != null) {
        current.next.prev = newnode;
        }
        current.next = newnode;
    }

    public void DelAtBeg()
    {
        if(head == null)
        {
            System.out.print("Empty list");
        }
        head.next.prev = null;
        head = head.next;
    }

    public void DelAtEnd()
    {
        if(head == null)
        {
            System.out.print("List is empty");
        }
        Node current = head;
        while(current.next.next != null)
        {
            current = current.next;
        }
        current.next = null;
    }

    public void DelAtPos(int index)
    {
        if(head == null)
        {
            System.out.print("Emoty list");
            return;
        }
        Node current = head;
        int count=0;
        while(current != null && count<index-1)
        {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
        current.next.prev = current;
    }
    public void displayforward()
    {
        Node current = head;
        System.out.print("Null --> ");
        while(current!=null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void displaybackward()
    {
        Node current = head;
        System.out.print("Null --> ");
        while(current.next!=null)
        {
            current = current.next;
        }
        while(current!=null)
        {
            System.out.print(current.data + " --> ");
            current = current.prev;
        }
        System.out.println("Null");
    }

    public static void main(String[] args)
    {
        DLL list = new DLL();
        list.InsertAtBeg(10);
        list.InsertAtBeg(20);
        list.InsertAtBeg(30);
        list.InsertAtBeg(40);
        list.InsertAtBeg(50);
        list.InsertAtEnd(60);
        list.InsertAtPos(70,3);
        list.DelAtBeg();
        list.DelAtEnd();
        list.DelAtPos(2);
        list.displayforward();
        list.displaybackward();
    }
}
