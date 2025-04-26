package com.educonnecteducation.educonnect.MCA.McaSyllbus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class McaSyllabus extends AppCompatActivity {
    Toolbar toolbar;
    LinearLayout sem1,sem2,sem3,sem4,allsem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_syllabus_show);
        toolbar=findViewById(R.id.mca_syllabus_toolbar);
        sem1= findViewById(R.id.mca_sem1_syllabus);
        sem2=findViewById(R.id.mca_sem2_syllabus);
        sem3= findViewById(R.id.mca_sem3_syllabus);
        sem4= findViewById(R.id.mca_sem4_syllabus);
        allsem= findViewById(R.id.mca_full_syllabus);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        sem1.setOnClickListener(v -> {
            Intent intent=new Intent(McaSyllabus.this, McaSem1Syllabus.class);
            startActivity(intent);
        });
        sem2.setOnClickListener(v -> {
            Intent intent=new Intent(McaSyllabus.this, McaSem2Syllabus.class);
            startActivity(intent);
        });
        sem3.setOnClickListener(v -> {
            Intent intent=new Intent(McaSyllabus.this, McaSem3Syllabus.class);
            startActivity(intent);
        });
        sem4.setOnClickListener(v -> {
            Intent intent=new Intent(McaSyllabus.this, McaSem4Syllabus.class);
            startActivity(intent);
        });
        allsem.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yb6CKHr3mkHLHNkASg0_ASTFzDlaa2Ch/view?usp=sharing"))));

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}