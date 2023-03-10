public class DoublyLL {
    class  Node{

        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }


    }
    public Node head;
    public Node tail;
    public static int size;
    void add(int data){
        Node newNode =new Node(data);
        size++;
        Node temp=head;
        if(head==null){
            head=newNode;
            return;
        }
       newNode.next=temp;
        newNode.prev=null;
        head=newNode;

    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
     void insertAtEnd( int dataForNewNode)
    {
        Node tempLL=head;
        Node currentNode=tempLL;
        Node newNode=new Node(dataForNewNode);
        if(tempLL==null)
        {
            tempLL=newNode;
        }
        else
        {
            while (currentNode.next!=null)
            {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
            newNode.prev=currentNode;
        }

    }



    public static void main(String[] args) {
      DoublyLL dll=new DoublyLL();
      dll.add(10);
      dll.add(30);
      dll.add(40);
      dll.add(50);
      dll.insertAtEnd(60);
      dll.display();

    }
}
