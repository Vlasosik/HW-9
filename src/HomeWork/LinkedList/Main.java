package HomeWork.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> stringList = new MyLinkedList<>();
        stringList.add("Комірка 1");
        stringList.add("Комірка 2");
        stringList.add("Комірка 3");

        int size = stringList.size();
        System.out.println("size = " + size);
        Object element = stringList.get(0);
        System.out.println("element = " + element);

        stringList.remove(1);
        System.out.println("Загальна кількість = " + stringList.size());
        stringList.clear();
        System.out.println("Після очищення розмір списка: " + stringList.size());
    }
}
