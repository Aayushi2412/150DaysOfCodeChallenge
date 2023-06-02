/*
input : str="Welcome to Coding Ninjas"
output : st=Ninjas Coding to Welcome"
*/
//Solution 1
public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		String[] s=str.split(" ");
		int j=0;
		String[] ans=new String[s.length];
		for(int i=s.length-1;i>=0;i--)
		{
			ans[j]=s[i];
			j++;
		}
		String st=String.join(" ",ans);
		return st;

	}
}



//Solution 2
class Solution {
    public String reverseWords(String s) {
    
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>=0;i--)
        {
            if(str[i]!="")
            {
                sb.append(str[i]);   //add word
                sb.append(" ");  //add space after every word
            }
        }
        return sb.toString().trim();
        
        
    }
}
