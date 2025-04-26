package com.educonnecteducation.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.educonnecteducation.educonnect.BCA.BcaQPaper.BcaQPaper;
import com.educonnecteducation.educonnect.MCA.McaQPaper.McaQPaper;

import java.util.Objects;

public class QuestionPaper extends AppCompatActivity {
    LinearLayout bca,mca;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper);
        Toolbar question=findViewById(R.id.questionpaper);
        bca=findViewById(R.id.bca_qpaper);
        mca=findViewById(R.id.mca_qpaper);
        setSupportActionBar(question);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        bca.setOnClickListener(v -> {
            Intent intent=new Intent(QuestionPaper.this, BcaQPaper.class);
            startActivity(intent);
        });
        mca.setOnClickListener(v -> {
            Intent intent=new Intent(QuestionPaper.this, McaQPaper.class);
            startActivity(intent);
        });

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}