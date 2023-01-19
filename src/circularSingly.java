 class Nodesl{
         int data;
        Node next;
        Nodesl(int data){
            this.data=data;
        }
    }
 public class circularSingly {
    public static void addlast(int data,Node temp){
        Node n=new Node(data);
        if(temp==null){
            n.next=n;
            temp=n;
            return;
        }
        Node copy=temp;
        while (copy.next!=copy){

        }
    }
    public static void delete(Node temp){
        while (temp.next!=temp){

        }

    }
    public static void main(String[] args) {
       Node temp=null;
        addlast(5,temp);
    }
}
