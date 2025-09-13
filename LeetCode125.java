/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all 
non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

import java.util.*;
public class LeetCode125 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String st=s.nextLine();
		String str= st.toLowerCase();
		String ss="";
		
		for(int i=0;i<st.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				ss+=str.charAt(i);
			}
		}		
		String sb=new StringBuffer(ss).reverse().toString();
	
		if(ss.equals(sb))
		{	
			System.out.println("Palindrome ");
		}
		else {
			System.out.println("Not Palimdrom ");
		}
	}

}


