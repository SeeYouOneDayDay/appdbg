package jmp0.test.testapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.MessageQueue
import android.provider.Settings
import android.util.Log
import jmp0.test.testapp.net.TestNetWork

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestNetWork().test()
    }

    fun getStr(){
        Log.d("test",Settings.Secure.getString(this.contentResolver,"android_id"))
    }
}