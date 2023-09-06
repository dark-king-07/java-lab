package varun;

import java.util.Scanner;

public class BinarySearch 
{
    public static void func(int a[])
    {
    	System.out.println("Before sorting:");
    	for(int x : a)
    		System.out.print(x +" ");
    	int l = a.length;
    	for(int i = 0 ; i < l ; i++)
    	{
    		for(int j = 0 ; j < l-i-1 ; j++)
        	{
        		if(a[j] > a[j+1])
        		{
        			int temp = a[j];
        			a[j] = a[j+1];
        			a[j+1] = temp;
        		}
        	}
    	}
    	System.out.println("\nAfter sorting:");
    	for(int x : a)
    		System.out.print(x +" ");
    }
    
    public static void func(int a[] , int key)
    {
    	int low = 0;
    	int high = a.length-1;
    	while(low<=high)
    	{
    		int mid = (low+high)/2;
    		if(key == a[mid])
    		{
    			System.out.println("Key found at:"+mid);
    			return;
    		}
    		else if(key > a[mid])
    		{
    			low = mid+1;
    		}
    		else
    		{
    			high = mid-1;
    		}
    	}
    	System.out.println("Key not found");
    }
    
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number of elements");
	   int n = sc.nextInt();
	   int a[] = new int[n];
	   System.out.println("Enter the " +n +" elements");
	   for(int i = 0 ; i < n ; i++)
		   a[i] = sc.nextInt();
	   System.out.println("Enter the key");
	   int key = sc.nextInt();
	   func(a);
	   func(a,key);
	}
}
