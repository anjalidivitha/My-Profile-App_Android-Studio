package com.example.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.homescreen.*

class MainActivity : AppCompatActivity() {

    var photo: ImageView? =null
    var edubutton: Button? = null
    var workbutton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)

        photo=findViewById(R.id.profilePhoto)
        photo?.setOnClickListener({

            var clickIntent = Intent(this@MainActivity, profile_photo::class.java)
            startActivity(clickIntent)
        })

        edubutton=findViewById(R.id.edu_button)
        edubutton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,education::class.java )
            startActivity(clickIntent)
        })

        workbutton=findViewById(R.id.work_button)
        workbutton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,work::class.java )
            startActivity(clickIntent)
        })



    }
}
