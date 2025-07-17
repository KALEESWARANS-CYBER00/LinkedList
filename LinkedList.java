import SingleLinkedList.Insertion.SingleInsertAtBegin;
import SingleLinkedList.Traversal.PrintListForward;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertAtBegin list = new SingleInsertAtBegin();
        list.insertAtBegin(30);
        list.insertAtBegin(20);
        list.insertAtBegin(10);

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
