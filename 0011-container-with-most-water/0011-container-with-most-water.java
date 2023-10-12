class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans=0;
        while(i<=j)
        {
            if(height[i]>height[j])
            {
                ans=Math.max(ans,height[j]*(j-i));
                j--;
         
            }
            else
            {
                ans=Math.max(ans,height[i]*(j-i));
                i++;
            }
        }
        return ans;
        
    }
}