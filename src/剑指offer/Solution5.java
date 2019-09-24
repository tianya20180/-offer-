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
public class Solution5 {
    //法1
        public int JumpFloor(int target) {

            if(target==1)
                return 1;
            if(target==2)
                return 2;
            else 
                return JumpFloor(target-1)+JumpFloor(target-2);
        }
        //法2
      public int JumpFloor2(int target) {
           int i1=1,i2=2;
             int res=1;
             if(target==1||target==2)
                 return target;
             for(int i=2;i<target;i++){
                 res=i1+i2;
                 i1=i2;
                 i2=res;
             }
             return res;
        
    }
        public static void main(String[] args){
            
            System.out.println(10);
        
        }
}
