package com.educonnecteducation.educonnect.BCA.BcaQPaper;

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

public class BcaSem3QPaper extends AppCompatActivity {
    LinearLayout summer2023,winter2023,summer2022,winter2022,summer2019,winter2019,summer2018,winter2018;
    TextView subject_name;
    ImageView exit_sheet;
    Toolbar sem3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem3_qpaper);
        sem3=findViewById(R.id.bca_sem3_toolbar_qpaper);
        setSupportActionBar(sem3);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void BottomOnClickBcaSem3(View ve) {
        int subjectid=ve.getId();
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(BcaSem3QPaper.this,R.style.bottomsheetstyle);
        View view= LayoutInflater.from(BcaSem3QPaper.this).inflate(R.layout.bottomsheet_dialog,findViewById(R.id.bottomsheet));
        bottomSheetDialog.setContentView(view,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        bottomSheetDialog.show();

        summer2023=bottomSheetDialog.findViewById(R.id.summer2023);
        winter2023=bottomSheetDialog.findViewById(R.id.winter2023);
        summer2022=bottomSheetDialog.findViewById(R.id.summer2022);
        winter2022=bottomSheetDialog.findViewById(R.id.winter2022);
        summer2019=bottomSheetDialog.findViewById(R.id.summer2019);
        winter2019=bottomSheetDialog.findViewById(R.id.winter2019);
        summer2018=bottomSheetDialog.findViewById(R.id.summer2018);
        winter2018=bottomSheetDialog.findViewById(R.id.winter2018);
        subject_name=bottomSheetDialog.findViewById(R.id.subject_name);
        exit_sheet=bottomSheetDialog.findViewById(R.id.exitbottomsheet);

        winter2023.setVisibility(View.GONE);
        summer2022.setVisibility(View.GONE);


        exit_sheet.setOnClickListener(v -> bottomSheetDialog.dismiss());

        if (subjectid==R.id.bca_sem3_vbp_qpaper){
            subject_name.setText(getString(R.string.visual_basic_programming));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KJiiEU5kWNM9SsTZZCa9TZPMNPmBGdKM/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13Xx21J9Pf7bmv8TzsRyrjAARCGCLMpd7/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13Xn2RGF0iOX3jgKFoHpncOOZsZPklOqA/view?usp=sharing  ")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/130FM232Pnm-VLtklfgMOcjGfJzxDe5f1/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VrJPMAvSR6dfdvVxlLNXe0SjTFkMyEYl/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.bca_sem3_dbms_qpaper){
            subject_name.setText(getString(R.string.data_base_management_system));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1PlbJRpQ1vejNXEOqI31VyU0P2YW58Iwf/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1iAC2D1a8lcA5MM1m_rdw10KPC3PxwU4B/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1sCZKVtUXiJ2rFh-qaoCV3xol4Gs0SSNf/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1f6DaQrzM_PPTTEXFUKp3GY0ylterLv0y/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.bca_sem3_ds_qpaper) {
            subject_name.setText(getString(R.string.data_structures));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1nxK6CeDQ7UvQ6Ze2TvFXnGtWtiK5RG50/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1mCFARob6qKXfC8TP4XYt10DacoyX-8MQ/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1adW88v2mEJCAVGUzjZJCLt7RX1oYxcU2/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1gM6OHV53DtMkTzpcE9-zqFn7eVGbjFHJ/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rVKZ6_CrkJiwq4WU0bfyalaJXcHXoLEA/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());


        }
        else if (subjectid==R.id.bca_sem3_or_qpaper) {
            subject_name.setText(getString(R.string.operations_research_i));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1x8zcLopxI9rR4xQMsSqyMzWYuVrrI5E_/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tdNF3jvBcH3Yoe8CVq9x9cFkCOJDqvei/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1E5G-ELRebjzRbsTaMsA5p2HCHOa26Jgn/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rhzJV3VljM92hHs88bsNmve9QWZGFToa/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19HBhhgjIHEe00nrKDKT5fxte_YzYr8mm/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }
        else if (subjectid==R.id.bca_sem3_wt_qpaper) {
            subject_name.setText(getString(R.string.web_technology_i));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/15aq-sOA8QT78jjUoNnWuD_wFjgTY3uyW/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1F3gG7Hpt0C9KnnUt7EneyNIx3N28hmGf/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yClg6t6FDxIXUN_b-7bu_0Om2cpUbRvq/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1V7OSw02utrrZdb-gnoI0Vzc5FifSTcWb/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }
        else if (subjectid==R.id.bca_sem3_de_qpaper) {
            subject_name.setText(getString(R.string.digital_electronics_i));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13o1wG2PU6S__hB9RoC-WKaNqhXs5eRk8/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fZy5jBBz0266tfmbn0Bbjx1c4OmLAzeG/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1BYl2cBGP2dn-llmig3Y7DbsJVXIadAsC/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1gGlOvEsYdw8ItoC2RjHUTOpZQqcLq9Ly/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            summer2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }


    }
}