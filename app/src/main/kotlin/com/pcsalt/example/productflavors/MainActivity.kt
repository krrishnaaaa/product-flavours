package com.pcsalt.example.productflavors

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pcsalt.example.productflavors.databinding.ActivityMainBinding
import com.pcsalt.example.productflavors.utils.MyLog

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.textView.text = "${getString(R.string.app_name)} - ${BuildConfig.VERSION_NAME}"

    MyLog.e(TAG, "some error log")
  }

  companion object {
    private const val TAG = "MainActivity"
  }
}
