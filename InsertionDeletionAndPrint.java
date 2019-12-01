package linkedlistProgram;

public class InsertionDeletionAndPrint {

    LinkedNode head;

    InsertionDeletionAndPrint()
    {
        head = null;
    }

    public void insertNode(int data){

        LinkedNode temp = new LinkedNode(data);
        LinkedNode curr = head;
        if(curr == null)
        {
            head = temp;
            return;
        }
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = temp;

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

    public void deleteNode(int node){
        LinkedNode p = head;
        LinkedNode q = head;

        if(p == null){
            return;
        }

        while (p.data!=node){
            p = p.next;
            q = p;
        }
        q.next = p.next;
        p.next = null;
    }

    public static void main(String ar[])
    {
        InsertionDeletionAndPrint list = new InsertionDeletionAndPrint();
        list.insertNode(3);
        list.insertNode(7);
        list.insertNode(1);
        list.insertNode(9);

        list.displayList();

        list.deleteNode(1);

        list.displayList();
    }



}
