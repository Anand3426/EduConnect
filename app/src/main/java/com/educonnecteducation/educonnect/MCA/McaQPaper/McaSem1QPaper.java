package com.educonnecteducation.educonnect.MCA.McaQPaper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.Objects;

public class McaSem1QPaper extends AppCompatActivity {
    BottomSheetDialog bottomSheetDialog;
    Toolbar toolbar;
    LinearLayout summer2023,winter2023,summer2022,winter2022,summer2019,winter2019,summer2018,winter2018;
    ImageView exitbutton;
    TextView sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem1_qpaper);
        toolbar=findViewById(R.id.mca_sem1_toolbar_qpaper);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    public void BottomOnclick(View ve) {
        int subjectid=ve.getId();
        bottomSheetDialog=new BottomSheetDialog(McaSem1QPaper.this,R.style.bottomsheetstyle);
        View view= LayoutInflater.from(McaSem1QPaper.this).inflate(R.layout.bottomsheet_dialog, findViewById(R.id.bottomsheet));
        bottomSheetDialog.setContentView(view,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        bottomSheetDialog.show();

        winter2023=bottomSheetDialog.findViewById(R.id.winter2023);
        summer2023=bottomSheetDialog.findViewById(R.id.summer2023);
        summer2018=bottomSheetDialog.findViewById(R.id.summer2018);
        winter2018=bottomSheetDialog.findViewById(R.id.winter2018);
        summer2019=bottomSheetDialog.findViewById(R.id.summer2019);
        winter2019=bottomSheetDialog.findViewById(R.id.winter2019);
        summer2022=bottomSheetDialog.findViewById(R.id.summer2022);
        winter2022=bottomSheetDialog.findViewById(R.id.winter2022);
        exitbutton= bottomSheetDialog.findViewById(R.id.exitbottomsheet);
        sub=bottomSheetDialog.findViewById(R.id.subject_name);

        summer2018.setVisibility(View.GONE);
        winter2018.setVisibility(View.GONE);
        summer2019.setVisibility(View.GONE);
        winter2019.setVisibility(View.GONE);
        summer2022.setVisibility(View.GONE);
        winter2022.setVisibility(View.GONE);

        exitbutton.setOnClickListener(v -> bottomSheetDialog.dismiss());
        if(subjectid==R.id.mca_sem1_qpaper_java){
            sub.setText(getString(R.string.java));
            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/16PoWZmCqm-dD7mGan-c-WAN3LbHU3G4K/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/115lItcLQwKkm-nHikrQspQLcfJSH3myP/view?usp=sharing")));
            bottomSheetDialog.dismiss();
            });

        } else if (subjectid==R.id.mca_sem1_qpaper_php) {
            sub.setText(getString(R.string.open_source_web_programming_using_php));
            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1S6fzYQIte_ziuIPmz1wcAgzmWm7dH9m_/view?usp=sharing")));
            bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/11AEsiq9slx81q6mYVLOA7wnDhxNcXjhJ/view?usp=sharing")));
            bottomSheetDialog.dismiss();
            });

        }else if (subjectid==R.id.mca_sem1_qpaper_dcn) {
            sub.setText(getString(R.string.dcn));
            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1fGyfxzRxBpCg70fqRDcg7Os01ywy57VI/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/117nuJOLDLR1HvY4o1CzxHH-ZxeBwJiJz/view?usp=sharing")));
            bottomSheetDialog.dismiss();
            });

        }else if (subjectid==R.id.mca_sem1_qpaper_adbms) {
            sub.setText(getString(R.string.advance_dbms_administration));
            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1nnNy1-4K220VbS9hy8lRLC6dZMS2YfeG/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/117_2dXWf5WGU6c3ujgDxx-BZLtciS1s_/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

        }else if (subjectid==R.id.mca_sem1_qpaper_se) {
            sub.setText(getString(R.string.software_engineering));
            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Heb29arwOH7JoW7bbPjAgYBmjQgUb3C7/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/11AfWcWlVP4rq_qbvtmA3s_v7dpxkUZ0H/view?usp=sharing")));
            bottomSheetDialog.dismiss();
            });

        }
    }


}