package com.educonnecteducation.educonnect.MCA.McaQPaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.educonnecteducation.educonnect.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.Objects;

public class McaSem2QPaper extends AppCompatActivity {
    LinearLayout summer2023,winter2023,summer2022,winter2022,summer2019,winter2019,summer2018,winter2018;
    ImageView exitbutton;
    TextView sub;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem2_qpaper);
        toolbar= findViewById(R.id.mca_sem2_toolbar_qpaper);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    public void BottomOnclickMcaSem2(View ve) {
        int subjectid=ve.getId();
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(McaSem2QPaper.this,R.style.bottomsheetstyle);
        View view= LayoutInflater.from(McaSem2QPaper.this).inflate(R.layout.bottomsheet_dialog, findViewById(R.id.bottomsheet));
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
        winter2023.setVisibility(View.GONE);

        exitbutton.setOnClickListener(v -> bottomSheetDialog.dismiss());
        if(subjectid==R.id.mca_sem2_qpaper_ca){
            sub.setText(getString(R.string.c_and_asp_net));
            winter2022.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13iHLdsz8aJ2YqjGTScvtlCKJ10pxILT7/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13lj46DCRY481oEOTFVXuHGX8InLFhxmw/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

        } else if (subjectid==R.id.mca_sem2_qpaper_cc) {
            sub.setText(getString(R.string.cloud_computing));
            winter2022.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13qezfVssBzf7cI8fTH2QbM-F291KvsPi/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13X8ieSigsImCxVjMO3PtdhhMASsQx2-H/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

        }else if (subjectid==R.id.mca_sem2_qpaper_cg) {
            sub.setText(getString(R.string.computer_graphics));
//            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            winter2022.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13rd2EPQMrpQcxQKDstGFzOBkJsENuLdx/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });


        }else if (subjectid==R.id.mca_sem2_qpaper_cao) {
            sub.setText(getString(R.string.computer_architecture_and_organization));
            winter2022.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13VpkbpFBbKRG-NCwIdQBRAbgWs5QnRFk/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13VsXvIGFJNacseMNA5uRejneIHWGBKhG/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

        }else if (subjectid==R.id.mca_sem2_qpaper_or) {
            sub.setText(getString(R.string.operation_research));
            winter2022.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13v8YnRvd-LJ_HcyVdxIwMp8D8tJft6eq/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13yg6zed5LrDBjM0xipWX1i90C3unDrKt/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

        }
        else if (subjectid==R.id.mca_sem2_qpaper_ap) {
            sub.setText(getString(R.string.android_programming));
            winter2022.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13OJpGu9-2UcVYFHZSUwK2ouoFLQxLF_K/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13RRMVUdZD6gTj3ZVkioKdmWaIlNmhECd/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

        }else if (subjectid==R.id.mca_sem2_qpaper_cf) {
            sub.setText(getString(R.string.cyber_forensics));
            winter2022.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13bTa4tAuc5ElNc2Mdi6mgzEKVYsOErPq/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/13f1J5eObpBM0nN65t5Qc_uIFMJ-yuu36/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

        }

    }
}