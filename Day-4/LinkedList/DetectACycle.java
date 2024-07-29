public class DetectACycle {
    public static  void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(2);
        ll.add(10);
        ll.add(120);
        ll.add(112);

        ll.head.next.next.next.next.next = ll.head.next;

        System.out.println("Cycle detected: " + hasCycle(ll));

    }
    private static boolean hasCycle(LinkedList<Integer> ll) {
        Node<Integer> slow = ll.head;
        Node<Integer> fast = ll.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
