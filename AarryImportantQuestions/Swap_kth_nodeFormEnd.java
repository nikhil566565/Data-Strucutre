


public class Swap_kth_nodeFormEnd {
    static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node swapKthNode(Node head, int k) {
        Node temp = head;
        int n = 1; // We already have one node (the head)
        while (temp.next != null) {
            n++;
            temp = temp.next;
        }
        if(k > n) return head; // Step 2: If k is greater than the number of nodes, return the head

        // Step 3: If the kth node from the start and end are the same, no swap needed
        if(n == (n-k+1)) // (n-k+1) -> Basic Formula Mathmatices to calculate kth node form end.
            return head; 
            
        Node first = head;
        Node firstP = null;
        for(int i=1; i<k; i++) {
            firstP = first;
            first = first.next;
        }

        Node second = head;
        Node secondP = null;
        for(int i=1; i<(n-k+1); i++) {
            secondP = second;
            second = second.next;
        }

        if(firstP != null) {
            firstP.next = second;
        }
        if(secondP != null) {
            secondP.next = first;
        }
        
        Node tempNode = first.next;
        first.next = second.next;
        second.next =  tempNode;
        
        if(k == 1) head = second;
        if(k == n) head = first;

        return head;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int k = 4;
        // Step 1: Create each node
        Node head = new Node(9);      // Head node (first node)
        Node second = new Node(8);
        Node third = new Node(7);
        Node fourth = new Node(6);
        Node fifth = new Node(5);
        Node sixth = new Node(4);
        
        // Step 2: Link the nodes
        head.next = second;  // 9 -> 8
        second.next = third; // 8 -> 7
        third.next = fourth; // 7 -> 6
        fourth.next = fifth; // 6 -> 5
        fifth.next = sixth;  // 5 -> 4

        printList(head);
        System.out.println();
        head = swapKthNode(head,k);
        printList(head);
    }   
}
