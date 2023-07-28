class Solution {
    public int[] constructRectangle(int area) {
        //l>=w
        //l*w==area
        //|l-w|=min
        //l*w=area
        //l=area/w
        //area/w>=w
        //area>=w^2
        //sqrt(area)>=w  i.e. w<=sqrt(area)
        for(int i=(int)Math.sqrt(area);i>0;i--)        //i=width
        {
            if(i*(area/i)==area) return new int[]{area/i,i};
        }
        return null;
    }
}
