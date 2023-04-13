package com.ninja.mvvmthroughdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ninja.mvvmthroughdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         val binding: ActivityMainBinding =
             DataBindingUtil.setContentView(this, R.layout.activity_main)
         val device = DeviceVersion("Tiramisu",33,"Android-13")
         binding.setVariable(BR.device, device)
         binding.executePendingBindings()
    }
}