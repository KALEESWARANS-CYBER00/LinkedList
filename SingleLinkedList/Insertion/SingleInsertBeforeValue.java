package SingleLinkedList.Insertion;

import SingleLinkedList.Node;

public class SingleInsertBeforeValue {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertBeforeValue(int target, int data) {
        Node newNode = new Node(data);

        // Insert at head if list is empty OR target is head
        if (head == null) {
            head = newNode;
            return;
        }

        if (head.data == target) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse list to find the target
        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != target) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Value " + target + " not found in the list.");
        } else {
            newNode.next = curr;
            prev.next = newNode;
        }
    }
}
