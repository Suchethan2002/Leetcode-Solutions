/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return (add(l1,l2));
    }
   /* public ListNode reverse(ListNode l1)
    {
        ListNode temp=l1;
        ListNode p=null;
        while(l1!=null)
        {
            temp=l1.next;
            l1.next=p;
            p=l1;
            l1=temp;
        }
        return p;
    }*/
    public ListNode add(ListNode l1,ListNode l2)
    {
        int sum=0,c=0;
        ListNode l3=new ListNode();
        ListNode head=l3;
        while(l1!=null || l2!=null)
        {
            if(l1!=null&&l2!=null)
            {
                 sum=l1.val+l2.val+c;
            }
            else if(l2!=null)
            {
                sum=l2.val+c;
            }
            else if(l1!=null)
            {
                sum=l1.val+c;
            }
            if(sum>9)
            {
                l3.val=sum%10;
                c=1;
               // l3 = l3.next;
            }
            else
            {
                l3.val=sum;
                c=0;
                //l3 = l3.next;
            }
            
            if(l1!=null)
            {
                l1=l1.next;
            }
            if(l2!=null)
            {
                l2=l2.next;
            }
            if(l1 != null || l2 != null)
            {
                l3.next = new ListNode();
                l3=l3.next;
            }
            
        }
        if(c==1)
        {
            l3.next=new ListNode(c);
        }
        return head;
    }
}