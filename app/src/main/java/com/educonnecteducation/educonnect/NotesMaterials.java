package com.educonnecteducation.educonnect;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.BCA.BcaNotes.BcaNotes;
import com.educonnecteducation.educonnect.MCA.McaNotes.McaNotes;

import java.util.Objects;

public class NotesMaterials extends AppCompatActivity {
LinearLayout bca,mca;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_materials);
        Toolbar toolbar = findViewById(R.id.notes_material_toolbar);
        bca=findViewById(R.id.bca_notes);
        mca=findViewById(R.id.mca_notes);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        mca.setOnClickListener(v -> {
            Intent intent=new Intent(NotesMaterials.this, McaNotes.class);
            startActivity(intent);
        });
        bca.setOnClickListener(v -> {
            Intent intent=new Intent(NotesMaterials.this, BcaNotes.class);
            startActivity(intent);
        });

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}