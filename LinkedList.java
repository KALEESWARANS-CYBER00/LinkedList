import SingleLinkedList.*;
import SingleLinkedList.Insertion.*;
import SingleLinkedList.Traversal.*;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertAtPosition list = new SingleInsertAtPosition();
        list.insertAtPosition(1, 10); // Insert at head
        list.insertAtPosition(2, 30); // Insert at position 2
        list.insertAtPosition(2, 20); // Insert at position 2 again

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
