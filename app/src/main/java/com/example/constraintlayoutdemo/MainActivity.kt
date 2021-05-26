package com.example.constraintlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import apis.amapv2.com.listviewlibrary.activity.BaseListActivty
import apis.amapv2.com.listviewlibrary.bean.ItemObject
import com.example.constraintlayoutdemo.activity.Test1Activity
import java.util.ArrayList

class MainActivity : BaseListActivty() {

    override fun addData(data: ArrayList<ItemObject>?) {
        data?.add(ItemObject("", Test1Activity::class.java))
    }

}