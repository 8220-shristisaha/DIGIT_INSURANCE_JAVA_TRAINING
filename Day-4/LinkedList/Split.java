public class Split{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(2);
        ll.add(10);
        ll.add(120);
        ll.add(112);

        LinkedList<Integer>[] halves = splitList(ll);
        System.out.print("First half: ");
        halves[0].print();
        System.out.print("Second half: ");
        halves[1].print();
    }

    private static <T> LinkedList<T>[] splitList(LinkedList<T> ll) {
        Node<T> slow = ll.head;
        Node<T> fast = ll.head;
        Node<T> prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedList<T> firstHalf = new LinkedList<>();
        firstHalf.head = ll.head;

        LinkedList<T> secondHalf = new LinkedList<>();
        secondHalf.head = slow;

        if (prev != null) {
            prev.next = null;
        }

        return new LinkedList[]{firstHalf, secondHalf};
    }
}