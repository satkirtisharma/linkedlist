public class Doublell {
    public class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        size++;
        Node newNode =new Node(data);

        if (head==null){
            head =newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addlast(int data){
        size++;
        Node newNode =new Node(data);
        if (head==null){
            head =newNode;
            tail=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    public void printLinkedList(){
        if(head==null){
            System.out.println("empty linked list");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertatIndex
    public static void main(String[] args) {
    Doublell dll=new Doublell();
    dll.addfirst(3);
    dll.addfirst(2);
    dll.addfirst(1);
    dll.addlast(4);
    dll.printLinkedList();
    }
}
