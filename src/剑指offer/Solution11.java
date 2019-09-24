/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;

/**
 *
 * @author wangxi
 */
/*
输入两个单调递增的链表，输出两个链表合成后的链表，
当然我们需要合成后的链表满足单调不减规则。

*/
public class Solution11 {
      public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode list=new ListNode(-1);
        //list.next=null;
        ListNode head=list;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                list.next=list1;
                list=list.next;
                list1=list1.next;
            }else{
                list.next=list2;
                list=list.next;
                list2=list2.next;
            }
            
        }
        if(list1!=null){
            list.next=list1;
        }else{
            list.next=list2;
        }
        return head.next;
        
    }
}
