package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertSorted {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertSorted(int data) {
        Node newNode = new Node(data);

        // Case 1: Insert at the beginning or in empty list
        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Insert in the middle or end
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
}
