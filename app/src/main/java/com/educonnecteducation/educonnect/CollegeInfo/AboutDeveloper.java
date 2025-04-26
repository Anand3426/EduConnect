package com.educonnecteducation.educonnect.CollegeInfo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class AboutDeveloper extends AppCompatActivity {
    ImageView dp1,dp2;
    Toolbar toolbar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);
        dp1=findViewById(R.id.dp1);
        dp2=findViewById(R.id.dp2);
        toolbar=findViewById(R.id.developer_page_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Developer%20Photo%2Fanand_photo.png?alt=media&token=dd488838-ae44-4c92-af8e-ea831a7f0d50")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // Cache the image for offline access
                .into(dp1);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Developer%20Photo%2Farya_photo.png?alt=media&token=3dc55a34-f1b1-48da-8fc8-2a219b14e5a6")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // Cache the image for offline access
                .into(dp2);


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return  true;
    }
}