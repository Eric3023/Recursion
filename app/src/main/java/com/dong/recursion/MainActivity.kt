package com.dong.recursion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //二分查找算法
        btn1.setOnClickListener {
            var array:IntArray = intArrayOf(1, 2, 3, 4, 5, 7, 9, 12, 15, 16, 19, 20)
            var target = 7

            val result = BinarySearch.binarySearch(array, 0 , array.size, target)
            Log.i("Dong", "第一次出现的位置为："+result)
        }

        //汉诺塔算法
        btn2.setOnClickListener {
            var num = 4
            Log.i("Dong", "盘子共需要移动次数为："+ HanoiTower.moveTower(num))
            Log.i("Dong", "盘子共需要移动次数为："+ HanoiTower.moveTower2(num, "A", "B","C"))
        }

        //阶乘求解算法
        btn3.setOnClickListener {
            var num = 5
            var result = Factorial.factorial(num)
            Log.i("Dong","n的阶乘为："+result)
        }

    }
}
