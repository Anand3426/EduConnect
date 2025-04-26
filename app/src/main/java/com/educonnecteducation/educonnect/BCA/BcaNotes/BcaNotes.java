package com.educonnecteducation.educonnect.BCA.BcaNotes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaNotes extends AppCompatActivity {
    LinearLayout sem1,sem2,sem3,sem4,sem5,sem6;
    Toolbar toolbar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_notes);
        toolbar=findViewById(R.id.bca_notes_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        sem1=findViewById(R.id.bca_sem1_notes);
        sem2=findViewById(R.id.bca_sem2_notes);
        sem3=findViewById(R.id.bca_sem3_notes);
        sem4=findViewById(R.id.bca_sem4_notes);
        sem5=findViewById(R.id.bca_sem5_notes);
        sem6=findViewById(R.id.bca_sem6_notes);
        sem1.setOnClickListener(v -> {
            Intent intent=new Intent(BcaNotes.this, BcaSem1Notes.class);
            startActivity(intent);
        });
        sem2.setOnClickListener(v -> {
            Intent intent=new Intent(BcaNotes.this, BcaSem2Notes.class);
            startActivity(intent);
        });
        sem3.setOnClickListener(v -> {
            Intent intent=new Intent(BcaNotes.this, BcaSem3Notes.class);
            startActivity(intent);
        });
        sem4.setOnClickListener(v -> {
            Intent intent=new Intent(BcaNotes.this, BcaSem4Notes.class);
            startActivity(intent);
        });
        sem5.setOnClickListener(v -> {
            Intent intent=new Intent(BcaNotes.this, BcaSem5Notes.class);
            startActivity(intent);
        });
        sem6.setOnClickListener(v -> {
            Intent intent=new Intent(BcaNotes.this, BcaSem6Notes.class);
            startActivity(intent);
        });
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}