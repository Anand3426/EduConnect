package com.educonnecteducation.educonnect.BCA.BcaSyllabus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem1Syllabus extends AppCompatActivity {
    LinearLayout eng,mar,cf,cp,sm,dm,os,oa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem1_syllabus);
        Toolbar toolbar=findViewById(R.id.bca_sem1_toolbar_syllabus);
        eng=findViewById(R.id.bca_sem1_syllabus_eng);
        mar=findViewById(R.id.bca_sem1_marathi);
        cf=findViewById(R.id.bca_sem1_cf);
        cp=findViewById(R.id.bca_sem1_cp);
        sm=findViewById(R.id.bca_sem1_sm);
        dm=findViewById(R.id.bca_sem1_dm);
        os=findViewById(R.id.bca_sem1_os);
        oa=findViewById(R.id.bca_sem1_oa);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        eng.setOnClickListener(v -> Toast.makeText(this, "English Syllabus are not Available", Toast.LENGTH_SHORT).show());
        mar.setOnClickListener(v -> Toast.makeText(this, "Marathi/Hindi/Urdu/Gujarati/Sanskrit/Suppl. English Syllabus are not Available", Toast.LENGTH_SHORT).show());
        cf.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tNjU_S7SIAoLEac4EkhxGFHtFb10bNe1/view?usp=sharing"))));
        cp.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1wFxRc2MQUQBU6r9cn01M09k0mtE45WFI/view?usp=sharing"))));
        sm.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1qbnLB5OqLBFDF4iZSOUM_GeA0JOAmYIm/view?usp=sharing"))));
        dm.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1O5BMkXIjmrjIb35TAN36OAP7dR8oh7V9/view?usp=sharing"))));
        os.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/11wk4kWsWM9i-WacW10dmFHGMk4kwqboX/view?usp=sharing"))));
        oa.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1quRyOWbG9l1XUgq9BLOSuEOghgexanWp/view?usp=sharing"))));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}