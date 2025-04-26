package com.educonnecteducation.educonnect.BCA.BcaSyllabus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem4Syllabus extends AppCompatActivity {
    LinearLayout se,sql,toc,or,wt,de;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem4_syllabus);
        se=findViewById(R.id.bca_sem4_se);
        sql=findViewById(R.id.bca_sem4_sql);
        toc=findViewById(R.id.bca_sem4_toc);
        or=findViewById(R.id.bca_sem4_or);
        wt=findViewById(R.id.bca_sem4_wt);
        de=findViewById(R.id.bca_sem4_de);
        Toolbar sem4=findViewById(R.id.bca_sem4_toolbar_syllabus);
        setSupportActionBar(sem4);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        se.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1OvuAKiDxjSam3LRtWLbkmikc0Njwy1ke/view?usp=sharing"))));
        sql.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/11A99gYhji6yw2SBbOlFbmF2njMIzTdOS/view?usp=sharing"))));
        toc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ai4H0Mc-D1YmZmPmQf99dxXuPa5cDX7K/view?usp=sharing"))));
        or.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/11Xre-UfVEOiwLhLkLk7l59AMbEDzjDot/view?usp=sharing"))));
        wt.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1IhKf82YiaAYQRvw_xvWGXNk1FZ02cRWd/view?usp=sharing"))));
        de.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1IhKf82YiaAYQRvw_xvWGXNk1FZ02cRWd/view?usp=sharing"))));
        
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}