package com.example.constraintlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import apis.amapv2.com.listviewlibrary.activity.BaseListActivty
import apis.amapv2.com.listviewlibrary.bean.ItemObject
import com.example.constraintlayoutdemo.activity.*
import java.util.ArrayList

class MainActivity : BaseListActivty() {

    override fun addData(data: ArrayList<ItemObject>?) {
        data?.add(ItemObject("相对位置控制", Test1Activity::class.java))
        data?.add(ItemObject("角度定位", Test2Activity::class.java))
        data?.add(ItemObject("边距定位", Test3Activity::class.java))
        data?.add(ItemObject("居中和偏移", Test4Activity::class.java))
        data?.add(ItemObject("尺寸约束", Test5Activity::class.java))
        data?.add(ItemObject("链", Test6Activity::class.java))
    }

}