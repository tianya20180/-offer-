/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author wangxi
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。

 */
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution18 {
   public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)
            return res;
       Queue<TreeNode>queue=new LinkedList<TreeNode>();
          queue.offer(root);
          while(!queue.isEmpty()){
              TreeNode node=queue.peek();
              queue.poll();
              res.add(node.val);
              if(node.left!=null)
                  queue.offer(node.left);
              if(node.right!=null)
                  queue.offer(node.right);
          }
        
        return res;
    }
}
