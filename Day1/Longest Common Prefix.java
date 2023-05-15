/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
//Code
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if(len==0) return "";
        if(len==1) return strs[0];
        //Sorting the array
        Arrays.sort(strs);
        //minimum length from first and last string
        int min=Math.min(strs[0].length(),strs[len-1].length());
        int i=0;
        //common prefix between first and last string
        while(i<min && strs[0].charAt(i)==strs[len-1].charAt(i))
            i++;
        String lcp=strs[0].substring(0,i);
        return lcp;
    }
}
