package com.educonnecteducation.educonnect.MCA.McaSyllbus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class McaSem2Syllabus extends AppCompatActivity {
    LinearLayout ca,cc,cg,cao,or,cf,ap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem2_syllabus);
       Toolbar toolbar= findViewById(R.id.mca_sem2_toolbar_syllabus);
        ca=findViewById(R.id.mca_sem2_syllabus_ca);
        cc=findViewById(R.id.mca_sem2_syllabus_cc);
        cg=findViewById(R.id.mca_sem2_syllabus_cg);
        cao=findViewById(R.id.mca_sem2_syllabus_cao);
        or=findViewById(R.id.mca_sem2_syllabus_or);
        cf=findViewById(R.id.mca_sem2_syllabus_cf);
        ap=findViewById(R.id.mca_sem2_syllabus_ap);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
       ca.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ZFQpX5tuhFqotfbkPqctQTf12xq210r4/view?usp=sharing"))));
       cc.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1AWoQqFOH5TCMQxw-Bxwq_S-KuL4G-Hrj/view?usp=sharing"))));
       cg.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1hQ6E5omvvbeuDsIuC5hcbxyyKPIlsJkO/view?usp=sharing"))));
       cao.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ClhGc98Y05J3mydr3iR8mOByEvasWmmx/view?usp=sharing"))));
       or.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/17jxC0CIcf6648rX3TOnv1BgglDnEW1yG/view?usp=sharing"))));
       cf.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/17E1Yf0bMUPsuO7OVxrLlBlPK9yVRl1Ly/view?usp=sharing"))));
       ap.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Dl7wFWjlcPst5JVOinEGdd5kENQq0b6l/view?usp=sharing"))));

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}