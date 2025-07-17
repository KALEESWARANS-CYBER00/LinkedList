package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertReverseOrder {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertInReverseOrder(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Optional bulk insert from array
    public void insertMultipleReverse(int[] values) {
        for (int val : values) {
            insertInReverseOrder(val);
        }
    }
}
