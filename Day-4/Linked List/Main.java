class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data= data;
        this.next=null;
    }
}
class LinkedList<T>{
    Node<T>head;
    public LinkedList(){
        this.head=null;
    }
    public void add(T data){
        Node<T> newNode= new Node<>(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node<T> temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void delete(){
        Node<T>temp=head.next;
        head.next=null;
        head=temp;


    }
    public void print(){
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }


}
class Main {
    public static void main(String args[]){
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(12);
        ll.add(16);
        ll.add(15);
        ll.add(5);
        ll.add(115);
        System.out.println("Adding data at the end :");
        ll.print();
        System.out.println("\nAfter Deleting a node at beginning :");
        ll.delete();
        ll.print();



    }
}
