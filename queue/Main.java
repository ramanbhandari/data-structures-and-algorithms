package queue;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList<Integer> queue = new QueueLinkedList<>();

        // Test 1: isEmpty() on new queue
        System.out.println("Is empty? " + queue.isEmpty()); // true

        // Test 2: push() and peek()
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println("Peek: " + queue.peek()); // 10

        // Test 3: poll() and FIFO order
        System.out.println("Poll: " + queue.poll()); // 10
        System.out.println("Poll: " + queue.poll()); // 20

        // Test 4: peek() after polling
        System.out.println("Peek after two polls: " + queue.peek()); // 30

        // Test 5: poll remaining element
        System.out.println("Poll: " + queue.poll()); // 30
        System.out.println("Is empty after all polls? " + queue.isEmpty()); // true

        // Test 6: peek() on empty queue
        try {
            queue.peek();
        } catch (NoSuchElementException e) {
            System.out.println("Caught expected exception on peek(): " + e);
        }

        // Test 7: poll() on empty queue
        try {
            queue.poll();
        } catch (NoSuchElementException e) {
            System.out.println("Caught expected exception on poll(): " + e);
        }

        // Test 8: push after clearing
        queue.push(100);
        System.out.println("Peek after reusing queue: " + queue.peek()); // 100
    }
}

