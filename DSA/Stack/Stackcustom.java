package Stack;

public class Stackcustom{
    
    int maxsize;
    int[] stack;
    int top;

    public Stackcustom(int size)
    {
        maxsize = size;
        stack = new int[maxsize];
        top = -1;
    }

    public void push(int val)
    {
        if(top < maxsize-1)
            stack[++top] = val;
        else
            System.out.print("Stack Overflow");
    }

    public int pop()
    {
        if(!isempty())
            return stack[top--];
        return -1;
    }


    public int peek()
    {
        if(!isempty())
            return stack[top];
        else
            return -1;
    }

     public boolean isempty()
    {
        return top == -1;
    }

    public void display()
    {
       if(!isempty())
       {for(int i=0;i<=top;i++)
            {
                System.out.print(stack[i]+" ");
            }System.out.println();}
            
        else
        {
            System.out.print("Empty");
        }
    }
   
    public int size()
    {
        return top+1;
    }

    public static void main(String[] args)
    {
        Stackcustom book = new Stackcustom(5);
        int popped = book.pop();
        if(popped == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + popped);
        }
        book.push(10);
        book.push(20);
        book.push(30);
        book.push(40);
        book.display();
        System.out.print(book.pop());
        System.out.println(book.peek());
        System.out.println(book.pop());
        book.display();
        System.out.println(book.isempty());
        System.out.print(book.size());
    }
}
