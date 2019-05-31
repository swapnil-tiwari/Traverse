package com.example.traverse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Mussoorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mussoorie);

        CardView cardView = (CardView)findViewById(R.id.card1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mussoorie.this,places_mussoorie.class);
                startActivity(intent);
            }
        });

        CardView cardView1 = (CardView)findViewById(R.id.card2);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mussoorie.this,food_mussoorie.class);
                startActivity(intent);
            }
        });
        CardView cardView2 = (CardView)findViewById(R.id.card3);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mussoorie.this,people_mussoorie.class);
                startActivity(intent);
            }
        });
        CardView cardView3 = (CardView)findViewById(R.id.card4);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mussoorie.this,moments_mussoorie.class);
                startActivity(intent);
            }
        });
    }
}
