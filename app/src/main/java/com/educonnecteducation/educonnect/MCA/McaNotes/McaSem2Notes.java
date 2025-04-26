package com.educonnecteducation.educonnect.MCA.McaNotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class McaSem2Notes extends AppCompatActivity {
    LinearLayout ca,cc,cg,cao,or,cf,ap;
    Toolbar sem2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem2_notes);
        sem2= findViewById(R.id.mca_sem2_toolbar_notes);
        ca=findViewById(R.id.mca_sem2_notes_ca);
        cc=findViewById(R.id.mca_sem2_notes_cc);
        cg=findViewById(R.id.mca_sem2_notes_cg);
        cao=findViewById(R.id.mca_sem2_notes_cao);
        or=findViewById(R.id.mca_sem2_notes_or);
        cf=findViewById(R.id.mca_sem2_notes_cf);
        ap=findViewById(R.id.mca_sem2_notes_ap);
        setSupportActionBar(sem2);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}