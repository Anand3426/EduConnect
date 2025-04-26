package com.educonnecteducation.educonnect.BCA.BcaSyllabus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class BcaSem2Syllabus extends AppCompatActivity {
    LinearLayout eng,mar,cplus,sad,nm,dm,los,ec;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem2_syllabus);
        eng=findViewById(R.id.bca_sem2_eng);
        mar=findViewById(R.id.bca_sem2_marathi);
        cplus=findViewById(R.id.bca_sem2_cplus);
        sad=findViewById(R.id.bca_sem2_sad);
        nm=findViewById(R.id.bca_sem2_nm);
        dm=findViewById(R.id.bca_sem2_dm);
        los=findViewById(R.id.bca_sem2_loc);
        ec=findViewById(R.id.bca_sem2_ec);
        toolbar=findViewById(R.id.bca_sem2_toolbar_syllabus);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        eng.setOnClickListener(v -> Toast.makeText(BcaSem2Syllabus.this, "English Syllabus is not Available", Toast.LENGTH_SHORT).show());
        mar.setOnClickListener(v -> Toast.makeText(this, "Marathi/Hindi/Urdu/Gujarati/ Sanskrit/Suppl. English Syllabus is not Available", Toast.LENGTH_SHORT).show());
        cplus.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1BzGCzpl1jiuBE8BLjfsfot3asHGPD9qj/view?usp=sharing"))));
        sad.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1slBw_2HFSRxsYaQHRp19wpQdfGL_efZO/view?usp=sharing"))));
        nm.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1lUQkD_N98VxmG1pr5qaUGChyO-5_cF0x/view?usp=sharing"))));
        dm.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1-HjtP5AByqJywtklIa27kPbYfgHZfvhc/view?usp=sharing"))));
        los.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1W43ZZ_fYBoFd_QMAaDOZPtNoteH1w821/view?usp=sharing"))));
        ec.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/14Bp98T-IUJeq94eB93AxTS5Drd55J0Uk/view?usp=sharing"))));






    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}