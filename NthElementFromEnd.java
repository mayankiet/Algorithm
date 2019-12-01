package linkedlistProgram;

public class NthElementFromEnd {

    LinkedNode head;

    NthElementFromEnd(){
        head = null;
    }

    public void findNthElementFromEnd(int n){
        LinkedNode p = head;
        LinkedNode q = head;
        int count = 0;

        while (count<n){
            if(q==null){
                return;
            }
            q = q.next;
            count++;
        }

        while(q!=null){
            p = p.next;
            q = q.next;
        }
        System.out.println(p.data);
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

    public static void main(String ar[])
    {
        NthElementFromEnd list = new NthElementFromEnd();
        list.insertNode(3);
        list.insertNode(7);
        list.insertNode(1);
        list.insertNode(9);
        list.insertNode(4);
        list.insertNode(8);
        list.insertNode(12);
        list.insertNode(19);

        list.displayList();

        list.findNthElementFromEnd(4);

    }

}
