class Solution {
    private int setBits(int n)
    {
        int c=0;
        for(int i=0;i<31;i++)
        {
            if(((n>>i)&1)==1)
            {
                c++;
            }
        }
        return c;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++)
        {
            int a=setBits((i));
            if(a==k)
            {
                ans+=nums.get(i);
            
            }
        }

        return ans;
    }
}