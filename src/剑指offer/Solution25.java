/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;

import java.util.ArrayList;

/**
 *输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * @author wangxi
 */
public class Solution25 {
    ArrayList<ArrayList<Integer>>res=new ArrayList<>();
    ArrayList<Integer>temp=new ArrayList<Integer>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null)
            return res;
        temp.add(root.val);
        target-=root.val;
        if(root.left==null&&root.right==null&&target==0){
            res.add(new ArrayList<>(temp));
        }else{   
              FindPath(root.left,target);
              FindPath(root.right,target);
        }
         temp.remove(temp.size()-1);
        return res;
    }
}
