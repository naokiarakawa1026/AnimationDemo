package com.example.animationdemo

import android.animation.AnimatorInflater
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.animationdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun scaleAnimation(view: View) {
        val scaleAnimator = AnimatorInflater.loadAnimator(this, R.animator.scale)
        scaleAnimator?.apply {
            setTarget(binding.testImage)
            start()
        }
    }

    fun rotateAnimation(view: View) {
        val rotateAnimator = AnimatorInflater.loadAnimator(this, R.animator.rotate)
        rotateAnimator?.apply {
            setTarget(binding.testImage)
            start()
        }
    }

    fun fadeAnimation(view: View) {
        val fadeAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha)
        fadeAnimator.setTarget(binding.testImage)
        fadeAnimator.start()
    }

    fun translateAnimation(view: View) {
        val translateAnimator = AnimatorInflater.loadAnimator(this, R.animator.translate)
        translateAnimator.apply {
            setTarget(binding.testImage)
            start()
        }
    }

}
