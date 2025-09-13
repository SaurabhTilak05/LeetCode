/*
	2016. Maximum Difference Between Increasing Elements

*/


import java.util.*;
class Solution {
    public int maximumDifference(int[] nums) {
        int minVal=nums[0];
        int maxD=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>minVal)
            {
                maxD=Math.max(maxD,nums[i]-minVal);
            }
            else
            minVal=Math.min(minVal, nums[i]);
        }
         return maxD;
    }
}
public class MaxMinDiffApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Solution sol=new Solution();
		System.out.println("Enter Array Elements");
		int ar[]=new int[4];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int result=sol.maximumDifference(ar);
		System.out.println("minmax Difference is:  "+result);
	}
	
}