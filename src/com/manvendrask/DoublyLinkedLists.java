package com.manvendrask;

public class DoublyLinkedLists {
    private DNode head;

    private void add(Object value) {
        DNode newNode = new DNode(value, null, null);
        if (head == null) {
            head = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    private void remove() {
        if (head != null) {
            head = head.next;
            if (head != null ) head.previous = null;
        }
    }

    private void display() {
        DNode start = head;
        while (start != null) {
            System.out.println(start.value);
            start = start.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedLists lists = new DoublyLinkedLists();
        lists.add("Manvendra");
        lists.add("Singh");
        lists.add("Hello");
        System.out.println("Inserted:");
        lists.display();

        lists.remove();
        lists.remove();
        lists.remove();
        System.out.println("Removed:");
        lists.display();
    }
}

class DNode {
    Object value;
    DNode next;
    DNode previous;

    DNode(Object value, DNode next, DNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
