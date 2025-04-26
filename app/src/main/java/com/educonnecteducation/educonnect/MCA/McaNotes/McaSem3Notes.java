package com.educonnecteducation.educonnect.MCA.McaNotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class McaSem3Notes extends AppCompatActivity {
    LinearLayout bda,dm,pp,ai,ml,mc,sc;
    Toolbar sem3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem3_notes);
        sem3=findViewById(R.id.mca_sem3_toolbar_notes);
        bda=findViewById(R.id.mca_sem3_notes_bda);
        dm=findViewById(R.id.mca_sem3_notes_dm);
        pp=findViewById(R.id.mca_sem3_notes_pp);
        ai=findViewById(R.id.mca_sem3_notes_ai);
        ml=findViewById(R.id.mca_sem3_notes_ml);
        mc=findViewById(R.id.mca_sem3_notes_mc);
        sc=findViewById(R.id.mca_sem3_notes_sc);

        setSupportActionBar(sem3);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}