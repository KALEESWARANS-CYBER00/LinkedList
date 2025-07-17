import SingleLinkedList.Insertion.*;
import SingleLinkedList.Traversal.*;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertUnique list = new SingleInsertUnique();

        list.insertUnique(10);
        list.insertUnique(20);
        list.insertUnique(10); // Duplicate
        list.insertUnique(30);
        list.insertUnique(20); // Duplicate

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
