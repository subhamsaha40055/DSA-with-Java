import java.io.*;
import java.util.*;
class binary_Search_technique
{
    int index;
    int binary(int arr[],int size,int search)
    {
        int lb=0,ub=(size-1),mid=(lb+ub)/2; // lb=lower bound of the array. // ub=Upper bound of the array
        while(search!=arr[mid] && lb<=ub) // this loop will run until the arr[mid]==search and lb<=ub
        {
            if(search<arr[mid])
            {
                ub=mid-1;
            }
            if(search>arr[mid])
            {
                lb=mid+1;
            }
            mid=(lb+ub)/2;
        }
        if(arr[mid]==search)
        {
            index=mid;
        }
        return index; // return the index no.
    }
   
}
class Binary_search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        binary_Search_technique obj=new binary_Search_technique();
        int arr[]=new int[100];
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements in to array:");
        for(int i=1;i<=size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element which will be searched in the above array:");
        int search=sc.nextInt();
        int result=obj.binary(arr,size,search);
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
