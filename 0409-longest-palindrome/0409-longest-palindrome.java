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
            if(s1.get(i)%2==0)
            {
                count+=s1.get(i);
            }
            else
            {
                count+=s1.get(i)-1;
                odd=true;
            }
        }
        return odd?count+1:count;
    }
}