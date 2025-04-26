package com.educonnecteducation.educonnect.CollegeInfo;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class AboutDepartment extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_department);
        toolbar=findViewById(R.id.about_dept_toolbar);
        imageView=findViewById(R.id.about_dept_photo);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/College%20Photo%2Fkdk%20photo-modified.png?alt=media&token=6458881a-267e-4473-91b5-401f1a5eb3b5")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(imageView);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}