package queue;

import java.util.NoSuchElementException;

public class QueueLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    
    private static class Node<T> {
        T value;
        Node<T> next;
        
        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public QueueLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(T value) {
        Node<T> node = new Node<>(value);

        if(this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public T poll() {
        if(this.size == 0) throw new NoSuchElementException();
        
        T value = head.value;

        if(this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        
        this.size--;
        return value;
    }

    public T peek(){
        if(this.size == 0) throw new NoSuchElementException();
        return this.head.value;
    }
    
    public boolean isEmpty() {
        return this.size == 0;
    }
}
