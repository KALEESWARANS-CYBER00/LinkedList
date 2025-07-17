package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertUnique {
    private Node head;

    public Node getHead() {
        return head;
    }

    // Insert only if value is not already present
    public void insertUnique(int data) {
        if (contains(data)) {
            System.out.println("⚠️ Value " + data + " already exists. Skipping insertion.");
            return;
        }

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Utility method to check for duplicates
    private boolean contains(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) return true;
            temp = temp.next;
        }
        return false;
    }
}
