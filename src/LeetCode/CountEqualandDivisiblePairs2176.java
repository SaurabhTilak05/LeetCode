package LeetCode;

/*
  Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n,
  such that nums[i] == nums[j] and (i * j) is divisible by k.
 */
import java.util.*;

public class CountEqualandDivisiblePairs2176 {
		public static int countPairs(int[] nums, int k) {
			int count=0;
			for(int i=0;i<nums.length;i++)
			{
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]==nums[j] && (i*j)%k==0)
					{
						count++;
					}
				}
			}
			return count;
		}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements");
		int ar[]=new int[7];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter k th value ");
		int k=s.nextInt();
		int result =countPairs(ar, k);
		System.out.println(result);
	}

}
