//WAP to implement all basic operation(push,pop,peek,traversing/display/print) of stack using array.
import java.io.*;
import java.util.*;
class STK
{
    Scanner sc=new Scanner(System.in);
    int top,size,element;
    int stack[]=new int[100];
    STK() //main constructor.
    {
        int choice;
        top=-1;
        System.out.println("enter the size of your stack[maximum 100]:");
        size=sc.nextInt();
        //include menu driven program.
        do
        {
            System.out.println("::Stack Operation::");
            System.out.println("press [1] for push operation.\npress [2] for pop operation.\npress [3] for peek operation.\npress [4] for traversing operation.\npress [5] for exit the program.");
            System.out.println("enter your choice:");
            choice=sc.nextInt();
            switch (choice) 
            {
                case 1:
                {
                    push();
                    break;
                }
                case 2:
                {
                    pop();
                    break;
                }
                case 3:
                {
                    peek();
                    break;
                }
                case 4:
                {
                    traversing();
                    break;
                }
                case 5:
                {
                    System.out.println("Exit the code.");
                    break;
                }
                default:
                {
                    System.out.println("Enter a valid choice.the choices are:[1/2/3/4/5].");
                }
                
            }
        }while(choice!=5);
    }
    //create push method
    void push()
    {
        if(top==(size-1))
        {
            System.out.println("Stack is overflow.");
        }
        else
        {
            System.out.println("enter the element that will be pushed in the stack:");
            element=sc.nextInt();
            top=top+1;
            stack[top]=element;
        }
    }
    //create pop method
    void pop()
    {
        if(top==(-1))
        {
            System.out.println("stack is underflow.");
        }
        else
        {
            System.out.println("the popped element is "+stack[top]);
            top=top-1;
        }

    }
    //create peek method
    void peek()
    {
        System.out.println("top most element in the stack is: "+stack[top]);
    }
    //create traversing method
    void traversing()
    {
        if(top==(-1))
        {
            System.out.println("stack is empty.");
        }
        else
        {
            System.out.println("In the stack, the elements are: ");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[i]);
            }
        }
    }
}
class Stack
{
    public static void main(String args[])
    {
        STK obj=new STK();
    }
}