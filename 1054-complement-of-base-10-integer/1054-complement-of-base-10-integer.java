class Solution {
    public int bitwiseComplement(int n) {
        int mask=0,x;
        if(n==0)
        {
            return 1;
        }
        for(int i=0;n>0;i++)
        {
            if(((n&1)==1))
            {
                x=0;
            }
            else
            {
               x=1;
            }
            mask+=(int)(x*Math.pow(2,i));
            n>>=1;
        }
        return mask;
    }
}