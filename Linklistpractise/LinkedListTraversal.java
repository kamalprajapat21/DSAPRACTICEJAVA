class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListTraversal {
    // Function to traverse the linked list and search for the target
    public static boolean traversal(Node head, int tar) {
        while (head != null) {
            if (head.data == tar) {
                return true; // Target found
            }
            head = head.next; // Move to the next node
        }
        return false; // Target not found
    }

    public int removelast(){
        if(size == 0){
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Test the traversal method
        int target = 3;
        boolean found = traversal(head, target);
        head = removelast(head);
        System.out.println(
            "List after removing the last node: ");
        printList(head);
    }

        if (found) {
            System.out.println("Target " + target + " found in the linked list.");
        } else {
            System.out.println("Target " + target + " not found in the linked list.");
        }
    }

