class Solution {
    public int minimumOperations(int[] nums) {
        int count[]=new int [101];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                count[nums[i]]++;
            }
            
        }
        int c=0;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
            {
                c++;
            }
        }
        return c;
    }
}