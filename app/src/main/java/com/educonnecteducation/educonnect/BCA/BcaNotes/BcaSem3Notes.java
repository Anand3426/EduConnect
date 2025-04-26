package com.educonnecteducation.educonnect.BCA.BcaNotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;


public class BcaSem3Notes extends AppCompatActivity {
    LinearLayout vbp,dbms,ds,or,wt,de;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem3_notes);
        ds=findViewById(R.id.bca_sem3_ds_notes);
        vbp=findViewById(R.id.bca_sem3_vbp_notes);
        dbms=findViewById(R.id.bca_sem3_dbms_notes);
        or=findViewById(R.id.bca_sem3_or_notes);
        wt=findViewById(R.id.bca_sem3_wt_notes);
        de=findViewById(R.id.bca_sem3_de_notes);
        Toolbar sem3=findViewById(R.id.bca_sem3_toolbar_notes);
        setSupportActionBar(sem3);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}