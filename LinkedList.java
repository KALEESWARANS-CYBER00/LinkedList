import SingleLinkedList.Insertion.*;
import SingleLinkedList.Traversal.*;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertBeforeValue list = new SingleInsertBeforeValue();

        list.insertBeforeValue(10, 10);  // Head becomes 10
        list.insertBeforeValue(10, 5);   // Insert before 10 → 5 -> 10
        list.insertBeforeValue(10, 8);   // Insert before 10 → 5 -> 8 -> 10
        list.insertBeforeValue(5, 3);    // Insert before 5 → 3 -> 5 -> 8 -> 10
        list.insertBeforeValue(100, 99); // Not found

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
