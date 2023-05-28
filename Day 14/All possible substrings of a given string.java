/*
input="abc"
output="a", "b","c","ab","ac","bc","abc"
*/
//code
import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
    static void printSubstrings(String input) {
        // Write your code here
        int n=input.length();
        for(int i=0;i<n;i++)
        {
            String sub="";
            for(int j=i;j<n;j++)
            {
                sub+=input.charAt(j);
                System.out.print(sub+"\n");
            }
        }
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
	}
}
