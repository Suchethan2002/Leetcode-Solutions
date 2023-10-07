class Solution {
    public int reverse(int x) {
        long rev=0;
        int Num=0;
        int signOfNum=0;
        if(x!=0)
        {
            Num= Math.abs(x);
            signOfNum= x/Num;
        }
        else
        {
            return 0;

        }

        while(Num>0)
        {
            int a=Num%10;
            rev=rev*10+a;
            Num/=10;
        }
       
        if(rev>(Integer.MAX_VALUE))
        {
            return 0;
        }

        return (int)rev*signOfNum;
    }
}