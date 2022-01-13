package com.company;

public final class ImmutableClass {
    private final int[] array;

    public ImmutableClass(int[] array) {
        this.array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
    }

    public int[] getArray() {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = this.array[i];
        }
        return copy;
    }

    @Override
    public String toString() {
        return "immClass";
    }
}
