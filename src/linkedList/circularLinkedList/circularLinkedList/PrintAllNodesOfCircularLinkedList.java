package linkedList.circularLinkedList.circularLinkedList;

public class PrintAllNodesOfCircularLinkedList {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(10);
        head.next.next.next.next = head;
        printAllNodes(head);
    }
    public static void printAllNodes(Node head) {
        if(head == null){
            return ;
        }
        System.out.print(head.data +" ");
        for(Node curr = head.next; curr != head; curr = curr.next){
            System.out.print(curr.data + " ");
        }
    }
}
