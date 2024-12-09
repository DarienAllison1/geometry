package geometry;

import java.util.ArrayList;

public class LinkedList<T> {
    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the list
    private int size;  // Number of elements in the list

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add a new item to the list
    public void add(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Remove an item from the list
    public boolean remove(T item) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(item)) {
            head = head.next;
            size--;
            return true;
        }
        Node current = head;
        while (current.next != null && !current.next.data.equals(item)) {
            current = current.next;
        }
        if (current.next == null) {
            return false;
        }
        current.next = current.next.next;
        size--;
        return true;
    }

    // Find an item by its index
    public T find(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Display all items in the list
    public void display() {
        Node current = head;
        int index = 0;
        while (current != null) {
            System.out.println(index + ": " + current.data);
            current = current.next;
            index++;
        }
    }

    // Return the size of the list
    public int size() {
        return size;
    }
}
