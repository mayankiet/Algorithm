package linkedlistProgram;

public class MiddleElement {

    LinkedNode head;

    MiddleElement(){
        head = null;
    }

    public void findMiddleElement(){
        LinkedNode p = head;
        LinkedNode q = head;

        while (q.next!=null){
            p = p.next;
            q = q.next.next;
        }
        System.out.println(p.data);
    }

    public void insertNode(int node){
        LinkedNode temp = new LinkedNode(node);
        LinkedNode current = head;

        if(current==null){
            head = temp;
            return;
        }
        while (current.next!=null){
            current = current.next;
        }

        current.next = temp;
    }

    public void displayList()
    {
        LinkedNode temp = head;
        if(temp == null) {
            return;
        }

        while(temp.next != null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args){
        MiddleElement list = new MiddleElement();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);

        list.displayList();

        list.findMiddleElement();
    }
}
