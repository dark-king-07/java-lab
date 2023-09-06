package varun;
import java.util.*;
class Pyramid
{
	public static void main(String[] args) 
	{
		System.out.println("Enter no. of levels: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print("  ");
			}
			for(int k=i;k<=2*i-1;k++) 
			{
				System.out.print(k+" ");
			}
			for(int l=2*i-2;l>=i;l--)
				{ 
				System.out.print(l+" ");
				}
			System.out.println();
		}
	}
}

