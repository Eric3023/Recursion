package com.dong.recursion

import android.util.Log

/**
 * 有三根相邻的柱子，标号为A,B,C，A柱子上从下到上按金字塔状叠放着n个不同大小的圆盘。
 * 要把所有盘子一个一个移动到柱子B上，并且每次移动同一根柱子上都不能出现大盘子在小盘子上方。
 * 请问至少需要多少次。
 *
 * 算法分析：
 * 当n=1时，H(1)=1,即A—>C；
 * 当n=2时，H(2)=3,即A—>B,A—>C,B—>C;
 * 当n>2时，可以将第1个盘子到第n-1个盘子看成一个整体为，这样就仍为两个盘子：
 * 第一步：①从A—>B：共H(n-1)步;
 * 第二步：n 从A—>C：共1步;
 * 第三步：①从B—>C：共H(n-1)步.
 **/
class HanoiTower {

    companion object {

        /*
         * 汉诺塔算法(计算次数)，时间复杂度O(n)，空间复杂度O(1)
         */
        fun moveTower(n:Int):Int{
            return when (n) {
                1 -> 1
                else -> moveTower(n-1) * 2 + 1
            }
        }


        /*
         * 汉诺塔算法(移动步骤)，时间复杂度O(2^n)，空间复杂度O(1)
         */
        fun moveTower2(n:Int, startTower: String, endTower: String, midddleTower: String):Int{
            return when (n) {
                1 -> {
                    Log.i("Dong","从柱子"+startTower+"移动到柱子"+endTower)
                    1
                }
                else -> {
                    moveTower2(n-1, startTower, midddleTower, endTower)+ moveTower2(1, startTower, endTower, midddleTower)+ moveTower2(n-1, midddleTower, endTower, startTower)
                }
            }
        }
    }
}