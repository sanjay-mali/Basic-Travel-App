package com.example.travelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var currenctIndex = 0
    lateinit var image :ImageView

    var places = arrayOf("RJ", "New York", "Taj Mahel", "Banaras","Kasmir")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnNext = findViewById<ImageButton>(R.id.btnNext)
        var btnPrev = findViewById<ImageButton>(R.id.btnPrev)
        var placeName = findViewById<TextView>(R.id.pName)
        btnNext.setOnClickListener{
            var currentImgString = "pic$currenctIndex"

            var currentImgInt = this.resources.getIdentifier(currentImgString,"id",packageName)
            image = findViewById(currentImgInt)
            image.alpha = 0F

            currenctIndex =  (5+currenctIndex+1)%5
            var imgShowString = "pic$currenctIndex"
            var imgShowInt = this.resources.getIdentifier(imgShowString,"id",packageName)
            image = findViewById(imgShowInt)
            image.alpha = 1F

            placeName.text = places[currenctIndex]
        }
        btnPrev.setOnClickListener{
            var currentImgString = "pic$currenctIndex"

            var currentImgInt = this.resources.getIdentifier(currentImgString,"id",packageName)
            image = findViewById(currentImgInt)
            image.alpha = 0F

            currenctIndex = (5+currenctIndex-1)%5
            var imgShowString = "pic$currenctIndex"
            var imgShowInt = this.resources.getIdentifier(imgShowString,"id",packageName)
            image = findViewById(imgShowInt)
            image.alpha = 1F

            placeName.text = places[currenctIndex]

        }
    }
}