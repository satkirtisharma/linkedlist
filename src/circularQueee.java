import java.util.Scanner;

class CircularQueue
{
    static private int front, rear, capacity;
    static private int queue[];

    CircularQueue(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }
    static void enQueue(int data)
    {
        if(((rear+1)%capacity)==front)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            if(front==-1 && rear==-1)
            {
                front=rear=0;
            }
            else if(rear==capacity-1 && front!=0)
            {
                rear=0;
            }
            else
            {
                rear=(rear+1)%capacity;
            }
            queue[rear]=data;
        }
    }
}
public class circularQueee {

    public static void main(String[] args) {
        System.out.println("Enter the capacity of Circular Queue");
        CircularQueue cq=new CircularQueue(new Scanner(System.in).nextInt());
        while (true)
        {
            System.out.println("1: for Enqueue\n2: for Exit");
            switch (new Scanner(System.in).nextInt())
            {
                case 1:
                    System.out.println("Input a number for insertion: ");
                    cq.enQueue(new Scanner(System.in).nextInt());
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}