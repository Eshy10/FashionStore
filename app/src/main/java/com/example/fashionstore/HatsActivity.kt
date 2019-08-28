package com.example.fashionstore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fashionstore.adapter.CapAdapter
import kotlinx.android.synthetic.main.activity_main.*

class HatsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_categories.text = "Products"

        val capProduct = arrayListOf(
            ProductList(R.drawable.hat1, "Devslopes Cap Black", 18),
            ProductList(R.drawable.hat2, "Devslopes Badge Cap Gray", 20),
            ProductList(R.drawable.hat3, "Devslopes Logo Cap Red", 22),
            ProductList(R.drawable.hat4, "Devslopes Cap Hustle", 18)

        )

        recycler_view.apply {
            layoutManager = GridLayoutManager(this@HatsActivity, 2)
            adapter = CapAdapter(capProduct)
        }



    }}