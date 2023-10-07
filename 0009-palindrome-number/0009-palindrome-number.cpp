class Solution {
public:
    bool isPalindrome(int x) {
        long a=0,b=0,s=x;
        while(x>0)
        {
            b=b*10+x%10;
            x=x/10;
            }
        if(b==s)
        {
            return true;
        }
        
       return false;
        
    }
};