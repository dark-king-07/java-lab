package varun;
import java.util.*;
class SquareMatrices
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the square matrice");
		int n=sc.nextInt();
		int res=0;
		for(int i=1;i<=n;i++)
			res+=i*i;
		System.out.println("Number of possible squares is "+res);
	}
}
