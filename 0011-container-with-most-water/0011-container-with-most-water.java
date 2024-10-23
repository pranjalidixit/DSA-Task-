class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int l=0;
        int r=height.length - 1;
        while(l<r){
            final int minHeight=Math.min(height[l],height[r]);
            s=Math.max(s,minHeight*(r-l));
            if(height[l]<height[r])
            ++l;
            else
            --r;    
        }
        return s;
        
    }
}
