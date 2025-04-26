package com.educonnecteducation.educonnect.MCA.McaSyllbus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class McaSem3Syllabus extends AppCompatActivity {
    LinearLayout bda,dm,pp,ai,ml,mc,sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem3_syllabus);
        Toolbar toolbar=findViewById(R.id.mca_sem3_toolbar_syllabus);
        bda=findViewById(R.id.mca_sem3_syllabus_bda);
        dm=findViewById(R.id.mca_sem3_syllabus_dm);
        pp=findViewById(R.id.mca_sem3_syllabus_pp);
        ai=findViewById(R.id.mca_sem3_syllabus_ai);
        ml=findViewById(R.id.mca_sem3_syllabus_ml);
        mc=findViewById(R.id.mca_sem3_syllabus_mc);
        sc=findViewById(R.id.mca_sem3_syllabus_sc);

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        bda.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/14yP5PKTGDANVTAB0DCHJocdWUKZryNxV/view?usp=sharing"))));
        dm.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/14rjM75OTDsrbkwvIQzKgf7MABNTcVIDx/view?usp=sharing"))));
        pp.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1f-I2uJmIXEJTfxCxBFnjqTzV9XM10RD5/view?usp=sharing"))));
        ai.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1bmck5tjT9J4S1NjIQ3o43ruvPTrlExkY/view?usp=sharing"))));
        ml.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/15k8IyzJwJjVH3oDleJy0wqsGGJMWFmSk/view?usp=sharing"))));
        mc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1w3VakGviWrWTRsmX_f9nzVMufz-WLysJ/view?usp=sharing"))));
        sc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1aREv8qtM8pzeaR_dS6bsaIJmZwltuPam/view?usp=sharing"))));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}