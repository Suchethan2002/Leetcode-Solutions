class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashMap<Integer, Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(a.containsKey(target-nums[i]))
            {
                ans[0]=a.get(target-nums[i]);
                ans[1]=i;
            }
            a.put(nums[i],i);
            
        }
        return ans;
    }
}