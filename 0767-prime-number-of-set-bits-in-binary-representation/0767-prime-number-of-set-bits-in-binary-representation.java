class Solution {
    private int bitCount(int n)
    {
        int count=0;
        for(int i=0;i<31;i++)
        {
            if(((n>>i)&1)==1)
            {
                count++;
            }
        }
        return count;
    }
    private boolean isPrime(int n)
    {
        int count=0;
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
      
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        
        int count=0;
        for(int i=left;i<=right;i++)
        {
            int n=bitCount(i);
            if(isPrime(n))
            {
                count++;
            }

        }
        return count;

    }
}