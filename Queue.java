//WAP to implement all basic operation on queue in an array.
import java.io.*;
import java.util.*;
class Q 
{
    Scanner sc=new Scanner(System.in);
    int queue[]=new int[100];
    int front,element,rear,size;
    Q(int front,int rear) // main constructor.
    {
        int choice;
        System.out.println("enter the size of your Queue[maximum 100]:");
        size=sc.nextInt();
        do
        {
            System.out.println("::Queue Operation::");
            System.out.println("press [1] for Insertion Operation.\npress [2] for Deletion operation.\npress [3] for Traversing operation.\npress [4] for Exit.");
            System.out.println("enter your choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    insertion();
                    break;
                }
                case 2:
                {
                    deletion();
                    break;
                }
                case 3:
                {
                    traversing();
                    break;
                }
                case 4:
                {
                    System.out.println("Exit the program.");
                }
                default:
                {
                    System.out.println("Enter right choice [1/2/3/4].");
                }
            }
        }while(choice!=4);
    }
    //inert operation.
    void insertion()
    {
        if(rear==size-1)
        {
            System.out.println("Queue is Overflow.");
        }
        if(rear==-1 && front==-1)
        {
            front=0;
            rear=0;
        }
        else
        {
            System.out.println("Enter a element to be inserted in queue:");
            element=sc.nextInt();
            queue[rear]=element;
            rear=rear+1;
            
        }
    }
    //delete operation.
    void deletion()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is underflow.");
        }
        else
        {
            System.out.println("The deleted element is:"+queue[front]);
            front=front+1;
        }

    }
    //traversing operation.
    void traversing()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is underflow.");
        }
        else
        {
            System.out.println("In the Queue,the elements are:");
            for(int i=front;i<rear;i++)
            {
                System.out.println(queue[i]);
            }
        }
    }
}   
class Queue
{
    public static void main (String args[])
    {
        int front=-1;
        int rear=-1;
        Q obj=new Q(front,rear);
    }
}