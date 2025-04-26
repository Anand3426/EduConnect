package com.educonnecteducation.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.Objects;

public class UniversityResult extends AppCompatActivity {
    LinearLayout rtm,gondwana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_result);
       Toolbar toolbar=findViewById(R.id.university_result);
       rtm=findViewById(R.id.rtmnuresult);
       gondwana=findViewById(R.id.gondwanaresult);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        rtm.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://rtmnuresults.org/"))));
        gondwana.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://gug.digitaluniversity.ac/results"))));

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}