package com.educonnecteducation.educonnect.SideBarItem;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;

import java.util.Objects;

public class HelpAndSupport extends AppCompatActivity {
    Toolbar toolbar;
    TextView mail1,mail2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_and_support);
        toolbar=findViewById(R.id.toolbar_HelpAndSupport);
        setSupportActionBar(toolbar);
        mail1=findViewById(R.id.textLink1);
        mail2=findViewById(R.id.textLink2);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}