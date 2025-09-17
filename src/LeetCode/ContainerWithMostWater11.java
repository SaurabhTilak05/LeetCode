package LeetCode;

public class ContainerWithMostWater11 {

	public static int maxArea(int[] height) {
		int first=0;
		int last=height.length-1;
		int max=0;
		while(first<last)
		{
			if(height[first]<height[last])
			{
				
				int cont=height[first]*(last-first);
				if(cont>max)
				{
					max=cont;
				}
				first++;
			}
			else if(height[first]>=height[last])
			{
				int cont=height[last]*(last-first);
				if(cont>max)
				{
					max=cont;
				}
				last--;
			}
		}
		
		return max;
		
	    }
	public static void main(String[] args) {
		int ar[]=new int[] {1,1};
		 int result=maxArea(ar);
		 System.out.println("Max is    "+result);
	}

}
