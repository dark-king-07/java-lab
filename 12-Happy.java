package varun;

import java.util.Scanner;

interface One
{
	interface Two
	{
		public void isHappy(int n);
	}
}
public class Happy implements Two 
{

	public static int sumsquareddigits(int n)
	{
		int a = 0 , sum = 0;
		while(n>0)
		{
		    a = n%10;
			sum += a*a;
			n = n/10;
		}
		return sum;
	}
	
	public void isHappy(int n)
	{
		
		int m = n;
		while(n>0)
		{
			int a = sumsquareddigits(n);
		    if(a < 10)
		    {
		    	if(a == 1)
		    	{
		    		System.out.println(m +" is a happy number");
	                return;	    	
		    	}
		    	else
		    	{
		    		System.out.println(m +" is not a happy number");
		    		return;	
		    	}
		    	
		    }
		    else
		    	n = a;
	   }
   }
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Happy h = new Happy();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        h.isHappy(n);
	}

}
