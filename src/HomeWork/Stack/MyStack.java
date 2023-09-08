package HomeWork.Stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyStack<T> {
    private Object[] arr;
    private int front;
    private int rear;
    private int size;

    public MyStack(int capacity) {
        arr = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void push(T value) {
        if (size == arr.length) {
            throw new IllegalStateException();
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        arr[size] = null;
        size--;
    }

    public void clear() {
        Arrays.fill(arr, null);
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return (T) arr[front];
    }

    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T polled = (T) arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return polled;
    }
}

