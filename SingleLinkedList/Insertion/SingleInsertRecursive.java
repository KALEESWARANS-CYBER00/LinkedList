package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertRecursive {
    private Node head;

    // Public wrapper method
    public void insertRecursive(int data) {
        head = insertRecursive(head, data);  // Call private recursive method
    }

    // Private recursive logic
    private Node insertRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        node.next = insertRecursive(node.next, data);
        return node;
    }

    public Node getHead() {
        return head;
    }
}
