public class Linkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
        Node newNode =new Node(data);
        size++;
        if (head==null){
            head =newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addlast(int data){
        Node newNode =new Node(data);
        size++;
        if (head==null){
            head =newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
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
    public void addatIndex(int Index,int data){
        if(Index==0){
            addfirst(data);
            return;
        }
        Node temp=head;
        Node newNode=new Node(data);
        size++;
        int i=0;
        while (i+1<Index){
            temp=temp.next;
            i++;
        }
        Node temp2=temp.next;
        temp.next=newNode;
        newNode.next=temp2;

    }
    public void removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
        } else if (size==1) {
            head=null;
            tail=null;
            size=0;
        }
        Node temp=head.next;
        head=temp;
        size--;
    }
    public void removeLast(){
        if(size==0){
            System.out.println("ll is empty");
        }
        else if (size==1) {
            head=null;
            tail=null;
            size=0;
        }
        Node temp=head;
        int i=1;
        while (i<size-1){
            temp=temp.next;
            i++;
        }
        tail = temp;
        temp.next=null;
        size--;
    }
    static Node deleteNode(Node tempLL, int pos)
    {
        Node currentNode=tempLL;
        boolean lessNode=false;
        int counter=0;
        if(pos>1) {
            while (currentNode != null && counter < pos - 2) {
                counter++;
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
        else
        {
            currentNode=currentNode.next;
            tempLL=currentNode;
        }
        return tempLL;
    }
    int searchkey(int data){
        Node temp=head;
        int i=1;
        while (temp!=null){
            if(temp.data==data){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail= head;
        Node next;
        while (curr!=null){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deletefromend(int epos){
        int pos=size-epos;
        int i=1;
        Node temp=head;
        while (i<pos){
            temp=temp.next;
            i++;
        }

        temp.next=temp.next.next;


    }



    public static void main(String[] args) {
        Linkedlist ll =new Linkedlist();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(7);
        ll.addlast(5);
        ll.addatIndex(3,4);
       // ll.removeFirst();
//        System.out.println(size);
       // ll.removeLast();
      //  System.out.println("postion"+ll.searchkey(7));
       // ll.reverse();
        ll.printLinkedList();
        ll.deletefromend(2);
        System.out.println("ds");
        ll.printLinkedList();

    }
}
