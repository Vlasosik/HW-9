package HomeWork.Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private Object[] arr;
    private int front;
    private int rear;
    private int size;

    public MyQueue(int capacity) {
        arr = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void add(T value) {
        if (size == arr.length) {
            throw new IllegalStateException();
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
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

    public T poll() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T polled = (T) arr[front];
        front = (front + 1) % arr.length;
        size--;
        return polled;
    }


}
