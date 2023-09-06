package varun;
import java.util.*;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double op1=0,op2=0,result=0;
		char ch;
		while(true)
		{
			System.out.println("Enter the 2 operands");
			op1=sc.nextDouble();
			op2=sc.nextDouble();
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Exit\n"); 
			System.out.println("Enter the operator");
			ch=sc.next().charAt(0);
			switch(ch)
			{
				case '+':result=op1+op2;
					break;
				case '-':result=op1-op2;
					break;
				case '*':result=op1*op2;
					break;
				case '/':result=op1/op2;
					break;
				case 5:System.exit(0);
					break;
			default:System.out.println("Wrong operation");
			}
			System.out.println("Result= "+result);
		}
	}
}