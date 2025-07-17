package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertAtPosition {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertAtPosition(int pos, int data) {
        Node newNode = new Node(data);

        if (pos <= 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int currentPos = 1;

        while (temp.next != null && currentPos < pos - 1) {
            temp = temp.next;
            currentPos++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
}
