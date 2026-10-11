
package com.niajallel.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 32, 32, 32)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "NIA JALLEL"
        title.textSize = 30f
        title.setTextColor(Color.rgb(25, 70, 150))
        title.gravity = Gravity.CENTER

        val message = TextView(this)
        message.text = "Bienvenue dans votre application"
        message.textSize = 18f
        message.setTextColor(Color.DKGRAY)
        message.gravity = Gravity.CENTER
        message.setPadding(0, 24, 0, 0)

        layout.addView(title)
        layout.addView(message)
        setContentView(layout)
    }
}
