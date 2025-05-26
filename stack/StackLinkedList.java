package stack;

import java.util.EmptyStackException;

public class StackLinkedList<T> {
    private int size;
    private Node<T> head;

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public StackLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.next = head;
        head = node;
        this.size++;
    }

    public T peek() {
        if(isEmpty()) throw new EmptyStackException();
        return this.head.value;
    }

    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        
        T value = head.value;
        this.head = this.head.next;
        this.size--;

        return value;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        head = null;
        size = 0;
    }
}