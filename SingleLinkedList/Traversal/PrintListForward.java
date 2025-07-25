package SingleLinkedList.Traversal;

import SingleLinkedList.Node;

public class PrintListForward {
    public void printListForward(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
