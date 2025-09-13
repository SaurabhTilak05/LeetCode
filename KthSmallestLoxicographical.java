import java.util.Scanner;

class Solution {
    public int findKthNumber(int n, int k) {
       int current=1;
       k--;
       while(k>0)
       {
        long step=count(n, current, current+1);
       if(step<=k) {
        current++;
        k-=step;
        }
        else{
            current*=10;
            k--;
        }
       }
       return current;
    }
    public long count(int n, long first , long last)
    {
        long sum=0;
        while(first<=n){
            sum+=Math.min(n+1L, last)-first;
            first*=10;
            last*=10;
        }
        return sum;
    }
}
public class KthSmallestLoxicographical
{
    public static void main(String x[])
    {
        Scanner s=new Scanner(System.in);
        Solution sol=new Solution();
        System.out.println("Enter Number");
        int n=s.nextInt();
        System.out.println("Enetr Kth Value");
        int k=s.nextInt();
        int result=sol.findKthNumber(n, k);
        System.out.println("Kth smallest Element is:  "+result);
    }
}