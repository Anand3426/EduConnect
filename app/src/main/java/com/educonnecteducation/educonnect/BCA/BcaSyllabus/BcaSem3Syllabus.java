package com.educonnecteducation.educonnect.BCA.BcaSyllabus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem3Syllabus extends AppCompatActivity {
    LinearLayout vbp,dbms,ds,or,wt,de;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem3_syllabus);
        ds=findViewById(R.id.bca_sem3_ds);
        vbp=findViewById(R.id.bca_sem3_vbp);
        dbms=findViewById(R.id.bca_sem3_dbms);
        or=findViewById(R.id.bca_sem3_or);
        wt=findViewById(R.id.bca_sem3_wt);
        de=findViewById(R.id.bca_sem3_de);
        Toolbar sem3=findViewById(R.id.bca_sem3_toolbar_syllabus);
        setSupportActionBar(sem3);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        ds.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1os1-yMf9cPdq6q6ZLiajxryTTU15AocT/view?usp=sharing"))));
        vbp.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1EDPOfjRQNLHbjuEC7DgTb1MEV7RDwPtT/view?usp=sharing"))));
        dbms.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1NfHTW_7KQAn03GhpGOqx05beMVKJ0jHG/view?usp=sharing"))));
        or.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1A0AmVKXycgl0fBgvj40PkudmXBBfI5dX/view?usp=sharing"))));
        wt.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1PtVt9REk8Yx5Su_v5AVRQx1cqpZ29Wwb/view?usp=sharing"))));
        de.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1UHM1rTyx9YEl60PJqG7IJ5MPXP1HNlbw/view?usp=sharing"))));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}