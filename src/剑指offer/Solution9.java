/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;
import 剑指offer.*;
/**
 *
 * @author wangxi
 * 输入一个链表，输出该链表中倒数第k个结点。
 */


public class Solution9 {
    public ListNode FindKthToTail(ListNode head,int k) {

       int len=0;
        ListNode list=head;
        while(list!=null){
            list=list.next;
            len++;
        }
        if(k>len)
            return null;
        
        int cnt=len-k;
        for(int i=0;i<cnt;i++){
            head=head.next;
        }
        return head;
    }
    /*
    思路：
定义快指针和慢指针。
快指针先走 k-1 步，到达第 k 个节点。
然后两指针同时齐步走，当快指针到达末尾时，慢指针在倒数第 k 个节点上。
    */
    public ListNode FindKthToTail2(ListNode head,int k){
          if(head==null||k<=0)
            return null;
        ListNode slow=head,fast=head;
        for(int i=0;i<k-1;i++){
            if(fast.next==null)
                return null;
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        
        return slow;
    }
    public static void main(String[] args){
       
     
       
    }
}
