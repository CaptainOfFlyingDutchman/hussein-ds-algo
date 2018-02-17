package com.manvendrask;

import java.util.Arrays;

public class DynamicArrays {

    private Object[] array;
    private int index;

    private DynamicArrays() {
        index = 0;
        array = new Object[1];
    }

    private void put(Object d) {
        ensureCapacity(index + 1);
        array[index++] = d;
    }

    private void ensureCapacity(int suggestedCapacity) {
        if (suggestedCapacity > array.length) {
            int newCapacity = array.length * 2;
//            if (newCapacity < suggestedCapacity) {
//                newCapacity = suggestedCapacity;
//            }
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public static void main(String[] args) {
        DynamicArrays dArray = new DynamicArrays();
        dArray.put(1);
        dArray.put(2);
        dArray.put(3);
        dArray.put(4);
        dArray.put(5);
        dArray.put(6);
        System.out.println(Arrays.toString(dArray.array));
    }
}
