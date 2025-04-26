package com.educonnecteducation.educonnect.BCA.BcaNotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem1Notes extends AppCompatActivity {
    LinearLayout eng,mar,cf,cp,sm,dm,os,oa;
    Toolbar sem1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem1_notes);
        sem1=findViewById(R.id.bca_sem1_toolbar_notes);
        eng=findViewById(R.id.bca_sem1_eng_notes);
        mar=findViewById(R.id.bca_sem1_marathi_notes);
        cf=findViewById(R.id.bca_sem1_cf_notes);
        cp=findViewById(R.id.bca_sem1_cp_notes);
        sm=findViewById(R.id.bca_sem1_sm_notes);
        dm=findViewById(R.id.bca_sem1_dm_notes);
        os=findViewById(R.id.bca_sem1_os_notes);
        oa=findViewById(R.id.bca_sem1_oa_notes);
        setSupportActionBar(sem1);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}