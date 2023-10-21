class Solution {
    public boolean divideArray(int[] nums) {
        int ans[]=new int[1000];
        for(int i:nums)
        {
            ans[i]++;
        }
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]%2!=0)
            {
                return false;
            }

        }
        return true;
        
    }
}