package com.pab.nuraki_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListFishAdapter(private val listFish: ArrayList<Fish>) : RecyclerView.Adapter<ListFishAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_fish, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val fish = listFish[position]
        holder.imgPhoto.setImageResource(fish.photo)
        holder.tvName.text = fish.name
        holder.tvScientificName.text = fish.scientificName
        holder.tvDescription.text = fish.description

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listFish[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listFish.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvScientificName: TextView = itemView.findViewById(R.id.tv_item_scientific_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Fish)
    }
}