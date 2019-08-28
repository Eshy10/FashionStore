package com.example.fashionstore.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fashionstore.R
import com.example.fashionstore.ProductList
import kotlinx.android.synthetic.main.activity_hats.view.*

class CapAdapter (private val cap_products: ArrayList<ProductList>) : RecyclerView.Adapter<CapAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_hats, parent, false)
        return ViewHolder(view)


    }

    override fun getItemCount(): Int {
        return cap_products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val productcap = cap_products[position]
        holder.capimage.setImageResource(productcap.image)
        holder.captitle.text = productcap.name
        holder.capprice.text = productcap.price.toString()
    }


    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val capimage = itemView.cap_photo!!
        val captitle = itemView.cap_title!!
        val capprice = itemView.cap_price!!
    }

}