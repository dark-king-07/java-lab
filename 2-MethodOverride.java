package varun;

import java.util.Scanner;

class Parent
{
	public void operation(int a[][],int r , int c)
	{
		int even=0,odd=0;
		for(int x[] : a )
		{
			for(int y : x)
			{
				if(y % 2 == 0)
					even++;
				else
					odd++;
			}
		}
		int evenarray[] = new int[even];
		int oddarray[] = new int[odd];
		for(int x[] : a )
		{
			for(int y : x)
			{
				if(y % 2 == 0)
					evenarray[--even] = y;
				else
					oddarray[--odd] = y;
			}
		}
	}
}
public class MethodOverride extends Parent 
{
	public void operation(int a[][],int r , int c)
	{
	  super.operation(a, r, c);
	  int t[][] = new int[c][r];
	  for(int i = 0 ; i < c ; i++)
	  {
		  for(int j = 0 ; j < r ; j++)
		  {
			  t[i][j] = a[j][i];
		  }
	  }
	  System.out.println("After transpose:");
	  for(int x[] : t)
	  {
		  for(int y : x)
		  {
			  System.out.print(y +" ");
		  }
		  System.out.println("");
	  }
	}

	public static void main(String[] args) 
	{
		MethodOverride m = new MethodOverride();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns of the matrix");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a[][] = new int[r][c]; 
		System.out.println("Enter the " +(r*c) +" elements of the matrix");
		for(int i = 0 ; i < r ; i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				a[i][j] = sc.nextInt();
			} 
		}
		m.operation(a,r,c);
	}
}
