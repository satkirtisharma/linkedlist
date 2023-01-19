//class Node
//{
//    int data;
//    Node next;
//    Node(int data)
//    {
//        this.data=data;
//    }
//}
//public class lastoccurence {
//    static void searchFirstOccurrence(Node head, int data)
//    {
//        Node temp=head;
//        boolean matchFound=false;
//        int ctr=0;
//        while (temp!=null)
//        {
//            ctr++;
//            if(temp.data==data)
//            {
//                System.out.println(data+": Match found at Node: "+ctr);
//                matchFound=true;
//                break;
//            }
//            temp=temp.next;
//        }
//        if(matchFound==false)
//        {
//            System.out.println(data+": Match not Found");
//        }
//    }
//
//    static void searchLastOccurrence(Node head, int data)
//    {
//        Node temp=head;
//        int ctr=0;
//        int lastSearched=0;
//        while (temp!=null) {
//            ctr++;
//            if (temp.data == data) {
//                lastSearched = ctr;
//            }
//            temp=temp.next;
//        }
//        if(lastSearched>0)
//            System.out.println("Last Occurrence of Searched Element "+data+": at Node "+lastSearched);
//        else
//            System.out.println(data+": Element not found");
//    }
//
//    static Node insertBeginning(Node head, int data)
//    {
//        Node newNode = new Node(data);
//
//        newNode.next = head;
//        head = newNode;
//
//        return head;
//    }
//    static Node addAtEnd(Node head, int data) {
//        Node temp=head;
//        Node newNode = new Node(data);
//
//        //Checks if the list is empty
//        if (head == null) {
//            //If list is empty, both head will point to new node
//            head = newNode;
//        }
//        else {
//            while(temp.next!=null)
//            {
//                temp=temp.next;
//            }
//            temp.next=newNode;
//        }
//        return head;
//    }
//    static void display(Node linkedList)
//    {
//        Node temp=linkedList;
//        while(temp!=null)
//        {
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println();
//    }
//    static Node deleteNode(Node tempLL, int pos)
//    {
//        Node currentNode=tempLL;
//        boolean lessNode=false;
//        int counter=0;
//        if(pos>1) {
//            while (currentNode != null && counter < pos - 2) {
//                counter++;
//                currentNode = currentNode.next;
//            }
//            currentNode.next = currentNode.next.next;
//        }
//        else
//        {
//            currentNode=currentNode.next;
//            tempLL=currentNode;
//        }
//        return tempLL;
//    }
//    public static void main(String[] args) {
//        Node head = null;
//      head = insertBeginning(head,15);
////        head = insertBeginning(head,20);
////        head = insertBeginning(head,5);
////        head=addAtEnd(head,20);
////        head=addAtEnd(head,88);
//      //  display(head);
//  //      searchFirstOccurrence(head, 10);
//       // searchLastOccurrence(head, );
//        display(head);
//        deleteNode(head,1);
//        display(head);
//
//    }
//}