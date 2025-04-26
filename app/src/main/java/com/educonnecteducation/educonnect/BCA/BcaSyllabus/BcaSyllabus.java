package com.educonnecteducation.educonnect.BCA.BcaSyllabus;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSyllabus extends AppCompatActivity {
   LinearLayout sem1,sem2,sem3,sem4,sem5,sem6,fullsem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_syllabus);
       Toolbar toolbar=findViewById(R.id.bca_syllabus_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        sem1=findViewById(R.id.bca_sem1_syllabus);
        sem2=findViewById(R.id.bca_sem2_syllabus);
        sem3=findViewById(R.id.bca_sem3_syllabus);
        sem4=findViewById(R.id.bca_sem4_syllabus);
        sem5=findViewById(R.id.bca_sem5_syllabus);
        sem6=findViewById(R.id.bca_sem6_syllabus);
        fullsem=findViewById(R.id.bca_full_syllabus);
        sem1.setOnClickListener(v -> {
            Intent intent=new Intent(BcaSyllabus.this, BcaSem1Syllabus.class);
            startActivity(intent);
        });
        sem2.setOnClickListener(v -> {
            Intent intent=new Intent(BcaSyllabus.this, BcaSem2Syllabus.class);
            startActivity(intent);
        });
        sem3.setOnClickListener(v -> {
            Intent intent=new Intent(BcaSyllabus.this, BcaSem3Syllabus.class);
            startActivity(intent);
        });
        sem4.setOnClickListener(v -> {
            Intent intent=new Intent(BcaSyllabus.this, BcaSem4Syllabus.class);
            startActivity(intent);
        });
        sem5.setOnClickListener(v -> {
            Intent intent=new Intent(BcaSyllabus.this, BcaSem5Syllabus.class);
            startActivity(intent);
        });
        sem6.setOnClickListener(v -> {
            Intent intent=new Intent(BcaSyllabus.this, BcaSem6Syllabus.class);
            startActivity(intent);
        });
        fullsem.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/14YSFi_7Sjyp3oiLwo03OxJo4z9vJA13K/view?usp=sharing"))));







    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}