/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;

import java.util.ArrayList;

/**
 *
 * @author wangxi
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。

 */
public class Solution23 {
     public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer>res=new ArrayList<Integer>();
        int i=0,j=array.length-1;
        while(i<j){
            int t=array[i]+array[j];
            if(t==sum){
                res.add(array[i]);
                res.add(array[j]);
                break;
            }
            else if(t>sum){
                j--;
            }else{
                i++;
            }
        }
        return res;
    }
}
