/*
input : str="Welcome to Coding Ninjas"
output : st=Ninjas Coding to Welcome"
*/
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
