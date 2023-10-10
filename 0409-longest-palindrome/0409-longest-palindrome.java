class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> s1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(s1.containsKey(s.charAt(i)))
            {
                s1.put(s.charAt(i),s1.get(s.charAt(i))+1);
            }
            else{
                s1.put(s.charAt(i),1);
            }
        }
        int count=0;
        boolean odd=false;
        for(char i:s1.keySet())
        {
            int freq=s1.get(i);
            if(freq%2==0)
            {
                count+=freq;
            }
            else
            {
                count+=freq-1;
                odd=true;
            }
        }
        return odd?count+1:count;
    }
}