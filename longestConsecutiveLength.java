import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        int count=1;
        Arrays.sort(nums);
        int maxlen=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            if(nums[i+1]==nums[i]+1)
            {
                count++;
            }
            else{
                count=1;
            }
          if(maxlen<count)
          {
            maxlen=count;
          }
        }
        return maxlen;
    }
}
public class longestConsecutiveLength
{
	public static void main(String x[])
	{
		Scanner s=new Scanner (System.in);
		int ar[]=new int[6];
		System.out.println("Enter array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		Solution sol=new Solution();
		int result=(sol.longestConsecutive(ar));
		System.out.println("length is:   "+result);
		
	}
}