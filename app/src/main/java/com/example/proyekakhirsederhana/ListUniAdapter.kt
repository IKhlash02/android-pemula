package com.example.proyekakhirsederhana

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.proyekakhirsederhana.databinding.ItemRowUniBinding

class ListUniAdapter(private val listUni: ArrayList<University>): RecyclerView.Adapter<ListUniAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: University)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowUniBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val uni = listUni[position]

        Glide.with(holder.itemView.context)
            .load(uni.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.binding.imgItemPhoto)

        holder.binding.tvItemName.text = uni.name
        holder.binding.tvItemDetail.text = uni.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listUni[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listUni.size
    }

    class ListViewHolder(var binding: ItemRowUniBinding): RecyclerView.ViewHolder(binding.root)




}