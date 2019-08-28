package com.example.fashionstore

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.product_list.view.*

class ProductAdapter(val product: ArrayList<ListProduct>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_list, parent, false)
        val holder = ViewHolder(view)
        return holder

    }

    override fun getItemCount(): Int {
        return product.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = product[position]
        holder.image.setImageResource(product.image)
        holder.name.text = product.name



    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.iview
        val name = itemView.tview

        init {
            itemView.setOnClickListener {
                when (adapterPosition) {
                    0 -> {
                        val intent = Intent(itemView.context, ShirtActivity::class.java)
                        itemView.context.startActivity(intent)
                    }
                    1 -> {
                        val intent = Intent(itemView.context, HoodiesActivity::class.java)
                        itemView.context.startActivity(intent)
                    }
                    2 -> {
                        val  intent = Intent(itemView.context, HatsActivity::class.java)
                        itemView.context.startActivity(intent)
                    }
                }

            }

        }

        }

    }






