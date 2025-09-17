package LeetCode;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=-1;
        int end=-1;
      for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(st==-1)
                {
                    st=i;
                }
                end=i;
            }
        }
        return new int[]{st,end};
    }
}
public class FindFirstLastPElemSArray34 {

	public static void main(String[] args) {
		Solution sol=new Solution();
		int ar[]=new int[] {5,7,7,8,8,10};
		int t=8;
		int result[]=sol.searchRange(ar,t);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+"\t");
		}
	}

	

}
