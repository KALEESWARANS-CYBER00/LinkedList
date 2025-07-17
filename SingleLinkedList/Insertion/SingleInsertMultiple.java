package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertMultiple {
    private Node head;

    public Node getHead() {
        return head;
    }

    // Insert a single value at the end
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

    // Insert multiple values at the end
    public void insertMultiple(int[] values) {
        for (int val : values) {
            insertAtEnd(val);
        }
    }
}
