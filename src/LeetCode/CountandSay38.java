package LeetCode;

import java.util.Scanner;

class Solution1 {
    public String countAndSay(int n) {
        if(n==1)
        return "1";
        String str="1";
        
        for(int i=1;i<n;i++)
        {
            StringBuilder sb=new StringBuilder();
           
              char ch[]=str.toCharArray();
               int count=1;
            for(int j=1;j<=ch.length;j++)
            {
              
                if(j<ch.length && ch[j]==ch[j-1]){
                    count++;
                }
                else{
                    sb.append(count).append(ch[j-1]);
                    count=1;
                }
            }
            str=sb.toString();
        }
        return str;
    }
}
public class CountandSay38 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Solution1 sol=new Solution1();
		System.out.println("Enter number");
		int n=s.nextInt();
		String result=sol.countAndSay(n);
		System.out.println(result);

	}

}
