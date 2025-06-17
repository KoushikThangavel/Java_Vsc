package Stack;

import java.util.Stack;

public class Stackinbuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // PUSH
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: " + stack); // [10, 20, 30]

        // PEEK
        System.out.println("Top element (peek): " + stack.peek()); // 30

        // POP
        int popped = stack.pop();
        System.out.println("Popped element: " + popped); // 30
        System.out.println("Stack after pop: " + stack); // [10, 20]

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        // SIZE
        System.out.println("Stack size: " + stack.size()); // 2
    }
}
