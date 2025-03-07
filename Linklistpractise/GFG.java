// C program to delete the last node of linked list

// Node structure for the linked list
class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class GFG {

    // Function to remove the last node of the linked list
    public static Node removeLastNode(Node head)
    {

        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        // If the list has only one node, delete it and
        // return null
        if (head.next == null) {
            return null;
        }

        // Find the second last node
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Delete the last node
        secondLast.next = null;

        return head;
    }

    // Function to print the linked list
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args)
    {

        // Creating a static linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list: ");
        printList(head);

        // Removing the last node
        head = removeLastNode(head);

        System.out.println(
            "List after removing the last node: ");
        printList(head);
    }
}
