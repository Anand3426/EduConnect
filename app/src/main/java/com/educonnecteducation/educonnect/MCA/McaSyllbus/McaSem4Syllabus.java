package com.educonnecteducation.educonnect.MCA.McaSyllbus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class McaSem4Syllabus extends AppCompatActivity {
    Toolbar toolbar;
    LinearLayout pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem4_syllabus);
       toolbar=findViewById(R.id.mca_sem4_toolbar_syllabus);
       pw=findViewById(R.id.mca_sem4_syllabus_pw);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        pw.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1kMto8_7NQgWWa8EvoklaZyEbEFbE7MTJ/view?usp=sharing"))));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}