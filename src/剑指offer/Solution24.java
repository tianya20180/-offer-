/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;

/**
 *
 * @author wangxi
 * ：在一个m*n的棋盘的每一个格都放有一个礼物，每个礼物都有一定价值（大于0）。
 * 从左上角开始拿礼物，每次向右或向下移动一格，直到右下角结束。给定一个棋盘，求拿到礼物的最大价值。例如，对于如下棋盘
 */
public class Solution24 {
      public static int getMaxVaule(int[][] values){
              if(values==null||values.length<=0||values[0].length<=0)
                  return 0;
              int rows=values.length;
              int cols=values[0].length;
              int [][]res=new int[rows][cols];
              for(int i=0;i<rows;i++){
                  for(int j=0;j<cols;j++){
                      int up=0;
                      int left=0;
                      if(i>0)
                          up=values[i-1][j];
                      if(j>0)
                          left=values[i][j]-1;
                      res[i][j]=Math.max(left,up)+values[i][j];
      
                  }
              }
              int max=res[rows-1][cols-1];
              return max;
      }
}
