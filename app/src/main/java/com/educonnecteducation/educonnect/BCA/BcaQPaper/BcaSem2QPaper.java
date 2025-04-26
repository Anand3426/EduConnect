package com.educonnecteducation.educonnect.BCA.BcaQPaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
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

public class BcaSem2QPaper extends AppCompatActivity {
    Toolbar toolbar;
    LinearLayout summer2023,winter2023,summer2022,winter2022,summer2019,winter2019,summer2018,winter2018;
    TextView subject_name;
    ImageView exit_sheet;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem2_qpaper);
        toolbar=findViewById(R.id.bca_sem2_toolbar_qpaper);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void BottomOnClickBcaSem2(View ve) {
        int subjectid=ve.getId();
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(BcaSem2QPaper.this,R.style.bottomsheetstyle);
        View view= LayoutInflater.from(BcaSem2QPaper.this).inflate(R.layout.bottomsheet_dialog,findViewById(R.id.bottomsheet));
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

        if (subjectid==R.id.bca_sem2_eng_qpaper){
            subject_name.setText(getString(R.string.english));
//            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1UQCEbIybDxRfpkf2Ra-WYD1MWc2BUK0d/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Ha0kwKDC1WylmECJc-veSXsh8AmpckJA/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-kfPWlDW8Km6FrHaztuo8FucddmMVaZk/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            summer2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
        }
        else if (subjectid==R.id.bca_sem2_marathi_qpaper){
            subject_name.setText(getString(R.string.marathiaa));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zkzzlZfa6QbPJN8ILPRtn-BdZ5l_RrcY/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1v4875vdtJ_gGxqj_J-_R5c5oWb_BNTu3/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xjDijOkc9XVb9SqOkrcMedCmFj0EaB5C/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1UMIm7LsSTB0Pa7u2bsAXA9t3gRhA20Hm/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            summer2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.bca_sem2_cplus_qpaper){
            subject_name.setText(getString(R.string.programming_in_c));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Sk9ybzqHv3i9GE6Uwm57Ucybo3Idzj4J/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1HeSoztujWfIA5hhPq_yiH-eYEGx8PgU_/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1b9AVV_sWfz_mHn0RuGRQCZpoBkc36hjX/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FvNyXOOEV3Yfh1PxZLJ-QxKntfqdYbYz/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            summer2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.bca_sem2_sad_qpaper){
            subject_name.setText(getString(R.string.system_analysis_and_design));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1oDt8p9riT22HSCrKOkx_p5K9a587cMS9/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NbdlhNCDjyJyBXZW5M97qcL9k8GXCn64/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1165im1ujC_vPpAqhr5a3qkhTgigZTiYt/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vPOWFUC-oFD2CHFbGPUb2_BVpeMW9mGN/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tL-UFlVCza91e2sBX7DWoHbd0HbVYV6C/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1D9KfTRTbAOSgs7BH6X9wZIr-ZJvfjUxQ/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

        }
        else if (subjectid==R.id.bca_sem2_nm_qpaper) {
            subject_name.setText(getString(R.string.numerical_methods));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/18VGdDVFldTvnK4DyO5AnqDAErNR-NfBN/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_EqED86D6LHeW2kLuL4ECsJfQmPXr992/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tE41D7Fi0u8Y02unXmCumpvvk-oiAeLn/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Q3RXycFG2YyDQ_hrUMZPYEnPKEMzIGWO/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vXIwG8LFbevP7kmSKgeIabz0BKOFqBp9/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());


        }
        else if (subjectid==R.id.bca_sem2_dm_qpaper) {
            subject_name.setText(getString(R.string.discrete_mathematics_ii));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1naT44AuzUaFcTfC3SuoDcmKNG9uHOZ5-/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/16inK_RpUYr6wzXhkv0PEwt904m7n0Zk7/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1isgO-e_C5S-U_kgA0_2rculwl7SsSCcf/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tJ89-Q4DLvgH6nLQvAzVVCIdT5D83K1U/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/176Nsv3DK8aMQMlsUJZy_J8EMqhZvTxgs/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
        }
        else if (subjectid==R.id.bca_sem2_loc_qpaper) {
            subject_name.setText(getString(R.string.linux_operating_system));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/10gex3kQoypPz-vh5U0WsXvz-Ko3Qm5SP/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qC8RGkvZQb54mo2iK5dWP_GZpyBJsx1F/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yE_3j46K_n2oF9pd-ZoRxyKRi44SoZpS/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19s-SwOm-qahmbBgDM4-n3obahg9JNDJu/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });

            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
        }
        else if (subjectid==R.id.bca_sem2_ec_qpaper) {
            subject_name.setText(getString(R.string.e_commerce));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/14mDHdIC9k0YqRS3wwz9acDgmCrSjWeZG/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1QXR2ICqA4eQ5JsoA041nNC8s4uhmmHgn/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1S4EE-AM0KmVfRSxLn0vUoh0Nka3d0glu/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19a3K8jkym2LJoyGP7PFbflB3PbRjkRye/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ld-BGxY4T5FOmqcek3PdQjd6CDPhisXa/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }


    }
}