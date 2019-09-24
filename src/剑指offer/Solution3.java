/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;

import java.util.Stack;

/**
 *
 * @author wangxi
 */
/*
题目描述
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
*/
public class Solution3 {
        Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
     
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }
    
    public int pop() {
    
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int res=stack2.pop();
        return res;
    }
    
    
     public static void main(String[] args){
    
        Queue q=new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(4);
        System.out.println(q.pop());
        q.push(5);
        System.out.println(q.pop());
       
             
    }
}
