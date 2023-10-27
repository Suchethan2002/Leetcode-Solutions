class Solution {
    private int[] reverse(int[] nums)
    {
        for(int i=0;i<nums.length/2;i++)
        {
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
        return nums;
    }
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        nums=reverse(nums);
        List<Integer> a=new ArrayList<>();
        int ls=0,rs=0;
        for(int i=0;i<nums.length;i++)
        {
            ls+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            rs+=nums[i];
            ls-=nums[i];
            a.add(nums[i]);
            if(ls<rs)
            {
                return a;
            }
        }
        return a;
    }
}