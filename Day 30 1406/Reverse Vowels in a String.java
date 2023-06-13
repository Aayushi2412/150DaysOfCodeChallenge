//s="hello" ans="holle"
//s="leetcode" ans="loetcede"
//code
class Solution {
    public String reverseVowels(String s) {
        Stack<Character> st=new Stack<>();   //to reverse the vowels through LIFO
        String vowels="aeiouAEIOU";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(vowels.contains(String.valueOf(ch))) st.push(ch);
        }
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(vowels.contains(String.valueOf(c))) res+=st.pop();  //pop the stack and the popped character
            else res+=c;
        }
        return res;
    }
}
