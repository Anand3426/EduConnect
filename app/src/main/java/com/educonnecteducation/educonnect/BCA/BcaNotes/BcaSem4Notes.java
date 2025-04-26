package com.educonnecteducation.educonnect.BCA.BcaNotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem4Notes extends AppCompatActivity {
    LinearLayout se,sql,toc,or,wt,de;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem4_notes);
        se=findViewById(R.id.bca_sem4_se_notes);
        sql=findViewById(R.id.bca_sem4_sql_notes);
        toc=findViewById(R.id.bca_sem4_toc_notes);
        or=findViewById(R.id.bca_sem4_or_notes);
        wt=findViewById(R.id.bca_sem4_wt_notes);
        de=findViewById(R.id.bca_sem4_de_notes);
        Toolbar sem4=findViewById(R.id.bca_sem4_toolbar_notes);
        setSupportActionBar(sem4);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}