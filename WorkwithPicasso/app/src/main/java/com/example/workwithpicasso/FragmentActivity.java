package com.example.workwithpicasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        ImageView imageView = findViewById(R.id.full_screen);
        imageView.setImageResource(getIntent().getIntExtra("image", 0));
    }
}
