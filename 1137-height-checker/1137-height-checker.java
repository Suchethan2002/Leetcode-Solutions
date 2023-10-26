class Solution {
    public int heightChecker(int[] heights) {
        int check[]=new int[heights.length];
        for(int i=0;i<check.length;i++)
        {
            check[i]=heights[i];
        }
        Arrays.sort(check);
        int count=0;
        for(int i=0;i<check.length;i++)
        {
            if(check[i]!=heights[i])
            {
                count++;
            }
        }
        return count;
    }
}