package com.educonnecteducation.educonnect.BCA.BcaNotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem5Notes extends AppCompatActivity {
    LinearLayout cg,cc,vb,se,php,dcn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem5_notes);
        Toolbar sem5=findViewById(R.id.bca_sem5_toolbar_notes);
        cg=findViewById(R.id.bca_sem5_cg_notes);
        cc=findViewById(R.id.bca_sem5_cc_notes);
        vb=findViewById(R.id.bca_sem5_vb_notes);
        se=findViewById(R.id.bca_sem5_se_notes);
        php=findViewById(R.id.bca_sem5_php_notes);
        dcn=findViewById(R.id.bca_sem5_dcn_notes);
        setSupportActionBar(sem5);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        dcn.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-3gUoWzzbTpGmuUdbjJEHJ9iXr_z1Xrg/view?usp=sharing"))));
        php.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-9c-fD_Nw6-VaxsNDhYBWkUBb535998i/view?usp=sharing"))));
        vb.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1-XbXBctCwIt2Hp5N0zFsekzeDcyazwAU/view?usp=sharing"))));
        se.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1-NrMy-XBJ4lmBpoqdOZbYnmjlzOALlsd/view?usp=sharing"))));
        cc.setOnClickListener(v -> Toast.makeText(this, "Compiler Construction Notes are coming soon..", Toast.LENGTH_SHORT).show());
        cg.setOnClickListener(v -> Toast.makeText(this, "Computer Graphics Notes are coming Soon..", Toast.LENGTH_SHORT).show());
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}