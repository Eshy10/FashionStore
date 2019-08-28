package com.example.fashionstore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fashionstore.adapter.ShirtAdapter
import kotlinx.android.synthetic.main.activity_main.*

class ShirtActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_categories.text = "Products"

        val shirt_product = arrayListOf(
            ProductList(R.drawable.shirt1, "Devslopes Shirt Black", 18),
            ProductList(R.drawable.shirt2, "Devslopes Badge Light Gray", 20),
            ProductList(R.drawable.shirt3, "Devslopes Logo Shirt Red", 22),
            ProductList(R.drawable.shirt4, "Devslopes Shirt Hustle", 18),
           ProductList(R.drawable.shirt5, "Devslopes Shirt Badge Black", 25)

        )

        recycler_view.apply {
            layoutManager = GridLayoutManager(this@ShirtActivity, 2)
            adapter = ShirtAdapter(shirt_product)
        }

    }



}
