package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertAfterNthNode {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertAfterNthNode(int position, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            System.out.println("List is empty. Cannot insert at position " + position);
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position " + position + " is out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Optional: to populate the list
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
