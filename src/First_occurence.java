class Node2
{
  int data;
  Node next;
  Node2(int data)
  {
    this.data=data;
  }
}
public class First_occurence {
  static void searchFirstOccurrence(Node head, int data)
  {
    Node temp=head;
    boolean matchFound=false;
    int ctr=0;
    int found =0;
    int t=0;
    while (temp!=null)
    {
      ctr++;
      if(temp.data==data)
      {
        found=ctr;
        matchFound=true;
        t=1;
      }

      temp=temp.next;
    }
    if (t!=0){
      System.out.println(found);
    }
    if(matchFound==false)
    {
      System.out.println("Match not Found");
    }
  }
  static Node insertBeginning(Node head, int data)
  {
    Node newNode = new Node(data);

    newNode.next = head;
    head = newNode;

    return head;
  }
  static Node addAtEnd(Node head, int data) {
    Node temp=head;
    Node newNode = new Node(data);

    //Checks if the list is empty
    if (head == null) {
      //If list is empty, both head will point to new node
      head = newNode;
    }
    else {
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      temp.next=newNode;
    }
    return head;
  }
  static void display(Node linkedList)
  {
    Node temp=linkedList;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp=temp.next;
    }
  }
  static void insertion(){

  }
  public static void main(String[] args) {
    Node head = null;
    head = insertBeginning(head,15);
    head = insertBeginning(head,10);
    head = insertBeginning(head,5);
    head=addAtEnd(head,20);
    head=addAtEnd(head,10);
    searchFirstOccurrence(head, 10);
    display(head);
  }
}