package HomeWork.Stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println("Розмір стека : " + myStack.size());

        System.out.println("Перший елемент із стека : " + myStack.peek());

        myStack.clear();

        System.out.println("Після очищення розмір списка : " + myStack.size());

    }
}
