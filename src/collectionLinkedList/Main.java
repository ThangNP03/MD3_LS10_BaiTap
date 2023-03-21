package collectionLinkedList;

    public class Main {
        public static void main(String[] args) {
            MyLinkedList myLinkedListTest = new MyLinkedList(10);
            MyLinkedList.addLast(19);
            myLinkedListTest.addLast(15);
            myLinkedListTest.addLast(18);
            myLinkedListTest.addLast(19);
            myLinkedListTest.addLast(20);
            System.out.println(myLinkedListTest.contains(12));
            System.out.println(myLinkedListTest.indexOf(20));
            myLinkedListTest.remove(1);
            myLinkedListTest.clone();

            myLinkedListTest.printList();
            System.out.println(myLinkedListTest);
        }
    }