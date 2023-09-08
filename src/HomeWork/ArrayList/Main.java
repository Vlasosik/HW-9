package HomeWork.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection myArrayList = new MyArrayList();
        myArrayList.add("Елемент 1");
        myArrayList.add("Елемент 2");
        myArrayList.add("Елемент 3");

        System.out.println("Розмір списку: " + myArrayList.size());

        myArrayList.remove(1);

        if (myArrayList.size() > 1) {
            System.out.println("Елемент 1: " + myArrayList.get(1));
        } else {
            System.out.println("Список порожній або недостатньо елементів.");
        }

        myArrayList.clear();

        System.out.println("Після очищення розмір списка: " + myArrayList.size());


    }
}
