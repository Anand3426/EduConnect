package com.educonnecteducation.educonnect.BCA.BcaNotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.educonnecteducation.educonnect.R;
import java.util.Objects;

public class BcaSem6Notes extends AppCompatActivity {
    LinearLayout cg,java,asp,st,php,dcn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem6_notes);
       Toolbar sem6=findViewById(R.id.bca_sem6_toolbar_notes);
        cg=findViewById(R.id.bca_sem6_cg_notes);
        java=findViewById(R.id.bca_sem6_java_notes);
        asp=findViewById(R.id.bca_sem6_asp_notes);
        st=findViewById(R.id.bca_sem6_st_notes);
        php=findViewById(R.id.bca_sem6_php_notes);
        dcn=findViewById(R.id.bca_sem6_dcn_notes);
        setSupportActionBar(sem6);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}