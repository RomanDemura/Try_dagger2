package tech.demura.try_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val keyboard = Activity().keyboard.toString()
        val monitor = Activity().monitor.toString()
        val mouse = Activity().mouse.toString()
    }
}