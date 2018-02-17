package com.manvendrask;

public class LinkedLists {
    private Node head;

    private void add(Object value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    private void remove() {
        if (head != null) {
            head = head.next;
        }
    }

    private void display() {
        Node start = head;
        while(start != null) {
            System.out.println(start.value);
            start = start.next;
        }
    }

    public static void main(String[] args) {
        LinkedLists lists = new LinkedLists();
        lists.add("Manvendra");
        lists.add("Singh");
        lists.add("Hello");

        System.out.println("Inserted: ");
        lists.display();

        lists.remove();
        System.out.println("Deleted:");
        lists.display();
    }
}

class Node {
    Object value;
    Node next;

    Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }
}

