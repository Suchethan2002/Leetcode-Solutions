class Solution {
    public String addStrings(String num1, String num2) {
       int i=num1.length()-1;
       int j=num2.length()-1;
       int carry=0;
       String ans="";
       while(i>=0||j>=0)
       {
           int n=carry;
           if(i>=0)
           {
               n+=(num1.charAt(i--)-'0');
           }
           if(j>=0)
           {
               n+=(num2.charAt(j--)-'0');
           }     
           ans=n%10+ans;
           carry=n/10;
       }    
       if(carry!=0)
       {
           ans=carry+ans;
       }
       return ans;
    }
}