package stack;

public class Main {
    public static void main(String[] args) {
        StackLinkedList<Integer> stack = new StackLinkedList<>();

        System.out.println("Is empty? " + stack.isEmpty()); // true
        System.out.println("Size: " + stack.size());        // 0

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek()); // 30
        System.out.println("Size after pushes: " + stack.size());  // 3

        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Pop: " + stack.pop()); // 20
        System.out.println("Size now: " + stack.size()); // 1

        System.out.println("Peek again: " + stack.peek()); // 10

        stack.pop(); // removes last element
        System.out.println("Is empty after popping all? " + stack.isEmpty()); // true

        // Try popping from empty stack (will throw exception)
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println("Exception on pop from empty stack: " + e);
        }

        // Try peeking from empty stack (will throw exception)
        try {
            stack.peek();
        } catch (Exception e) {
            System.out.println("Exception on peek from empty stack: " + e);
        }
    }
}
