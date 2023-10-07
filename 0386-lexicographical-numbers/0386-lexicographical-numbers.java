class Solution {
    public void order(int cur,int n, List<Integer> s)
    {
        if(cur>n)
        return;
        else
        {
            s.add(cur);
            for(int i=0;i<10;i++)
            {
                if(10*cur+i>n)
                return;
                order(cur*10+i,n,s);
            }
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> s=new ArrayList<>();
        for(int i=1;i<10;i++)
        {
            order(i,n,s);
        }
        return s;
    }
}