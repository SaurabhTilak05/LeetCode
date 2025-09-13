
import java.util.*;
class minmaxDiff {
    public int minMaxDifference(int num) {
        String numstr= String.valueOf(num);

        int maxVal=num;
        int minVal=num;


        for(char c='0' ; c<='9' ;c++)
        {
            if(c!='9'){
                String repMax=numstr.replace(c,'9');
                maxVal=Math.max(maxVal, Integer.parseInt(repMax));
            }

            if(c!='0'){
                  String repMin=numstr.replace(c,'0');
                minVal=Math.min(minVal, Integer.parseInt(repMin));
            }
        }
        return maxVal-minVal;
    }
}
public class MinMaxDiffApp
{
	public static void main(String x[]){
		Scanner s=new Scanner(System.in);
		minmaxDiff  mm=new minmaxDiff();
		System.out.println("Enter Number:");
		int no=s.nextInt();
		int result=mm.minMaxDifference(no);
		System.out.println(result);
	}
}