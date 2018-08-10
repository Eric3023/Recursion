package com.dong.recursion

import android.util.Log

/**
 * 对于一个有序数组，我们通常采用二分查找的方式来定位某一元素，请编写二分查找的算法，在数组中查找指定元素。
 * 给定一个整数数组array，同时给定要查找的元素target，请返回它在数组中的位置(从0开始)。
 * 若不存在该元素，返回-1。若该元素出现多次，请返回第一次出现的位置。
 */

class BinarySearch {

    companion object {
        /*
         * 二分查找算法，时间复杂度O(log2n)，空间复杂度O(1)
         */
        fun binarySearch(array: IntArray, low:Int, hight:Int, target: Int):Int{
            //递归边界条件
            if(array == null|| array.isEmpty())
                return -1
            if(low == hight)
                return when (target) {
                    array[low] -> low
                    else -> -1
                }

            //状态转换方程
            return when {
                array[(low + hight)/2] < target -> binarySearch(array, (low + hight)/2+1, hight, target)
                else -> binarySearch(array, low, (low + hight)/2, target)
            }
        }
    }

}