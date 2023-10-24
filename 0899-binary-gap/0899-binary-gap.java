class Solution {
    public int binaryGap(int n) {
        int gap=0;
        int cGap=0;
        for(int i=0;i<31;i++)
        {
            if(((n>>i)&1)==1)
            {
                gap=Math.max(gap,cGap);
                cGap=1;
            }
            else if(cGap>0){
                cGap++;
            }
        }
        return gap;
    }
}