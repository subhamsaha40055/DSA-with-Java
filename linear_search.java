import java.io.*;
import java.util.*;
class lin_search
{
    int index;
    int linear(int k,int s,int a[])
    {
        for(int i=1;i<=s;i++)
        {
            if(a[i]==k)
            {
                index=i;
            }
        }
        return index;
    }

}
class linear_search
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        lin_search obj=new lin_search();
        int arr[]=new int[100];
        System.out.println("enter the size of the 1D array");
        int size=sc.nextInt();
        System.out.println("Enter the element");
        for(int i=1;i<=size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element which will be search in the above array:");
        int search=sc.nextInt();
        int result=obj.linear(search,size,arr);
        if(arr[result]==search)
        {
            System.out.println("element found in the index No.:"+result);
        }
        else
        {
            System.out.println("Item not found in the above array.");
        }

    }
}