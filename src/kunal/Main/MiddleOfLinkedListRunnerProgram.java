package kunal.Main;

public class MiddleOfLinkedListRunnerProgram {

    private Node head;

    public static void main(String[] args) {
        MiddleOfLinkedListRunnerProgram customLinkedList = new MiddleOfLinkedListRunnerProgram();
        // Creating a linked customLinkedList
        Node head = new Node(5);
        customLinkedList.addToTheLast(head);
        customLinkedList.addToTheLast(new Node(6));
        customLinkedList.addToTheLast(new Node(7));
        customLinkedList.addToTheLast(new Node(1));
        customLinkedList.addToTheLast(new Node(2));
        customLinkedList.addToTheLast(new Node(4));
        customLinkedList.addToTheLast(new Node(3));
        customLinkedList.addToTheLast(new Node(1));
        customLinkedList.addToTheLast(new Node(11));
        customLinkedList.addToTheLast(new Node(15));
        customLinkedList.addToTheLast(new Node(17));
//        customLinkedList.addToTheLast(new Node(9));

        customLinkedList.printList();
        // finding middle element
        Node middle = customLinkedList.findMiddleNode(head);
        Node middle1 = customLinkedList.findMiddleNodeByRecursion(head, head);
        System.out.println("Middle node will be: " + middle.value);
        System.out.println("Middle node with recursion will be: " + middle1.value);

    }

    private void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }


    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    private Node findMiddleNode(Node head) {
        Node slowPointer, fastPointer;
        slowPointer = fastPointer = head;

        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            if (fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }
        return slowPointer;
    }

    private Node findMiddleNodeByRecursion(Node slowPointer, Node fastPointer) {

        if (fastPointer == null) {
            return slowPointer;
        }
        fastPointer = fastPointer.next;

        if (fastPointer == null) {
            return slowPointer;
        }
        return findMiddleNodeByRecursion(slowPointer.next, fastPointer.next);
    }

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
