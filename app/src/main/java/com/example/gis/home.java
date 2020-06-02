package com.example.gis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class home extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper v_fliper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView btn2= findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        v_fliper=findViewById(R.id.v_fliper);
        int images[] ={R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6};
        for (int image :images){
            flipperImages(image);
        }

    }
    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_fliper.addView(imageView);
        v_fliper.setFlipInterval(4000);
        v_fliper.setAutoStart(true);

        v_fliper.setInAnimation(this, android.R.anim.slide_in_left
        );
        v_fliper.setOutAnimation(this,android.R.anim.slide_out_right

        );

    }

    @Override
    public void onClick(View v) {
        Intent pindahmenu = new Intent(home.this, MainActivity.class);
        startActivity(pindahmenu);
    }
}
