import SingleLinkedList.Insertion.SingleInsertAfterNthNode;
import SingleLinkedList.Traversal.PrintListForward;

public class LinkedList {
    public static void main(String[] args) {
        SingleInsertAfterNthNode list = new SingleInsertAfterNthNode();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAfterNthNode(2, 25); // Insert 25 after 2nd node (i.e., after 20)

        PrintListForward printer = new PrintListForward();
        printer.printListForward(list.getHead());
    }
}
