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

public class BcaSem5QPaper extends AppCompatActivity {
    LinearLayout summer2023,winter2023,summer2022,winter2022,summer2019,winter2019,summer2018,winter2018;
    TextView subject_name;
    ImageView exit_sheet;
    Toolbar sem5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem5_qpaper);
        sem5=findViewById(R.id.bca_sem5_toolbar_qpaper);
        setSupportActionBar(sem5);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    public void BottomOnClickBcaSem5(View ve) {
        int subjectid=ve.getId();
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(BcaSem5QPaper.this,R.style.bottomsheetstyle);
        View view= LayoutInflater.from(BcaSem5QPaper.this).inflate(R.layout.bottomsheet_dialog,findViewById(R.id.bottomsheet));
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

        if (subjectid==R.id.bca_sem5_cg_qpaper){
            subject_name.setText(getString(R.string.computer_graphics_i));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fnWFHutIjfbZHD2n5HY60jOVHNQK8PLb/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1hGDPiYMzbyjFBmV7zvyNCrS_bHQ_4_tH/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_RH2IYGlEyEoTzkgvfWizj8XuysRMCC3/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ep-nPQjUkJvvFO2z68eZjDLpqa6lk5MC/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1YFXX2ksfQcGWpSrZ6xCzoy4SryBeQ1jU/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.bca_sem5_cc_qpaper){
            subject_name.setText(getString(R.string.compiler_construction));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1I8NukZ4Cya7y_8npN6PFR9X1RemSKRuN/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Oefqx4VjtmgF-c0S2vNpbdk2ELRr3Unm/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1U5qEc5DmERmAOBhnVRhxFyrvD_zXTeJQ/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VY96gtQNFltppSC16wxLGSvEuR4XeAxQ/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/10e0agd1hCqT0XrHfaw2UuGvlfbPjm3hR/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
        }
        else if (subjectid==R.id.bca_sem5_vb_qpaper) {
            subject_name.setText(getString(R.string.vb_net));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/18hd45Iudo2sPo-jBte6rFemG4EKE5uO3/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1x0lRLLt5dBqWJjxB3LlZtWHEfFR3OMGY/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1UhEOeTz5xhYRSE_UNJRAdcm-7DoP7vUe/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_3cjjvhvjo7dYGZd4pFrM3ehZI0cvQm3/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WS4eCgfYRKFnnCvD14eLvmnEnlHm3_2F/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
        }
        else if (subjectid==R.id.bca_sem5_se_qpaper) {
            subject_name.setText(getString(R.string.software_engineering_ii));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1nURsWQLyubMqIElw-amuKasZzhVctEUu/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1axzizIPm_SZftMGYy0iSs4_N1eFHaHUT/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_GykG2r9svsMtFB47sxKMN6Ypj4bzak7/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tWZcHtJKRzHV-5fatl7xQbsLAUFZZyVs/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/10ummvv-3RnmQlVp3rhLfvjs7dm9dvWGc/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }
        else if (subjectid==R.id.bca_sem5_php_qpaper) {
            subject_name.setText(getString(R.string.php_i));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1suYUZQ5oEq_ihO5sJquyeZe6u3lyZIdH/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1XrcngCNBqQ8xjC1Gy8VWQgkxypLH2Kva/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1gD433nOSBt95AZ5J127FT_64YJc-bMg0/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1T0ZKe53M4IgkWKzrLmVKP9y-DnSUUB0u/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1W-ly4SeXjSUol-L2A74jl-h50xJQ6aO4/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }
        else if (subjectid==R.id.bca_sem5_dcn_qpaper) {
            subject_name.setText(getString(R.string.data_communication_and_network_i));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WzsiMb-9P8smSstzOAiabS9sxqNi6nRM/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/16xwRUeyBa90Gx8B8Fwscfu7kvXyjy7Xz/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/14pi8wrLAzyOPTZ7Mu60YX9e66JFmPKYE/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17Wkp0cgLfVH9mvlczXJO_8H_wOTlN24q/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1USRG89VOvcsbgX_3YNKfDXFyf1BVmkCA/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }


    }
}