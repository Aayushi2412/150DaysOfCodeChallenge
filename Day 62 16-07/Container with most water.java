class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int area=0,maxArea=0;
        while(l<r)
        {
            int minHeight=Math.min(height[l],height[r]);
            area=minHeight*(r-l);
            maxArea=Math.max(maxArea,area);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxArea;
    }
}
