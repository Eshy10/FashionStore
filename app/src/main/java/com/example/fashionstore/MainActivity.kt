package com.example.fashionstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val product = arrayListOf(
            ListProduct(R.drawable.shirtimage, "SHIRT"),
            ListProduct(R.drawable.hoodieimage, "HOODIES"),
            ListProduct(R.drawable.hatimage, "CAPS")


        )

        recycler_view.apply {
         layoutManager = LinearLayoutManager(this@MainActivity)
          adapter = ProductAdapter(product)

        }



    }
}
