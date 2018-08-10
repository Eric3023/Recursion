package com.dong.recursion

/**
 * 求阶乘问题。
 * 输入一个正整数n，输出n！
 **/
class Factorial {

    /*
     * 时间复杂度O(n)， 空间复杂度O(1)
     */
    companion object {

        fun factorial(n: Int): Int {
            return when(n){
                1 -> 1
                else -> n* factorial(n-1)
            }
        }
    }
}