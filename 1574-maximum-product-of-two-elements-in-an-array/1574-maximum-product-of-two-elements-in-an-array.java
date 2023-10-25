class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secondMax=0;
        for(int num:nums)
        {
            if(num>=max)
            {
                secondMax=max;
                max=num;
                
            }
            else if(secondMax<num)
            {
                secondMax=num;
            }
             
        }
       
        return (secondMax-1)*(max-1);
    }
}