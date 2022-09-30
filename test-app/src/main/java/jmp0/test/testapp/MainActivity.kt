package jmp0.test.testapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var tv =TextView(MainActivity@this)
        tv.setText("hello")
        setContentView(tv)
//        TestReflection.testAll()
        DebugTest(111, "22").testAll(1);
//        SharedPreferencesTest(this).testAll()
//        TestContext(this).testAll()
//        TestAES()
//        TestNative().testAll()
    }
}