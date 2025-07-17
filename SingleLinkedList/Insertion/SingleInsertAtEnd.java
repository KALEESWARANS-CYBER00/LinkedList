package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertAtEnd {
        private Node head;
    public Node getHead() {
        return head;
    }
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
