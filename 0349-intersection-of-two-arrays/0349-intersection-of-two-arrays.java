class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int c1[]=new int[1001];
        int c2[]=new int[1001];
        int ans[]=new int [Math.min(nums1.length,nums2.length)];
        for(int i=0;i<nums1.length;i++)
        {
            c1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            c2[nums2[i]]++;
        }
        int j=0;
        for(int i=0;i<c1.length;i++)
        {
            if(c1[i]!=0 && c2[i]!=0)
            {
                ans[j++]=i;

            }
        }
        int[] result = Arrays.copyOf(ans, j);
        return result;
    }
}