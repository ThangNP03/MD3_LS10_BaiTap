package collectionArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myListTest = new MyList<Integer>(5);
        System.out.println(myListTest);
        myListTest.add(5);
        myListTest.add(6);
        myListTest.add(7);
        myListTest.add(1);
        System.out.println(myListTest);
        System.out.println(myListTest.size());
        System.out.println(myListTest.clone());
        System.out.println(myListTest.contains(1));
        System.out.println(myListTest.size());
    }
}