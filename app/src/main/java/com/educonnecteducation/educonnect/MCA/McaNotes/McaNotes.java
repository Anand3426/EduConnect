package com.educonnecteducation.educonnect.MCA.McaNotes;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class McaNotes extends AppCompatActivity {
    LinearLayout sem1,sem2,sem3,sem4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_notes);
        sem1=findViewById(R.id.mca_sem1_notes);
        sem2=findViewById(R.id.mca_sem2_notes);
        sem3=findViewById(R.id.mca_sem3_notes);
        sem4=findViewById(R.id.mca_sem4_notes);
        Toolbar toolbar=findViewById(R.id.mca_syllabus_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        sem1.setOnClickListener(v -> {
            Intent intent=new Intent(McaNotes.this, McaSem1Notes.class);
            startActivity(intent);
        });
        sem2.setOnClickListener(v -> {
            Intent intent=new Intent(McaNotes.this, McaSem2Notes.class);
            startActivity(intent);
        });
        sem3.setOnClickListener(v -> {
            Intent intent=new Intent(McaNotes.this, McaSem3Notes.class);
            startActivity(intent);
        });
        sem4.setOnClickListener(v -> Toast.makeText(this, "MCA Semester 4 Notes are not Available", Toast.LENGTH_SHORT).show());
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}