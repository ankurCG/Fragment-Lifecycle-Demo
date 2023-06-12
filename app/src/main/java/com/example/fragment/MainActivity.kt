package com.example.fragment

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragmentBtn1.setOnClickListener {
            fragmentReplace(FirstFragment())
        }
        binding.fragmentBtn2.setOnClickListener {
            fragmentReplace(SecondFragment())
        }

        val toast = Toast.makeText(this, "Activity_onCreate_called", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
        Log.i("tag","Main_onCreate")
    }

    private fun fragmentReplace(fragment:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()

    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(this, "Activity_onStart_called", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
        Log.i("tag","Main_onStart")
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(this, "Activity_onResume_called", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
        Log.i("tag","Main_onResume")
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(this, "Activity_onPause_called", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
        Log.i("tag","Main_onPause")
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(this, "Activity_onStop_called", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
        Log.i("tag","Main_onStop")
    }

    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(this, "Activity_onRestart_called", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
        Log.i("tag","Main_onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(this, "Activity_onDestroy_called", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.show()
        Log.i("tag","Main_onDestroy")
    }
}