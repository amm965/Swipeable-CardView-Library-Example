package com.bitorbit.swipeablecardviewlibrarytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.bitorbit.swipeablecardview.SwipeableCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val locationCardView: SwipeableCardView = findViewById(R.id.locationCardView)
        val imageCardView: SwipeableCardView = findViewById(R.id.generalImageCard)
        val btnReset: Button = findViewById(R.id.btnAction)

        locationCardView.addOnSwipedListener {
            Toast.makeText(this, "Location card has been swiped away!!!", Toast.LENGTH_SHORT).show()
        }

        imageCardView.addOnSwipedListener {
            Toast.makeText(this, "image card has been swiped away!!!", Toast.LENGTH_SHORT).show()
        }

    }
}