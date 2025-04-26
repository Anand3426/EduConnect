package com.educonnecteducation.educonnect.BCA.BcaQPaper;

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

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.Objects;


public class BcaSem1QPaper extends AppCompatActivity {
    LinearLayout summer2023,winter2023,summer2022,winter2022,summer2019,winter2019,summer2018,winter2018;
    TextView subject_name;
    ImageView exit_sheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem1_qpaper);
        Toolbar toolbar=findViewById(R.id.bca_sem1_toolbar_qpaper);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void BottomOnClickBcaSem1(View ve) {
        int subjectid=ve.getId();
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(BcaSem1QPaper.this,R.style.bottomsheetstyle);
        View view= LayoutInflater.from(BcaSem1QPaper.this).inflate(R.layout.bottomsheet_dialog,findViewById(R.id.bottomsheet));
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

        if (subjectid==R.id.bca_sem1_qpaper_eng){
            subject_name.setText(getString(R.string.english));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JIYE1U_BDSFV_NvdgoozJ39wnXzD9Wl-/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_0-0L9l7o9kXtq5B1VCgY0utdcP-9ViJ/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fJ834dU6YtOKNe94KhNeiBFwijHx8Dba/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            summer2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
        }
        else if (subjectid==R.id.bca_sem1_qpaper_marathi){
            subject_name.setText(getString(R.string.marathiaa));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/18wfikpz_lgkViTBtlq2usHQzGEHzMFxk/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1aFFSaWj2hRfD9_RTmHOzTYf-gCL_x5tg/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1aFFSaWj2hRfD9_RTmHOzTYf-gCL_x5tg/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });

            summer2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            summer2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.bca_sem1_qpaper_cf){
            subject_name.setText(getString(R.string.computer_fundamentals));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1oVBhgjMgaSL17ASeSS7avLDp3cOZvxW1/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1t5HOYvXypcDm8aZhP-u3IzrOhazgRflc/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/12G9igRRs-z_0dNROfCo44G6rqgz_0pd1/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JAWMA3PjT5GcBV_zRY79cSQaBBFPBX2x/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });

            winter2022.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.bca_sem1_qpaper_cp){
            subject_name.setText(getString(R.string.c_programming));
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
        else if (subjectid==R.id.bca_sem1_qpaper_sm) {
            subject_name.setText(getString(R.string.statistical_methods));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/10RE0Rwyfn5u9lgsoJfDu4uL3TKHGXYLT/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xC8LLWfnusJgL0-7DVpRiLA-9rxlmZ3e/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1kA3FNordbQYCk5ikm__CQQTreS8pQKNK/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1oal2o1l2qBRHcb5udQ792fdndJlAoaA3/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });

            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());


        }
        else if (subjectid==R.id.bca_sem1_qpaper_dm) {
            subject_name.setText(getString(R.string.discrete_mathematics_i));
            //            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2022.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            summer2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            summer2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2018.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
        }
        else if (subjectid==R.id.bca_sem1_qpaper_os) {
            subject_name.setText(getString(R.string.operating_systems));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1nPz0zpg_9lXtKfIgO8KV97r9rlE5kKCp/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13ECWDOATvxgZ6jq3Q5Tl-hHW4_eq_7m-/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1P26rHpSx67Kw3bhEHFa112V_S003IOQm/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
                bottomSheetDialog.dismiss();
            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/18UmAXruElBQxsvcwrP2OmYZnp1Qbg9AO/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19wvfXdF01qbRWM9GD4WVYxnBo2jF-qtK/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }
        else if (subjectid==R.id.bca_sem1_qpaper_oa) {
            subject_name.setText(getString(R.string.office_automation));
            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1poXI9wAR5So46LKNNgYRv_EdqMGTuEvX/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2022.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1P4v3OGZSy2KLru8uKHaGCeO0DHOw3-O2/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            summer2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1pFgUyxo4ByrzZswqN75SDLXRSWRR6oPW/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
//            winter2019.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/12YJY28Yc7qEKCbikskqDtSBiK-HboavO/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2018.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/12EAj9HKBCfEvTt_UjM5VIBmualj3j2HD/view?usp=sharing")));
                bottomSheetDialog.dismiss();
            });
            winter2019.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            }


    }
}