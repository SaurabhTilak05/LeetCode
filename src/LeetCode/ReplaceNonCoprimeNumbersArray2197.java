package LeetCode;
/*
  2197. Replace Non-Coprime Numbers in Array
 */

import java.util.*;
public class ReplaceNonCoprimeNumbersArray2197 {

	public static int isGCD(int num, int num2)
	{
		while(num2!=0)
		{
			int temp=num2;
			num2=num%num2;
			num=temp;
		}
		return num;
	}
	public static int Lcm(int num, int num2)
	{
		return num /isGCD(num,num2)*num2;
	}
	public static int []replaceNonCoprime(int num[] )
	{
		int n=num.length;
		int stack[]=new int[n];
		int top=-1;
		for(int no:num)
		{
			stack[++top]=no;
			while(top>0)
			{
				int a=stack[top];
				int b=stack[top-1];
				int g=isGCD(a,b);
				if(g>1)
				{
					stack[top-1]=Lcm(a,b);
					top--;
					
				}
				else {
					break;
				}
			}
		}
		
		
		return Arrays.copyOfRange(stack, 0, top+1);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		
		 int result[]=(replaceNonCoprime(ar));
		System.out.println(Arrays.toString(result));
	}

}
