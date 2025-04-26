package com.educonnecteducation.educonnect.BCA.BcaNotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem2Notes extends AppCompatActivity {
    LinearLayout eng, mar, cplus, sad, nm, dm, los, ec;
    Toolbar sem2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem2_notes);
        eng = findViewById(R.id.bca_sem2_eng_notes);
        mar = findViewById(R.id.bca_sem2_marathi_notes);
        cplus = findViewById(R.id.bca_sem2_cplus_notes);
        sad = findViewById(R.id.bca_sem2_sad_notes);
        nm = findViewById(R.id.bca_sem2_nm_notes);
        dm = findViewById(R.id.bca_sem2_dm_notes);
        los = findViewById(R.id.bca_sem2_loc_notes);
        ec = findViewById(R.id.bca_sem2_ec_notes);
        sem2 = findViewById(R.id.bca_sem2_toolbar_notes);
        setSupportActionBar(sem2);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}