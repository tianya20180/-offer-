/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;

/**
 *将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0

 * @author wangxi
 */
public class Solution27 {
     public static int StrToInt(String str) {
        if(str.equals("0")){
            return 0;
        }
        int sum=0;
        int flag=1;
        if('0'<=str.charAt(0)&&str.charAt(0)<='9'){
              sum=Integer.valueOf(str.charAt(0));
              System.out.println(Integer.valueOf(str.charAt(0)));
        }
        else if(str.charAt(0)=='-'||str.charAt(0)=='+'){
            if(str.charAt(0)=='-'){
                flag=-1;
            }
        }else
            return 0;
        for(int i=1;i<str.length();i++){
            sum=sum*10+Integer.valueOf(str.charAt(i));
        }
        return sum*flag;
    }
     public static void main(String[] args){
         System.out.println(StrToInt("12345"));
     }
}
