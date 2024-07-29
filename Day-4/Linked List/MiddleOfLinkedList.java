public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(2);
        ll.add(10);
        ll.add(120);
        ll.add(112);
        System.out.println("Middle element: " + findMiddle(ll));
    }

    private static int findMiddle(LinkedList<Integer> ll) {
        Node<Integer> slow = ll.head;
        Node<Integer> fast = ll.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
