/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 剑指offer;

import java.util.ArrayList;

/**
 *
 * @author wangxi
 */
/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。例如：如果输入如下矩阵：

1	2	3	4
5	6	7	8
9	10	11	12
13	14	15	16
则依次打印出数字1、2、3、4、8、12、16、15、14、13、9、5、6、7、11、10。

对于一个5*5的矩阵，最后一圈只有一个数字，对应的坐标为（2, 2）。5 > 2 * 2；

对于一个6*6的矩阵，最后一圈有4个数字，其左上角的坐标仍是（2, 2）。6 > 2 *2；

故循环继续的条件为columns > startX * 2并且rows > startY * 2。
*/
public class Solution13 {
    public ArrayList<Integer> printMatrixClockwisely(int [][]nums){
        ArrayList<Integer>list=new ArrayList<>();
        int rows=nums.length;
        int cols=nums[0].length;
        if(nums==null||cols<=0||rows<=0)
            return null;
        int start=0;
        while(cols>start*2&&rows>start*2){
            printCircle(list,nums,cols,rows,start);
            ++start;
        }
        return list;
    }

    private void printCircle(ArrayList<Integer> list, int[][] nums, int cols, int rows, int start) {
        int endX=rows-1-start;
        int endY=cols-1-start;
        for(int i=start;i<=endX;i++){
            int number=nums[start][i];
            list.add(number);
        }
        if(start<endY){
            for(int i=start+1;i<endY;i++){
                int number=nums[i][endX];
                list.add(number);
            }
        }
        if(start<endX&&start<endY){
            for(int i=endX-1;i>=start;--i){
                int number=nums[endY][i];
                list.add(number);
            }
        }
        if(start<endX&&start+1<endY){
            for(int i=endY-1;i>=start+1;--i){
                int number=nums[i][start];
                list.add(number);
            }
        }
    }
}
