package HomeWork.Queue;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue(10);
        myQueue.add("Комірка 1");
        myQueue.add("Комірка 2");
        myQueue.add("Комірка 3");
        myQueue.add("Комірка 4");
        myQueue.add("Комірка 5");
        System.out.println("Розмір черги : " + myQueue.size());

        System.out.println("Перший елемент із черги : " + myQueue.peek());

        myQueue.clear();
        System.out.println("Після очищення розмір списка : " + myQueue.size());


    }
}
