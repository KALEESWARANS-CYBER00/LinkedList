import SingleLinkedList.Insertion.*;
import SingleLinkedList.Traversal.*;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertMultiple list = new SingleInsertMultiple();

        int[] values = {10, 20, 30, 40, 50};
        list.insertMultiple(values);

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
