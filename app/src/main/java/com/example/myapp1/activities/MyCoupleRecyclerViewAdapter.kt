package com.example.myapp1.activities

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapp1.R

import com.example.myapp1.activities.placeholder.PlaceholderContent.PlaceholderItem
import com.example.myapp1.databinding.FragmentCoupleListBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyCoupleRecyclerViewAdapter(
    private var values: List<RegistrationFragmentViewModel>
) : RecyclerView.Adapter<MyCoupleRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentCoupleListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]

        holder.femaleDancer.text = item.femaleDancer
        holder.maleDancer.text = item.maleDancer
        holder.couplesCategoryName.text = item.couplesCategoryName
        holder.coreographyName.text = item.coreographyName
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentCoupleListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val femaleDancer: TextView = binding.femaleDancer
        val maleDancer: TextView = binding.maleDancer
        val couplesCategoryName: TextView = binding.couplesCategoryName
        val coreographyName: TextView = binding.coreographyName

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newData: List<RegistrationFragmentViewModel>) {
        values = newData
        notifyDataSetChanged()
    }

}