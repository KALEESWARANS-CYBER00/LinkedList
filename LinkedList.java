import SingleLinkedList.Insertion.*;
import SingleLinkedList.Traversal.*;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertSorted list = new SingleInsertSorted();

        list.insertSorted(30);
        list.insertSorted(10);
        list.insertSorted(20);
        list.insertSorted(40);
        list.insertSorted(25);

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
