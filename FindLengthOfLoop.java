package linkedlistProgram;

public class FindLengthOfLoop {

    static Node head;

    class Node{
        int d;
        Node next;
        Node(int data){
            d = data;
            next = null;
        }
    }

    public void detectAndFindLengthOfLoop(){

    }

    public void insertNode(int data){
        Node temp = new Node(data);
        Node current = head;

        if(current == null){
            current = temp;
            return;
        }

        while(current.next!=null){
            current = current.next;
        }
        current.next = temp;
    }

    public void displayList(){
        Node listPrint = head;
        if (listPrint == null){
            return;
        }

        while (listPrint.next!=null){
            System.out.println(listPrint.d);
            listPrint = listPrint.next;
        }

    }
    public static void main(String[] args){
        FindLengthOfLoop list = new FindLengthOfLoop();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);

        list.displayList();
    }
}
