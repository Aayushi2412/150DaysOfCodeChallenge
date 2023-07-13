/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.
*/
//code
class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        //base case
        if(n==0) return -1;
        int[] arr=new int[26];         //to store the count of each character in s
        for(char ch:s.toCharArray()) arr[ch-'a']++;
        for(int i=0;i<n;i++)
        {
            if(arr[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
