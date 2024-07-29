public class MergeTwoSortedLinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(1);
        ll1.add(3);
        ll1.add(5);

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(2);
        ll2.add(4);
        ll2.add(6);

        LinkedList<Integer> newList = mergeTwoLists(ll1, ll2);
        newList.print();
    }

    private static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> tail = dummy;
        Node<Integer> p1 = l1.head;
        Node<Integer> p2 = l2.head;

        while(p1!=null && p2!=null) {
            if (p1.data <= p2.data) {
                tail.next = p1;
                p1 = p1.next;
            } else {
                tail.next = p2;
                p2 = p2.next;
            }
            tail = tail.next;
        }

        if (p1 != null) {
            tail.next = p1;
        } else {
            tail.next = p2;
        }

        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.head = dummy.next;
        return mergedList;
    }
}