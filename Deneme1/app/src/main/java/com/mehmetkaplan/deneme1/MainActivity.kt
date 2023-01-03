package com.mehmetkaplan.deneme1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.mehmetkaplan.deneme1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landMarkList : ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landMarkList = ArrayList<LandMark>()


        //data
        val pisa = LandMark("Pisa","Italy",R.drawable.pisa)
        val colosseum = LandMark("Colosseum","Italy",R.drawable.colosseum)
        val eiffel = LandMark("Eiffel","France",R.drawable.eiffeltoren)
        val londonBridge = LandMark("London Bridge","Uk",R.drawable.londonb)

        landMarkList.add(pisa)
        landMarkList.add(colosseum)
        landMarkList.add(eiffel)
        landMarkList.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landMarkAdapter = LandMarkAdapter(landMarkList)
        binding.recyclerView.adapter = landMarkAdapter



    }

}