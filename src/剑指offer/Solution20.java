/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;

import java.util.Arrays;

/**
 *
 * @author wangxi
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution20 {
     public int MoreThanHalfNum_Solution1(int [] array) {
        int begin=0,end=array.length-1;
        int mid=(begin+end)/2;
        int num=array[mid],cnt=0;
        
     
        Arrays.sort(array);
        for(int i=0;i<=end;i++){
            if(array[i]==array[mid])
                cnt++;
        }
        return cnt>(array.length/2)?num:0;
        
    }
     
       public int MoreThanHalfNum_Solution2(int [] array) {
       
       
       }
}
