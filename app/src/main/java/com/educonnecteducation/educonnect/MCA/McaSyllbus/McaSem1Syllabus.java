package com.educonnecteducation.educonnect.MCA.McaSyllbus;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class McaSem1Syllabus extends AppCompatActivity {
    LinearLayout ajava,dcn,adbms,php,se;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem1_syllabus);
        Toolbar toolbar= findViewById(R.id.mca_sem1_toolbar_syllabus);
        ajava=findViewById(R.id.mca_sem1_syllabus_java);
        dcn=findViewById(R.id.mca_sem1_syllabus_dcn);
        adbms=findViewById(R.id.mca_sem1_syllabus_adbms);
        php=findViewById(R.id.mca_sem1_syllabus_php);
        se=findViewById(R.id.mca_sem1_syllabus_se);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        ajava.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1D_vTyeRYVFgG9WRtJPuCz170GOkAHHND/view?usp=sharing"))));
        dcn.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Bvzo5Ws7U6K2zUwjDh5x-4OPPoFDGelB/view?usp=sharing"))));
        adbms.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1UtAdcj5mVxwdg_OZJGtaoPUDI2Ijc5Jl/view?usp=sharing"))));
        php.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Rw8WfMYvZ3wZPt3FAkhcCLxriv_ZnGnG/view?usp=sharing"))));
        se.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Xtz-6RmDFGDrHTFemD8n56ZSl-tgalRh/view?usp=sharing"))));




    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}