package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertIfNotFoundAtEnd {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertIfNotFound(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Value " + data + " already exists. Skipping insertion.");
                return;
            }
            if (temp.next == null) break;
            temp = temp.next;
        }

        temp.next = new Node(data);
    }

    // Optional bulk insertion
    public void insertMultipleIfNotFound(int[] values) {
        for (int val : values) {
            insertIfNotFound(val);
        }
    }
}
