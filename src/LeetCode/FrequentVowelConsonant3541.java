package LeetCode;
import java.util.*;

public class FrequentVowelConsonant3541 {

	public static boolean isVowel(char  str) {
		String  s="aeiou";
		return s.indexOf(str)!=-1;
	}
	
	public static int maxFreqSum(String s) {
		boolean b[]=new boolean[s.length()];
		char ch[]=s.toCharArray();
		int maxC=0;
		int maxV=0;
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false)
			{
				if(isVowel(ch[i]))
				{
					int count=1;
					
					for(int j=i+1;j<ch.length;j++)
					{
						if(ch[i]==ch[j])
						{
							b[i]=true;
							count++;
							
						}
					}
					
					if(maxV<count)
					{
						maxV=count;
					}
					
				}
				else {
					int count=1;
					
					for(int j=i+1;j<ch.length;j++) {
						if(ch[i]==ch[j]) {
							count++;
							b[i]=true;
						}
					}
					if(maxC<count)
					{
						maxC=count;
					}
				}
			}
		}
		
		return maxC+maxV;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();//successes
		int result= maxFreqSum(str);
		System.out.println("Sum is:  "+result);
	
		
	}

}
