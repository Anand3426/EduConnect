package com.educonnecteducation.educonnect.BCA.BcaSyllabus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem5Syllabus extends AppCompatActivity {
    LinearLayout cg,cc,vb,se,php,dcn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem5_syllabus);
        Toolbar sem5=findViewById(R.id.bca_sem5_toolbar_syllabus);
        cg=findViewById(R.id.bca_sem5_cg);
        cc=findViewById(R.id.bca_sem5_cc);
        vb=findViewById(R.id.bca_sem5_vb);
        se=findViewById(R.id.bca_sem5_se);
        php=findViewById(R.id.bca_sem5_php);
        dcn=findViewById(R.id.bca_sem5_dcn);
        setSupportActionBar(sem5);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        cg.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1dtStadx4qwH1IjEnSNGv2Y9eXoeAuU1P/view?usp=sharing"))));
        cc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1v4M56e3sOfrdtyM_rnrXVyLB62GwH0qv/view?usp=sharing"))));
        vb.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1gESYJhoP_V_lDM4U6DgatAUTG6CwSd1k/view?usp=sharing"))));
        se.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1p8dhhq5qpL2yHJy3fTgXon-gixux5v5k/view?usp=sharing"))));
        php.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1zBooCzQGXe5pUS03ecF1Xr6JfxVQoU9G/view?usp=sharing"))));
        dcn.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1d3TNZYxzrrhK7w58a4-NyfsVt5AnqFBY/view?usp=sharing"))));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}