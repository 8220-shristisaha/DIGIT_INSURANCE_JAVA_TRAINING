class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    Node<T> head;
    public LinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void delete() {
        if (head != null) {
            Node<T> temp = head.next;
            head.next = null;
            head = temp;
        }
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public Node<T> findNthFromEnd(int n) {
        if (head == null || n <= 0) {
            return null;
        }

        Node<T> mainPtr = head;
        Node<T> refPtr = head;

        for (int i = 0; i < n; i++) {
            if (refPtr == null) {
                return null; // n is greater than the number of nodes in the list
            }
            refPtr = refPtr.next;
        }

        while (refPtr != null) {
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }

        return mainPtr;
    }
}

class NNode {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n = 2;
        Node<Integer> nthNode = list.findNthFromEnd(n);
        if (nthNode != null) {
            System.out.println("The " + n + "th node from the end is: " + nthNode.data);
        } else {
            System.out.println("The list is shorter than " + n + " nodes.");
        }
    }
}