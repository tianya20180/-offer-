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
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 * 
 */

public class Solution8 {
    public static void reOrderArray(int [] array) {
        int len=array.length;
        int odd=0;
        int even=0;
        for(int i=0;i<len;i++){
            if(array[i]%2==0){
                
                even=i;
            for(int j=even;j<len;j++){
                if(array[j]%2!=0){
                    odd=j;
                      System.out.println("even:"+even+"odd"+odd);
                     int tmp=array[even];
                    array[even]=array[odd];
                    array[odd]=tmp;
                    break;
                }
            }
          
            }       
          
        }
 
    }
    
    /*
    1 2 3 4 5 6 7
    1 3 2 4 5 6 7
    1 3 5 4 2 6 7
    1 3 5 7 2 6 4
    */
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
       int[] array=new int[]{1,2,3,4,5,6,7};
       reOrderArray(array);
       for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
       }
    }
}
