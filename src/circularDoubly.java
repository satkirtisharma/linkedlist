//class Node{
//    public boolean degree;
//    Node temp;
//    int data;
//    Node next;
//
//    Node prev;
//    Node(int data){
//       this.data=data;
//
//    }
//}
//public class circularDoubly {
//    public  static Node addlast(int data ,Node head){
//        Node n=new Node(data);
//        Node temp=head;
//        if (temp==null){
//            n.next=n;
//            n.prev=n;
//            temp=n;
//            return temp;
//        }
//        Node copy=temp;
//        n.next=copy;
//        while (copy.next!=copy){
//            copy=copy.next;
//        }
//        n.prev=copy;
//        return temp;
//    }
//    public static void print(Node temp){
//        Node copy=temp;
//       // System.out.println(temp.data);
//        //temp=temp.next;
//        while (temp.next!=copy){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//    }
//    public static void main(String[] args) {
//        Node temp=null;
//        addlast(5,temp);
//        addlast(6,temp);
//        addlast(7,temp);
//        addlast(8,temp);
//        print(temp);
//
//    }
//
//}
