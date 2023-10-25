class Solution {
    public boolean isPowerOfFour(int n) {
        int c=0;
        if(n<=0)
        {
            return false;
        }
        for(int i=0;i<31;i++)
        {
            if(((n>>i)&1)==1)
            {
                if(i%2==0)
                {
                    c++;
                }
                else
                {
                    return false;
                }
            }
           

        }
       return c==1;
        
    }
}