class Solution {
    public boolean isValid(String s) {
        //int n=s.length();
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray())
        {
            if(ch=='(' || ch=='{'|| ch=='[')
                st.push(ch);
            else
            {
                if(st.isEmpty()) return false;
                if(ch==')' && st.peek()=='(')
                    st.pop();
                else if(ch=='}' && st.peek()=='{')
                    st.pop();
                else if(ch==']' && st.peek()=='[')
                    st.pop();
                else
                    return false;     
            }
        }
        return st.isEmpty();
        
        
    }
}
