package com.educonnecteducation.educonnect.BCA.BcaSyllabus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem6Syllabus extends AppCompatActivity {
    LinearLayout cg,java,asp,st,php,dcn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem6_syllabus);
        Toolbar sem6=findViewById(R.id.bca_sem6_toolbar_syllabus);
        cg=findViewById(R.id.bca_sem6_cg);
        java=findViewById(R.id.bca_sem6_java);
        asp=findViewById(R.id.bca_sem6_asp);
        st=findViewById(R.id.bca_sem6_st);
        php=findViewById(R.id.bca_sem6_php);
        dcn=findViewById(R.id.bca_sem6_dcn);
        setSupportActionBar(sem6);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        cg.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1s559bSGV_FNRKnJ8KwJq6CVsoLo6bwCs/view?usp=sharing"))));
        java.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1vS2BGL3Y-4Ik9e6XgZs_eegXo6JIhxqq/view?usp=sharing"))));
        asp.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/10rLsrGEX49jAjzCtCJw3uw-gWdFQEfFW/view?usp=sharing"))));
        st.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1OFn9EXPOdYjjv4OcPk15Na2iogpxM2nG/view?usp=sharing"))));
        php.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1_MfRcOHMCNEI5hgJtw6p22Y-3vuBaz-n/view?usp=sharing"))));
        dcn.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1viNUuL3NfUB4vQ63SEn6WAm5yDA_R6aD/view?usp=sharing"))));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}