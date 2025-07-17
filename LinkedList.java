import SingleLinkedList.Insertion.*;
import SingleLinkedList.Traversal.*;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertAfterValue list = new SingleInsertAfterValue();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAfterValue(20, 25);  // Inserts 25 after 20
        list.insertAfterValue(30, 35);  // Inserts 35 after 30
        list.insertAfterValue(99, 50);  // Value not in list

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
