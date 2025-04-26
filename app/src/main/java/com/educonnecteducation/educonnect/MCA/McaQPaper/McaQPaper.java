package com.educonnecteducation.educonnect.MCA.McaQPaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class McaQPaper extends AppCompatActivity {
    Toolbar toolbar;
    LinearLayout sem1,sem2,sem3,sem4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_qpaper);
        toolbar=findViewById(R.id.mca_qpaper_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        sem1=findViewById(R.id.mca_sem1_qpaper);
        sem2=findViewById(R.id.mca_sem2_qpaper);
        sem3=findViewById(R.id.mca_sem3_qpaper);
        sem4=findViewById(R.id.mca_sem4_qpaper);
        sem1.setOnClickListener(v -> {
            Intent intent=new Intent(McaQPaper.this,McaSem1QPaper.class);
            startActivity(intent);
        });
        sem2.setOnClickListener(v -> {
            Intent intent=new Intent(McaQPaper.this,McaSem2QPaper.class);
            startActivity(intent);
        });
        sem3.setOnClickListener(v -> {
            Intent intent=new Intent(McaQPaper.this,McaSem3QPaper.class);
            startActivity(intent);
        });
        sem4.setOnClickListener(v -> Toast.makeText(this, "MCA Semester 4 Question Paper are not available", Toast.LENGTH_SHORT).show());
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}