package varun;
import java.util.*;
public class AddMatrices 
{
    public static void add(int a[][],int b[][],int r,int c)
    {
    	int res[][] = new int[r][c];
    	System.out.println("Sum is:");
    	for(int i=0;i<r;i++)
    	{
    		for(int j=0;j<c;j++)
    		{
    			res[i][j] = a[i][j] + b[i][j];
    			System.out.print(res[i][j]+" ");
    		}
    		System.out.println("");
    	}
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the rows and columns of first mstrix");
	    int r1=sc.nextInt();
	    int c1=sc.nextInt();
	    System.out.println("Enter the rows and columns of second mstrix");
	    int r2=sc.nextInt();
	    int c2=sc.nextInt();
	    if(r1==r2 && c1==c2)
	    {
	    	int a[][] = new int[r1][c1];
	    	int b[][] = new int[r2][c2];
	    	System.out.println("Enter the " +(r1*c1) +" elements of the first mstrix");
	    	for(int i=0;i<r1;i++)
	    	{
	    		for(int j=0;j<c1;j++)
	    		{
	    			a[i][j] = sc.nextInt();
	    		}
	    	}
	    	System.out.println("Enter the " +(r2*c2) +" elements of the second mstrix");
	    	for(int i=0;i<r2;i++)
	    	{
	    		for(int j=0;j<c2;j++)
	    		{
	    			b[i][j] = sc.nextInt();
	    		}
	    	}
	    	add(a,b,r1,c1);
	    }
	    else
	    	System.out.println("Addition not possible");
	}

}
