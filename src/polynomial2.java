class Node3{
    int coff;
    int degree;
    Node3 next;
    Node3(int c,int d){
        coff=c;
        degree=d;
    }
}
class operation{
    Node3 head=null;
    Node3 taill = null;

    void insertatlast(int c, int d) {
        Node3 n = new Node3(c, d);
        if (head == null) {
            head = taill = n;

        } else {
            taill.next = n;
            taill = n;
        }
    }
    void polyadd(operation a,operation b)
    {
        Node3 temp1=a.head;
        Node3 temp2=b.head;
        if(temp1==null&&temp2==null){
            while (temp1!=null){
                temp2=b.head;
                while (temp2!=null){
                    if (temp1.degree==temp2.degree){
                        System.out.println("for degree ="+temp1.degree+"sum is"+(temp1.coff+temp2.coff));
                    }
                    temp2=temp2.next;
                }
                temp1=temp1.next;
            }
        }


    }
}
public  class polynomial2 {
    public static void main(String[] args) {
        operation ll1,ll2;
        ll1=new operation();
        ll2=new operation();
        ll1.insertatlast(12,2);
        ll1.insertatlast(4,1);
        ll1.insertatlast(5,0);
        ll2.insertatlast(72,1);
        ll2.insertatlast(16,0);
        ll2.insertatlast(7,2);
        ll1.polyadd(ll1,ll2);

    }
}