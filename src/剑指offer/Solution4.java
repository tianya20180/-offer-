/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;
/*
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
*/
/**
 *
 * @author wangxi
 */

//1 1 2 3 5 8
public class Solution4 {
        public static int Fibonacci(int n) {
             int i1=1,i2=1;
             int res=1;
             if(n==0)
                 return 0;
             if(n==1||n==2)
                 return 1;
             for(int i=2;i<n;i++){
                 res=i1+i2;
                 i1=i2;
                 i2=res;
             }
             return res;
         }
        public static void main(String[] args){
           for(int i=0;i<10;i++){
               System.out.println(Fibonacci(i));
           }
        }
        
}
