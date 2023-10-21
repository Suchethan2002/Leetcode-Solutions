class Solution {
    public int[] evenOddBit(int n) {
        int odd=0,even=0;
        for(int i=0;i<31;i+=2)
        {
            if((n>>i)%2==1)
            {
                even++;
            }
        }
        for(int i=1;i<31;i+=2)
        {
            if((n>>i)%2==1)
            {
                odd++;
            }
        }
        int ans[]=new int[2];
     ans[0]=even;
     ans[1]=odd;
     return ans;
    }
}