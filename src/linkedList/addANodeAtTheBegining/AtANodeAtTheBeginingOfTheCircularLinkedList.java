package linkedList.addANodeAtTheBegining;

public class AtANodeAtTheBeginingOfTheCircularLinkedList {
    public static void main(String[] args) {
        int newNode = 3;
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head;
        Node allNodes = printAllNodeAfterAdditionOfNewNode(head,newNode);
        printNodes(allNodes);
    }
    public static void printNodes(Node allNodes){
        Node c = allNodes;
        while(c.next != allNodes){
            System.out.print(c.data + " ");
            c = c.next;
        }
    }

    public static Node printAllNodeAfterAdditionOfNewNode(Node head, int newNode){
//        Node valOfNewNode = new Node(newNode);
//        if(head == null){
//            valOfNewNode.next = valOfNewNode;
//        }else{
//            Node curr = head;                   // this takes O(n) time
//            while(curr.next != head) {
//                curr = curr.next;
//                curr.next = valOfNewNode;
//                valOfNewNode.next = head;
//            }
//        }
//        return valOfNewNode;

        //this will take O(1) time
        Node temp = new Node(newNode);
        Node curr = head;
        if(head == null) {
            temp.next = temp;
        }else {
            temp.next = curr.next;
            curr.next = temp;
            int t = temp.data;
            temp.data = curr.data;
            curr.data = t;
        }
        return head;
    }
}
