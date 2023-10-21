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

    public int[] sortByBits(int[] arr) {
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {

            arr[i]+=bitCount(arr[i])*10001;

        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%10001;
        }
        return arr;
    }
}