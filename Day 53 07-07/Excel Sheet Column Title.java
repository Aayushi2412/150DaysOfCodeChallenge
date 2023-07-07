/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
*/
//code
class Solution {
    public String convertToTitle(int n) {
        if(n==0) return "";
        StringBuilder ans=new StringBuilder();
        while(n>0)
        {
            n--;
            ans.insert(0,(char)'A'+n%26));
            n/=26;
        }
        return ans.toString();

    }
}
