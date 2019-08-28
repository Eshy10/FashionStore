package com.example.fashionstore.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fashionstore.R
import com.example.fashionstore.ProductList
import kotlinx.android.synthetic.main.activity_shirt.view.*

class ShirtAdapter (private val shirt_products: ArrayList<ProductList>) : RecyclerView.Adapter<ShirtAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_shirt, parent, false)
        return ViewHolder(view)


    }

    override fun getItemCount(): Int {
        return shirt_products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val productshirt = shirt_products[position]
        holder.shirtimage.setImageResource(productshirt.image)
        holder.shirttitle.text = productshirt.name
        holder.shirtprice.text = productshirt.price.toString()
    }


    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
      val shirtimage = itemView.shirt_photo!!
        val shirttitle = itemView.shirt_title!!
        val shirtprice = itemView.shirt_price!!
    }

}