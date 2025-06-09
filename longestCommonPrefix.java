/* 14.Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/

import java.util.Scanner;

class longestPref {
    public String longCommonPrefix(String[] strs) {
        if( strs == null || strs.length == 0)
        {
            return "";
        }
        if(strs.length == 1)
        {
            return strs[0];
        }
        String first=strs[0];
        for(int i=0;i<first.length();i++)
        {
            char cur=first.charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || strs[j].charAt(i)!=cur)
                {
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}
public class longestCommonPrefix{
    public static void main(String x[])
    {
        Scanner s=new Scanner(System.in);
        longestPref lp=new longestPref();
        System.out.println("Enter numbers of strings");
        int no=s.nextInt();
        String str[]=new String[no];
        s.nextLine();
        System.out.println("Enter String ");
        for(int i=0;i<str.length;i++)
        {
            str[i]=s.nextLine();
        }
        String result=lp.longCommonPrefix(str);
        System.out.println("Longest Comman Prefix is:  "+result);
    }
}
