package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertAtBegin {
    private Node head;

    // Insert a new node at the beginning
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Getter to return the head of the list
    public Node getHead() {
        return head;
    }
}
