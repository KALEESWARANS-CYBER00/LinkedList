package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertAfterValue {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertAfterValue(int target, int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot insert after value " + target);
            return;
        }

        Node current = head;
        while (current != null && current.data != target) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value " + target + " not found in the list.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    // Optional: Add insert at end to populate initial list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
}
