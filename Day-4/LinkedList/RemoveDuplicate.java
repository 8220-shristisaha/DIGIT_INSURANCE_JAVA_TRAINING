import java.util.HashSet;

public class RemoveDuplicate{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(2);
        ll.add(10);
        ll.add(2);
        ll.add(12);
        ll.add(120);
        ll.add(112);
        removeDuplicates(ll);
        ll.print();
    }

    private static <T> void removeDuplicates(LinkedList<T> ll) {
        HashSet<T> seen = new HashSet<>();
        Node<T> current = ll.head;
        Node<T> prev = null;
        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next;
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }
}