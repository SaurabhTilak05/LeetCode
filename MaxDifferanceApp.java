/*
1432. Max Difference You Can Get From Changing an Integer
*/


import java.util.*;
class Solution {
    public int maxDiff(int num) {
        String s=Integer.toString(num);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(char i='0';i<='9';i++)
        {
            for(char j='0';j<='9';j++)
            {
                if(i==j)
                {
                    continue;
                }
                String rep=s.replace(i, j);
                if(rep.charAt(0)=='0'){
                    continue;
                }
                int val=Integer.parseInt(rep);
                max=Math.max(max, val);
                min=Math.min(min, val);

            }
        }
        return max-min;
    }
}

public class MaxDifferanceApp
{	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=s.nextInt();
		Solution sol=new Solution();
		int result=sol.maxDiff(num);
		System.out.println(result);
	}
}