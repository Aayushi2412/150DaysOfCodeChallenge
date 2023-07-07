/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
*/
//code
class Solution {
    public int titleToNumber(String s) {
        // return s.length()==0?0:(s.charAt(s.length()-1)-'A'+1)+26* titleToNumber(s.substring(0,s.length()-1));

        int ans=0;
        for(char ch:s.toCharArray())
        {
            ans*=26;
            ans+=ch-'A'+1;
        }
        return ans;
    }
}
