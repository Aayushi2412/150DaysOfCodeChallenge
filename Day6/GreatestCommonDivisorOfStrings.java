/*
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
*/
//code
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        if(!(str1+str2).equals(str2+str1)) return "";
        int gcd=gcd(n1,n2);
        return str1.substring(0,gcd);
    }
    private int gcd(int a, int b)
    {
        return b==0? a:gcd(b,a%b);
    }
}
