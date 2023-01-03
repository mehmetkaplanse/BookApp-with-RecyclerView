package com.mehmetkaplan.deneme1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.mehmetkaplan.deneme1.databinding.RecyclerRowBinding

class LandMarkAdapter(val landMarkList: ArrayList<LandMark>): RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>() {
    class LandMarkHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandMarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
        holder.binding.recyclerTextView.text = landMarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",landMarkList.get((position)))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return landMarkList.size
    }
}