
public class Reverse {
    public static  void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(2);
        ll.add(10);
        ll.add(120);
        ll.add(112);
        System.out.println("Before Reversing : ");
        ll.print();
        System.out.println("After Reversing : ");
        reverse(ll);
        ll.print();

    }

    private static void reverse(LinkedList<Integer> ll) {
        Node<Integer>temp=ll.head;
        Node<Integer>prev=null;
        Node<Integer>next=null;

        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        ll.head=prev;
    }

}
