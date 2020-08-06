package kunal.Main;

import java.util.LinkedList;

public class LinkedListRemovalAtPointer {

    public static void main(String[] args) {

        LinkedListRemovalAtPointer list = new LinkedListRemovalAtPointer();

        LinkedList utilLinkedList = new LinkedList();

        utilLinkedList.add(new Node(1));
        Node head1 = ((Node) utilLinkedList.get(0)).next;

        Node head = new Node(1);
        head.next = new Node(12);
        head.next.next = new Node(1);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);

        System.out.println("Before Deleting ");
        list.printList(head);

        list.deleteNode(head.next);
        System.out.println();
        System.out.println("After deleting ");
        list.printList(head);
    }

    private void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private void deleteNode(Node node) {
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
        temp = null;

    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
