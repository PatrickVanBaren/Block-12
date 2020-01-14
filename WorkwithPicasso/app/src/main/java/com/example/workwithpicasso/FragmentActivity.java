package com.example.workwithpicasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class FragmentActivity extends AppCompatActivity {

    ImageView imageView;
    Picasso picasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        imageView = findViewById(R.id.full_screen);
        picasso = Picasso.get();
        picasso.cancelRequest(imageView);
        imageView.setImageBitmap(null);
        picasso.load(getIntent().getStringExtra("image")).into(imageView);
    }
}
