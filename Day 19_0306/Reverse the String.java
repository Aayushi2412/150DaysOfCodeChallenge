/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/
//code
//2-pointer swapping
class Solution {
    public void reverseString(char[] s) {
        //2-pointer approach
        int l=0,r=s.length-1;
        while(l<r)
        {
            //swapping
            char c=s[r];
            s[r]=s[l];
            s[l]=c;
            l++;
            r--;
        }
    }
}
