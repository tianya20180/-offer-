/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;

/**
 *
 * @author wangxi
 * 给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m]。
 * 请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * https://www.jianshu.com/p/65b39734430c

 */
public class Solution26 {
     public int cutRope(int target) {
          if(target<2)
            return 0;
        else if(target==2)
            return 1;
        else if(target==3)
            return 2;
        else{
            int []product=new int[target+1];
            product[0]=0;
            product[1]=1;
            product[2]=2;
            product[3]=3;
            
            int max=0;
            for(int i=4;i<=target;i++){
                max=0;
                for(int j=2;j<=i/2;j++){
                    if(max<product[j]*product[i-j])
                        max=product[j]*product[i-j];
                }
                product[i]=max;
            }
                 return product[target];

        }
    }
}
