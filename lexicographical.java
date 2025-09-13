/* 386. Given an integer n, return all the numbers in the range [1, n] sorted in lexicographical order.
You must write an algorithm that runs in O(n) time and uses O(1) extra space. 
Example 1:
Input: n = 13
Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]
Example 2:
Input: n = 2
Output: [1,2]
*/
import java.util.*;
class Lexicogragph {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            if(i<=n)
            {
                dfs(i,n, result);
            }
        }
        return result;
    }
    public void dfs(int currentNum, int n , List<Integer> result)
    {
        result.add(currentNum);
        for(int i=0;i<=9;i++)
        {
            long nextNum=(long)currentNum*10+i;
            if(nextNum>n)
            {
                break;
            }
            dfs((int)nextNum, n,result);
        }
    }
}
public class lexicographical 
{
    public static void main(String x[])
    {
        Scanner s=new Scanner(System.in);
        Lexicogragph lg=new Lexicogragph();
        System.out.println("Enter Number:");
        int n=s.nextInt();
        System.out.println("lexicographical order is"+lg.lexicalOrder(n));
    }
}