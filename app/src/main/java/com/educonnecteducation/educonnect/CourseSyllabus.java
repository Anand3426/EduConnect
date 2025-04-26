package com.educonnecteducation.educonnect;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.BCA.BcaSyllabus.BcaSyllabus;
import com.educonnecteducation.educonnect.MCA.McaSyllbus.McaSyllabus;

import java.util.Objects;

public class CourseSyllabus extends AppCompatActivity {
    Toolbar toolbar1;
    LinearLayout mca,bca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couse_syllabus);
        toolbar1=findViewById(R.id.syllabus_toolbar);
        mca= findViewById(R.id.mca);
        bca=findViewById(R.id.bca_syllabus);
        setSupportActionBar(toolbar1);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        mca.setOnClickListener(v -> {
            Intent intent=new Intent(CourseSyllabus.this, McaSyllabus.class);
            startActivity(intent);
        });
        bca.setOnClickListener(v -> {
            Intent intent=new Intent(CourseSyllabus.this, BcaSyllabus.class);
            startActivity(intent);
        });

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}