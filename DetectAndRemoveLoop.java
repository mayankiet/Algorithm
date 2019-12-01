package linkedlistProgram;

public class DetectAndRemoveLoop {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void detectLoopAndRemoveLoop(Node node){
        Node slowptr = node;
        Node fastptr = node;

        if(node == null || node.next==null){
            return;
        }

        slowptr = slowptr.next;
        fastptr = fastptr.next.next;

        while (fastptr!=null && fastptr.next!=null){
            if(slowptr==fastptr)
                break;
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        if(slowptr==fastptr){
            slowptr = node;
             while (slowptr.next!=fastptr.next){
                 slowptr = slowptr.next;
                 fastptr = fastptr.next;
             }
             fastptr.next = null;
        }
    }

    public void printList(Node node){
        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args){
        DetectAndRemoveLoop list = new DetectAndRemoveLoop();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);

        list.head.next.next.next.next.next = list.head.next.next;

        list.detectLoopAndRemoveLoop(head);
        list.printList(head);
    }
}
