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

public class BcaSem4QPaper extends AppCompatActivity {
    LinearLayout summer2023,winter2023,summer2022,winter2022,summer2019,winter2019,summer2018,winter2018;
    TextView subject_name;
    ImageView exit_sheet;
    Toolbar sem4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem4_qpaper);
        sem4=findViewById(R.id.bca_sem4_toolbar_qpaper);
        setSupportActionBar(sem4);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void BottomOnClickBcaSem4(View ve) {
        int subjectid=ve.getId();
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(BcaSem4QPaper.this,R.style.bottomsheetstyle);
        View view= LayoutInflater.from(BcaSem4QPaper.this).inflate(R.layout.bottomsheet_dialog,findViewById(R.id.bottomsheet));
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

        if (subjectid==R.id.bca_sem4_se_qpaper){
            subject_name.setText(getString(R.string.software_engineering_i));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_vfTBH_Pd1O9umXLf-vmumyRQhhZAEcE/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NnPYDiks3WWcukqOe-iUJpxv3ypCuvVC/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tfNg4eIkxokMxe_9Kd2QXrQrUwJSxR3v/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1mxRkxPUkLbBSOGL0XUpnra6JmD2rvNDF/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1jyCK74XPlh27LV2HtAGo4zbOCk5k-4ji/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
        }
        else if (subjectid==R.id.bca_sem4_sql_qpaper){
            subject_name.setText(getString(R.string.sql_and_pl_sql));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NzIGTS27enyU6XPnGY3j5aO060onFc5f/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1aUyBV4muNUGNgzTCnJD_BPzln3xpZSni/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1HjYu1e4o-1Sg21vpGNVD9sJA-DmmEnBc/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1f1BiaHl9xsdyw8Ds4ImyKIMLuyZ54j5F/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1L2ZKqD5RjGRewbpbvSBnDgmaZDnjlHYR/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.bca_sem4_toc_qpaper) {
            subject_name.setText(getString(R.string.theory_of_computation));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17LkYIAszR-keG3o5B2w6HJkGJebd1RHt/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/16BF78ckGZz0S_OgOryc3PUpVOINIWenP/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Bs5Dw6F8oHPbwo23g8BuDHWGiX1CYbT0/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1HwkrOXHmGWmQZKpqQ99lTZdXNf8efjQR/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qCc95oSlEL5eeFEuA7KMV3RrgICCNzmq/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.bca_sem4_or_qpaper) {
            subject_name.setText(getString(R.string.operations_research_ii));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zztuI6yXWdFGV5FKHbBMGJEnQIFiJW8l/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Gdmzn7703k-b-o2E3ji_zBSmEsBNnrtL/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/11u7g2yuizq9c4bLePWgaMpbLDtAgzgd8/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1S4tne3A1WEXRze4Hb33qEvHsIRl8DpRv/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1X4qPU6KDOU6YaETV1WHqMXmlghT4HJR5/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }
        else if (subjectid==R.id.bca_sem4_wt_qpaper) {
            subject_name.setText(getString(R.string.web_technology_ii));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1v-wz9Z9bi_Mr6LWM_RDiY_5pfvaksMOx/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1O-0y5_EU6DJlnUYP2IdyPMxOzYqEdw4J/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_pk2IYwhpc2Ssz6jgMyaR7blTvosudnZ/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1j9K9kh_6RTY-2FC3qolhDJLtjc0PZ8-7/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LMZSVwzVjgpnhZJry7PBgXLyiIYk0PMn/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }
        else if (subjectid==R.id.bca_sem4_de_qpaper) {
            subject_name.setText(getString(R.string.digital_electronics_ii));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1bCmqmMbvEBG_8JPyFY4YiAcV9mOKRh9D/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1bHUs0ua1f9Zy_dfK5XhLo_m3lroCXeWK/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1E106-4ARKlyO8pnBgbj6nyu8t63Sstas/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1f76OpAwAxZcApWfY2-napXY0zIbRZXu4/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_BFGdYX8x1AvsbOmClE0httuRVQTYhaD/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }


    }
}