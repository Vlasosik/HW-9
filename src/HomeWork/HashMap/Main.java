package HomeWork.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("один", 1);
        myHashMap.put("два", 2);
        myHashMap.put("три", 3);

        System.out.println("Value for key 'one': " + myHashMap.get("one"));
        System.out.println("Value for key 'two': " + myHashMap.get("two"));
        System.out.println("Value for key 'three': " + myHashMap.get("three"));

        myHashMap.remove("two");

        System.out.println("Size: " + myHashMap.size());

        myHashMap.clear();

        System.out.println("Is empty: " + (myHashMap.size() == 0));


    }
}
