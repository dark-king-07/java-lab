package varun;
import java.util.*;
class DigitSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 digit number");
		int n=sc.nextInt();
		int m=n;
		while(n>0)
		{
			int a=n%10;
			int b=n/10;
			int sum=a+b;
			if(sum>9)
				n=sum;
			else
			{
				System.out.println("Digit sum of "+m+" is "+sum);
				break;
			}
		}
	}
}