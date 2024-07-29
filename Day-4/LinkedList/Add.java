
public class Add {
        public static void main(String[] args) {
            Node<Integer> l1 = new Node<>(2);
            l1.next = new Node<>(4);
            l1.next.next = new Node<>(3);

            Node<Integer> l2 = new Node<>(5);
            l2.next = new Node<>(6);
            l2.next.next = new Node<>(4);

            Add add = new Add();
            Node<Integer> result = add.addTwoNumbers(l1, l2);

            printList(result);
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
    public Node<Integer> addTwoNumbers(Node<Integer> l1, Node<Integer> l2) {
        Node<Integer> dummyHead = new Node<>(0);
        Node<Integer> p = l1, q = l2, current = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = 0,y=0;
            if(p != null) {
                x = p.data;
            }
            if(q != null){
                y =q.data;
            }
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new Node<>(sum % 10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            current.next = new Node<>(carry);
        }
        return dummyHead.next;
    }
}