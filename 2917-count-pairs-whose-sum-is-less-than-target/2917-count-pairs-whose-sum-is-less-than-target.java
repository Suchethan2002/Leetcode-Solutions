class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int sum=0;
        int i=0,j=1;
        int count=0;
        while(i<nums.size()&&j<nums.size())
        {
            if(nums.get(i)+nums.get(j)<target)
            {
                count++;
                j++;
                if(j>=nums.size())
                {
                    i++;
                    j=i+1;
                }
            }
            else
            {
                
                i++;
                j=i+1;
                
            }
           
        }
        return count;
    }
}