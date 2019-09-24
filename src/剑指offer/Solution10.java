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
输入一个链表，反转链表后，输出新链表的表头。*/
public class Solution10 {
     public ListNode ReverseList(ListNode head) {

        if(head==null)
            return null;
        ListNode pCur=head;//当前节点
        ListNode pPre=null;//当前节点的前一个节点
        ListNode pNext=null;//当前节点的下一个节点
        ListNode pReverse=null;//翻转之后的头节点
        while(pCur!=null){
            pNext=pCur.next;//保存当前节点的下一个几点
            
            
            if(pNext==null)//当前节点到达尾结点
                pReverse=pCur;
            pCur.next=pPre;
            pPre=pCur;
            pCur=pNext;
        }
        return pReverse;
    }
}
