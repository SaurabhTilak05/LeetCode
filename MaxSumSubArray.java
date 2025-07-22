/*
53. Maximum Subarray
Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:Input: nums = [1]
Output: 1    Explanation: The subarray [1] has the largest sum 1.
Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23. 

Follow up: If you have figured out the O(n) solution, try coding another 
solution using the divide and conquer approach, which is more subtle.
*/

import java.util.*;
public class MaxSumSubArray
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int maxSum=ar[0];
		int current=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(current+ar[i]>ar[i]){
				current=current+ar[i];
			}
			else{
				current=ar[i];
			}
			if(maxSum<current)
			{
				maxSum=current;
			}
		}
	System.out.println("Max Sum is: "+maxSum);
	}
	
}
