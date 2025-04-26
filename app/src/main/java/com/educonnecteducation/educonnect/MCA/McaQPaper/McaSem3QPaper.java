package com.educonnecteducation.educonnect.MCA.McaQPaper;

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

public class McaSem3QPaper extends AppCompatActivity {
    LinearLayout summer2023,winter2023,summer2022,winter2022,summer2019,winter2019,summer2018,winter2018;
    ImageView exitbutton;
    TextView sub;

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem3_qpaper);
        toolbar=findViewById(R.id.mca_sem3_toolbar_qpaper);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    public void BottomOnclickMcaSem3(View ve) {
        int subjectid=ve.getId();
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(McaSem3QPaper.this,R.style.bottomsheetstyle);
        View view= LayoutInflater.from(McaSem3QPaper.this).inflate(R.layout.bottomsheet_dialog, findViewById(R.id.bottomsheet));
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
        if(subjectid==R.id.mca_sem3_qpaper_bda){
            sub.setText(getString(R.string.big_data_analytics));
//            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        } else if (subjectid==R.id.mca_sem3_qpaper_dm) {
            sub.setText(getString(R.string.data_mining));
//            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());


        }else if (subjectid==R.id.mca_sem3_qpaper_pp) {
            sub.setText(getString(R.string.python_programming));
//            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }else if (subjectid==R.id.mca_sem3_qpaper_ai) {
            sub.setText(getString(R.string.artificial_intelligence));
//            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }else if (subjectid==R.id.mca_sem3_qpaper_ml) {
            sub.setText(getString(R.string.machine_learning));
//            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }
        else if (subjectid==R.id.mca_sem3_qpaper_mc) {
            sub.setText(getString(R.string.mobile_computing));
//            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());

        }else if (subjectid==R.id.mca_sem3_qpaper_sc) {
            sub.setText(getString(R.string.soft_computing));
//            winter2023.setOnClickListener(v ->{ startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
//            summer2023.setOnClickListener(v -> {startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("")));
//                bottomSheetDialog.dismiss();
//            });
            summer2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
            winter2023.setOnClickListener(v -> Toast.makeText(this, "Question Paper is Comming Soon..", Toast.LENGTH_SHORT).show());
        }

    }
}