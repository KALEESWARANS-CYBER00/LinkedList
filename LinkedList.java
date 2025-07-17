import SingleLinkedList.Insertion.*;
import SingleLinkedList.Traversal.*;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertRecursive list = new SingleInsertRecursive();

        list.insertAtEndRecursive(10);
        list.insertAtEndRecursive(20);
        list.insertAtEndRecursive(30);

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
