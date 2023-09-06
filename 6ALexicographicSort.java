package varun;
import java.util.*;
class LexicographicSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String []str=new String[5];
		System.out.println("Enter 5 strings");
		for(int i=0;i<5;i++)
			str[i]=sc.nextLine();
		int l=str.length;
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l-i-1;j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
	System.out.println("After sorting:");
	for(String x:str)
	{
		System.out.println(x);
	}
	} 
}
