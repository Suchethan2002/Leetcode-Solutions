class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int min=(nums[1]*nums[0]);
        int max=nums[nums.length-1]*nums[nums.length-2];
        return max-min;
        
    }
}