package myLinkedList;


public class LinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(10);
        myLinkedList.addPrepend(20);
        myLinkedList.addPrepend(5);
        myLinkedList.add(78);
        myLinkedList.add(145);
        myLinkedList.addPrepend(2);
        myLinkedList.addByIndex(4, 777);
        myLinkedList.addByIndex(3, 117);
        myLinkedList.addByIndex(2, 1010);
        myLinkedList.addByIndex(7, 144);
        myLinkedList.setByIndex(1,1000);
        myLinkedList.setByIndex(5,1000);
        myLinkedList.setByIndex(2,1000);
        myLinkedList.addPrepend(21);
        myLinkedList.removeByIndex(2);
        myLinkedList.removeByIndex(2);
        myLinkedList.removeByIndex(1);
        myLinkedList.removeByValue(117);
        myLinkedList.removeByValue(1000);



        System.out.println("  P R I N T     L I N K E D L I S T");
        System.out.println(myLinkedList.toStringLinkedList());
        System.out.println();

//        System.out.println(myLinkedList.getIndex(5));
        System.out.println(myLinkedList.toString());


    }
}
