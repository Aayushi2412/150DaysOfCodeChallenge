/*
Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.
*/
//code
class Solution {
    public int minFlips(int a, int b, int c) {
        int ans=0;
        while(a>0 || b>0 || c>0)
        {
            int abit=a&1;
            int bbit=b&1;
            int cbit=c&1;
            if(cbit==0)
                ans+=abit+bbit;
            else
                if(abit==0 && bbit==0) ans+=1;
            a>>=1;
            b>>=1;
            c>>=1;
        }
        return ans;
    }
}

 
