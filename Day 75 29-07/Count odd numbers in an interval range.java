class Solution {
    public int countOdds(int l, int h) {
        //return (high+1)/2-low/2;
        int n=h-l+1;    //total nos. between l and h
        if(n%2==0) return n/2;
        else
        {
            if(l%2!=0 || h%2!=0) return (int)(n/2)+1;
            else return n/2;
        }
    }
}
