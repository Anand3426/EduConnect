package com.educonnecteducation.educonnect.CollegeInfo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class AboutFaculty extends AppCompatActivity {
    ImageView hod,mcaT1,mcaT2,mcaT3,mcaT4,mcaT5,bcaT1,bcaT2,bcaT3,bcaT4,bcaT5;
    Toolbar toolbar;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_faculty);
        hod=findViewById(R.id.hod_dp);
        mcaT1=findViewById(R.id.mca_t1);
        mcaT2=findViewById(R.id.mca_t2);
        mcaT3=findViewById(R.id.mca_t3);
        mcaT4=findViewById(R.id.mca_t4);
        mcaT5=findViewById(R.id.mca_t5);
        bcaT1=findViewById(R.id.bca_t1);
        bcaT2=findViewById(R.id.bca_t2);
        bcaT3=findViewById(R.id.bca_t3);
        bcaT4=findViewById(R.id.bca_t4);
        bcaT5=findViewById(R.id.bca_t5);
        toolbar=findViewById(R.id.faculty_details_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // HOD photo
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2FDr%20Anup%20Bhange%20sir.png?alt=media&token=e50bdaf9-c2b4-49df-aaf4-270bbe9cd689")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // Cache the image for offline access
                .into(hod);
        //MCA Teacher Photo
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fmca%20dept%2Fminal_mam.png?alt=media&token=d7871dcd-bf0f-46c5-9a50-bdf6ff1a78e0")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // Cache the image for offline access
                .into(mcaT1);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fmca%20dept%2Faarti_mam-removebg-preview.png?alt=media&token=3f49a471-a222-48a3-9ace-35574111dbd9")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // Cache the image for offline access
                .into(mcaT2);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fmca%20dept%2Fdarshan_sir-removebg-preview.png?alt=media&token=cae4fc7d-31a3-4387-a41f-7ba5da528f54")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // Cache the image for offline access
                .into(mcaT3);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fmca%20dept%2Fneha_mam-removebg-preview.png?alt=media&token=1c8ecd67-e149-47eb-91bb-e6d802fd9c3f")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // Cache the image for offline access
                .into(mcaT4);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fmca%20dept%2FAshwini%20Mam.png?alt=media&token=b4e1fc83-31f1-4dd4-824e-a0a0e1969e71")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // Cache the image for offline access
                .into(mcaT5);

        //BCA Teacher Photo
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fbca%20dept%2FbcaT1_photo%20(1).jpg?alt=media&token=f16a969e-be0e-4d80-b438-95cb53b8a1dc")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(bcaT1);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fbca%20dept%2FbcaT2_photo%20(1).jpg?alt=media&token=92e8bd1a-56e7-4939-a837-0cbcc95bd71b")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(bcaT2);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fbca%20dept%2FbcaT3_photo%20(1).jpg?alt=media&token=0faf329a-7390-40a8-8afd-d92440e89e04")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(bcaT3);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fbca%20dept%2FbcaT4_photo%20(1).jpg?alt=media&token=20b1cafc-6063-4c59-aaeb-72e019b72c39")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(bcaT4);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Faculty%20Photo%2Fbca%20dept%2FbcaT5_photo%20(1).jpg?alt=media&token=a83116fc-8ecd-4a44-9f88-5bd5268b3eef")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(bcaT5);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}