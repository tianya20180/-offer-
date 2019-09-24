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
public class Solution1 {
       public static String replaceSpace(StringBuffer str) {
    	 int len=str.length();
        int space=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                space++;
            }
        }
        int newLen=len+2*space;
        char[]newStr=new char[newLen];
        String s=""+str;
        System.arraycopy(s.toCharArray(),0,newStr,0,len);
        int index1=0,index2=0;
        while(index1<len&&index2<newLen){
            if(str.charAt(index1)!=' '){
                newStr[index2]=str.charAt(index1);
            }else{
                newStr[index2++]='%';
                newStr[index2++]='2';
                newStr[index2]='0';
            }
        index1++;
        index2++;
        }
       
        return String.valueOf(newStr);
    }
       
       
     public static void main(String[] args){
     
         String s="We Are Happy";
            System.out.println(replaceSpace(new StringBuffer("We Are Happy")));     
     }
}
