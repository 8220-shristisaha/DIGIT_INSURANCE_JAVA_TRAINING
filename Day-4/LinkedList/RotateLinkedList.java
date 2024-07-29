class Rotate {
    public <T> Node<T> rotateRight(Node<T> head, int k) {
        if (head == null || k == 0) return head;
        Node<T> current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        current.next = head;
        k = k % length;
        int stepsToNewHead = length - k;
        Node<T> newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }
        Node<T> newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
public class RotateLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        head.next.next.next = new Node<>(4);
        head.next.next.next.next = new Node<>(5);
        Rotate rotate = new Rotate();
        Node<Integer> newHead = rotate.rotateRight(head, 2);
        printList(newHead);
    }

    public static void printList(Node<Integer> node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
    }
}