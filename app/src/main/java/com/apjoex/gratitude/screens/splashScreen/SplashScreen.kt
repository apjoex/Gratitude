package com.apjoex.gratitude.screens.splashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import com.apjoex.gratitude.R
import com.apjoex.gratitude.screens.home.HomeActivity
import com.apjoex.gratitude.utils.Constants
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)

        logo.startAnimation(AnimationUtils.loadAnimation(self@this, R.anim.zoom_in))

        Handler().postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, Constants.SPLASH_SCREEN_PRELOAD)
    }
}
