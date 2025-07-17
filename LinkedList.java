import SingleLinkedList.Insertion.SingleInsertReverseOrder;
import SingleLinkedList.Traversal.PrintListForward;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertReverseOrder list = new SingleInsertReverseOrder();

        int[] values = {10, 20, 30, 40, 50};
        list.insertMultipleReverse(values); // Inserts in reverse

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
