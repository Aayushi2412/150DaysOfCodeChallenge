//s="anagram", t="nagaram"
//ans=true

//code
class Sol
  {
    public boolean findAnagram(String s,String t)
    {
      if(s==null || t==null) return false;
      if(s1.length()!=s2.length()) return false;
      char[] a1=s.toCharArray();
      char[] a2=t.toCharArray();
      if(Arrays.equals(a1,a2)) return true; 
      else return false;
    }
  }
