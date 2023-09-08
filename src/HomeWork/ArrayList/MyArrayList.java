package HomeWork.ArrayList;

import java.util.Arrays;

public class MyArrayList implements Collection {
    private static final int CAPACITY_VALUE = 10;
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[CAPACITY_VALUE];
        size = 0;
    }

    @Override
    public void add(Object value) {
        if (size >= data.length) {
            data = Arrays.copyOf(data, data.length * 2);
            data[size] = value;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    @Override
    public void clear() {
        Arrays.fill(data, 0, size, null);
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }
}
