import SingleLinkedList.Insertion.SingleInsertIfNotFoundAtEnd;
import SingleLinkedList.Traversal.PrintListForward;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertIfNotFoundAtEnd list = new SingleInsertIfNotFoundAtEnd();

        int[] input = {10, 20, 30, 20, 40, 10}; // Duplicates will be ignored
        list.insertMultipleIfNotFound(input);

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
