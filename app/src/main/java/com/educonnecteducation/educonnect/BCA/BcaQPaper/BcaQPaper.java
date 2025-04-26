package com.educonnecteducation.educonnect.BCA.BcaQPaper;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaQPaper extends AppCompatActivity {
    LinearLayout sem1,sem2,sem3,sem4,sem5,sem6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_qpaper);
        sem1=findViewById(R.id.bca_sem1_qpaper);
        sem2=findViewById(R.id.bca_sem2_qpaper);
        sem3=findViewById(R.id.bca_sem3_qpaper);
        sem4=findViewById(R.id.bca_sem4_qpaper);
        sem5=findViewById(R.id.bca_sem5_qpaper);
        sem6=findViewById(R.id.bca_sem6_qpaper);
        Toolbar qpaper=findViewById(R.id.bca_qpaper_toolbar);
        setSupportActionBar(qpaper);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        sem1.setOnClickListener(v -> {
            Intent intent=new Intent(BcaQPaper.this,BcaSem1QPaper.class);
            startActivity(intent);
        });
        sem2.setOnClickListener(v -> {
            Intent intent=new Intent(BcaQPaper.this,BcaSem2QPaper.class);
            startActivity(intent);
        });
        sem3.setOnClickListener(v -> {
            Intent intent=new Intent(BcaQPaper.this,BcaSem3QPaper.class);
            startActivity(intent);
        });
        sem4.setOnClickListener(v -> {
            Intent intent=new Intent(BcaQPaper.this,BcaSem4QPaper.class);
            startActivity(intent);
        });
        sem5.setOnClickListener(v -> {
            Intent intent=new Intent(BcaQPaper.this,BcaSem5QPaper.class);
            startActivity(intent);
        });
        sem6.setOnClickListener(v -> {
            Intent intent=new Intent(BcaQPaper.this,BcaSem6QPaper.class);
            startActivity(intent);
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}