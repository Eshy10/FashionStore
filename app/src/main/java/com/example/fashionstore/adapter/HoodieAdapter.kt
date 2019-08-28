package com.example.fashionstore.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fashionstore.R
import com.example.fashionstore.ProductList
import kotlinx.android.synthetic.main.activity_hoodies.view.*

class HoodieAdapter (private val hood_products: ArrayList<ProductList>) : RecyclerView.Adapter<HoodieAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_hoodies, parent, false)
        return ViewHolder(view)


    }

    override fun getItemCount(): Int {
        return hood_products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val producthood = hood_products[position]
        holder.hoodieimage.setImageResource(producthood.image)
        holder.hoodietitle.text = producthood.name
        holder.hoodieprice.text = producthood.price.toString()
    }


    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hoodieimage = itemView.hoodie_photo!!
        val hoodietitle = itemView.hoodie_title!!
        val hoodieprice = itemView.hoodie_price!!
    }

}