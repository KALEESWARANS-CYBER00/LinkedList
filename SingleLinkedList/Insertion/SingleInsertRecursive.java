package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertRecursive {
    private Node head;

    public Node getHead() {
        return head;
    }

    // Public method to insert at end recursively
    public void insertAtEndRecursive(int data) {
        head = insertRecursive(head, data);
    }

    // Private recursive method
    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = insertRecursive(current.next, data);
        return current;
    }
}
