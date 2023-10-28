class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                count++;
            }
        }
        int a=0,b=0;
        while(b<count)
        {
            if(nums[a]!=val)
            {
                nums[b++]=nums[a++];
            }
            else
            {
                a++;
            }
        }
        
        return count;
    }
}