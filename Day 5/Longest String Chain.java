/*
You are given an array of words where each word consists of lowercase English letters.
wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without changing the order of the other characters to make it
equal to wordB.
For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1, where word1 is a predecessor of word2, word2 is a predecessor of word3, and so on. 
A single word is trivially a word  chain with k == 1.
Return the length of the longest possible word chain with words chosen from the given list of words.
Example 1:
Input: words = ["a","b","ba","bca","bda","bdca"]
Output: 4
Explanation: One of the longest word chains is ["a","ba","bda","bdca"].
Example 2:
Input: words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
Output: 5
Explanation: All the words can be put in a word chain ["xb", "xbc", "cxbc", "pcxbc", "pcxbcf"].
*/
//Code
class Solution {
    public int longestStrChain(String[] words) {
         // Sort the array in increasing order of word length
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        // Create a map to store the longest chain ending at each word
        Map<String, Integer> dp = new HashMap<>();
        int maxChainLength = 1;
        
        // Iterate through each word in the array
        for (String word : words) {
            // Initialize the longest chain for the current word as 1
            int longestChain = 1;
            // Generate all possible predecessor words of the current word
            for (int i = 0; i < word.length(); i++) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                String predecessor = sb.toString();
                // If the predecessor word is in the map, update the longest chain for the current word
                if (dp.containsKey(predecessor)) {
                    longestChain = Math.max(longestChain, dp.get(predecessor) + 1);
                }
            }
            // Update the map with the longest chain ending at the current word
            dp.put(word, longestChain);
            // Update the maximum chain length seen so far
            maxChainLength = Math.max(maxChainLength, longestChain);
        }
        
        return maxChainLength;
    }
}
