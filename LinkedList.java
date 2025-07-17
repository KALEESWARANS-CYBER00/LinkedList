import SingleLinkedList.Node;
import SingleLinkedList.Insertion.*;
import SingleLinkedList.Traversal.PrintListForward;

public class LinkedList {
    public static void main(String[] args) {
        PrintListForward printer = new PrintListForward();

        System.out.println("▶ Insert at Begin");
        SingleInsertAtBegin atBegin = new SingleInsertAtBegin();
        atBegin.insertAtBegin(10);
        atBegin.insertAtBegin(20);
        printer.printListForward(atBegin.getHead());

        System.out.println("\n▶ Insert at End");
        SingleInsertAtEnd atEnd = new SingleInsertAtEnd();
        atEnd.insertAtEnd(10);
        atEnd.insertAtEnd(20);
        printer.printListForward(atEnd.getHead());

        System.out.println("\n▶ Insert at Position");
        SingleInsertAtPosition atPos = new SingleInsertAtPosition();
        atPos.insertAtPosition(1, 5);
        atPos.insertAtPosition(2, 15);
        printer.printListForward(atPos.getHead());

        System.out.println("\n▶ Insert Before Value");
        SingleInsertAtEnd baseList = new SingleInsertAtEnd();
        baseList.insertAtEnd(10); // now baseList has data

        SingleInsertBeforeValue before = new SingleInsertBeforeValue();
        before.setHead(baseList.getHead()); // reuse the list from baseList

        before.insertBeforeValue(10, 5); // insert 5 before 10
        printer.printListForward(before.getHead());

        System.out.println("\n▶ Insert After Value");
        SingleInsertAfterValue after = new SingleInsertAfterValue();
        after.insertAtEnd(10);
        after.insertAfterValue(10, 15);
        printer.printListForward(after.getHead());

        System.out.println("\n▶ Insert Recursively");
        SingleInsertRecursive rec = new SingleInsertRecursive();
        rec.insertRecursive(10);
        rec.insertRecursive(20);
        rec.insertRecursive(30);
        printer.printListForward(rec.getHead());

        System.out.println("\n▶ Sorted Insert");
        SingleInsertSorted sorted = new SingleInsertSorted();
        sorted.insertSorted(20);
        sorted.insertSorted(10);
        sorted.insertSorted(30);
        sorted.insertSorted(25);
        printer.printListForward(sorted.getHead());

        System.out.println("\n▶ Insert Unique Only");
        SingleInsertUnique unique = new SingleInsertUnique();
        unique.insertUnique(20);
        unique.insertUnique(20); // duplicate
        unique.insertUnique(30);
        printer.printListForward(unique.getHead());

        System.out.println("\n▶ Insert Multiple Values");
        SingleInsertMultiple multi = new SingleInsertMultiple();
        multi.insertMultiple(new int[] {1, 2, 3});
        printer.printListForward(multi.getHead());

        System.out.println("\n▶ Insert After N-th Node");
        SingleInsertAfterNthNode nth = new SingleInsertAfterNthNode();
        nth.insertAtEnd(5);
        nth.insertAfterNthNode(1, 10);
        printer.printListForward(nth.getHead());

        System.out.println("\n▶ Insert in Reverse Order");
        SingleInsertReverseOrder rev = new SingleInsertReverseOrder();
        int[] revArray = {3, 2, 1};
        for (int val : revArray) {
            rev.insertInReverseOrder(val);
        }
        printer.printListForward(rev.getHead());

        System.out.println("\n▶ Insert If Not Found at End");
        SingleInsertIfNotFoundAtEnd ifNotFound = new SingleInsertIfNotFoundAtEnd();
        int[] ifNotFoundArray = {10, 20, 10, 50}; // duplicate 10 ignored
        ifNotFound.insertMultipleIfNotFound(ifNotFoundArray);
        printer.printListForward(ifNotFound.getHead());
    }
}
