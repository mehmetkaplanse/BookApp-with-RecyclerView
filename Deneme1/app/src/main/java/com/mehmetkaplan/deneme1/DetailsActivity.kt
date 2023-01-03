package com.mehmetkaplan.deneme1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mehmetkaplan.deneme1.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        val landMark = intent.getSerializableExtra("landmark") as LandMark
        binding.nameText.text = landMark.name
        binding.countryText.text = landMark.country
        binding.imageView.setImageResource(landMark.Image)









    }
}