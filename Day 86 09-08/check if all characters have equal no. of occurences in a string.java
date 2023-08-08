class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        int[] freq=new int[26];
        for(char ch: s.toCharArray())
            freq[ch-'a']++;                 //frequency of every character is stored
        int prev=freq[s.charAt(0)-'a'];    //frequency of the first element
        for(int num: freq)
        {
            if(num!=0 && num!=prev) return false;
        }
        return true;
    }
}
