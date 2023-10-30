class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[]=new int [nums.length];
        int oLen=1,eLen=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                ans[eLen]=nums[i];
                eLen+=2;
            }
            else
            {
                ans[oLen]=nums[i];
                oLen+=2;
            }
        }
        return ans;
    }
}