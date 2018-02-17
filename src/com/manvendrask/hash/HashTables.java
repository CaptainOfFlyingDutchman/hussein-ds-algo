package com.manvendrask.hash;

public class HashTables {
    Entry[] table;
    int size;
    public HashTables(int size) {
        this.table = new Entry[size];
        this.size = size;
        for (int i=0; i< size; i++) {
            this.table[i] = new Entry();
        }
    }

    private int getHash(int key) {
        return key % size;
    }

    private void set(int key, Object value) {
        Entry newEntry = new Entry(key, value);

        int hash = getHash(key);
        Entry hashEntry = this.table[hash];

        newEntry.next = hashEntry.next;
        hashEntry.next = newEntry;
    }

    private Entry get(int key) {
        int hash = getHash(key);
        Entry hashEntry = this.table[hash];

        Entry entry = null;

        while(hashEntry != null) {
            if (hashEntry.key == key) {
                entry = hashEntry;
                break;
            }
            hashEntry = hashEntry.next;
        }

        return entry;
    }

    public static void main(String[] args) {
        HashTables hashTables = new HashTables(10);
        hashTables.set(5, "Manvendra");
        hashTables.set(15, "Singh");
        hashTables.set(26, "Hello");
        hashTables.set(12, "Eleven");
        hashTables.set(12, "Twelve");
        hashTables.set(13, "Thirteen");

        System.out.println(hashTables.get(26));
    }
}

class Entry {
    int key;
    Object value;
    Entry next;

    public Entry(int key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public Entry() {
        this.next = null;
    }

    @Override
    public String toString() {
        return key + ":" + value + ":" + next;
    }
}
