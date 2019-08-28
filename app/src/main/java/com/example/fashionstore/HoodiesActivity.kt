package com.example.fashionstore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fashionstore.adapter.HoodieAdapter
import kotlinx.android.synthetic.main.activity_main.*

class HoodiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_categories.text = "Products"

        val hoodiesproduct = arrayListOf(
            ProductList(R.drawable.hoodie1, "Devslopes Hoodies Black", 18),
            ProductList(R.drawable.hoodie2, "Devslopes Badge Hoodies Gray", 20),
            ProductList(R.drawable.hoodie3, "Devslopes Logo Hoodies Red", 22),
            ProductList(R.drawable.hoodie4, "Devslopes Hoodies Hustle", 18)

        )

        recycler_view.apply {
            layoutManager = GridLayoutManager(this@HoodiesActivity, 2)
            adapter = HoodieAdapter(hoodiesproduct)
        }

    }}