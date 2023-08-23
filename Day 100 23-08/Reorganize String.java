// Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
// Return any possible rearrangement of s or return "" if not possible.
// Example 1:
// Input: s = "aab"
// Output: "aba"
// Example 2:
// Input: s = "aaab"
// Output: ""
//code
class Sol
  {
    public String reorganiseString(String s)
    {
      int n=s.length();
      int[] freq=new int[26];
      for(int i=0;i<n;i++)
        freq[s.charAt(i)-'a']++;
      int max=0, letter=0;
      for(int i=0;i<26;i++)
        {
          if(freq[i]>max)
          {
            max=freq[i];
            letter=i;
          }
        }
      if(max> (n+1)/2) return "";
      int indx=0;
      char[] ans=new char[n];
      while(freq[letter]>0)         //even indices
        {
            ans[indx]=(char)(letter+'a');
            indx+=2;
            freq[letter]--;
        }
      for(int i=0;i<26;i++)
        {
          while(freq[i]>0)
            {  
              if(indx>ans.length)indx=1;
              ans[indx]=(char)(i+'a');
              indx+=2;
              freq[i]--;
            }
        }
      return String.valueOf(ans);
    }
  }
          
