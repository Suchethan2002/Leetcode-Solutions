class Solution {
    public boolean hasAlternatingBits(int n) {
        int prevbit=n&1;
        n>>=1;
        while(n>0)
        {
            int currentbit=n&1;
            if(prevbit==currentbit)
            {
                return false;
            }
            prevbit=currentbit;
            n>>=1;
           
        }
        return true;
    }
}