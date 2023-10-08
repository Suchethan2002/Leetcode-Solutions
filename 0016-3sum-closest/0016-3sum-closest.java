class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int check=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                 if((Math.abs(sum-target)<Math.abs(check-target)))
                {
                    check=sum;
                }
                if(sum<target)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return check;
    }
}