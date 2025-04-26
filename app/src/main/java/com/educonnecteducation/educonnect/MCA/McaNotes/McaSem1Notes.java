package com.educonnecteducation.educonnect.MCA.McaNotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.educonnecteducation.educonnect.R;

public class McaSem1Notes extends AppCompatActivity {
    LinearLayout dropJava,dropPhp,dropAdbms,dropSe,dropDcn;
    Toolbar toobar;
    TextView u1Java,u2Java,u3Java,u4Java,u1Php,u2Php,u3Php,u4Php,u1Db,u2Db,u3Db,u4Db,u1Se,u2Se,u3Se,u4Se,u1Dcn,u2Dcn,u3Dcn,u4Dcn;
    boolean visJava,visPhp,visDb,visSe,visDcn;
    Button java,php,adbms,se,dcn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem1_notes);
        toobar=findViewById(R.id.mca_sem1_toolbar_notes);
        visJava=visPhp=visDb=visDcn=visSe= false;

        u1Java=findViewById(R.id.mca_sem1_notes_java_unit1);
        u2Java=findViewById(R.id.mca_sem1_notes_java_unit2);
        u3Java=findViewById(R.id.mca_sem1_notes_java_unit3);
        u4Java=findViewById(R.id.mca_sem1_notes_java_unit4);
        java=findViewById(R.id.mca_sem1_notes_java);
        dropJava=findViewById(R.id.drop_element_java);
        java.setOnClickListener(v -> {
            if (visJava) {
                dropJava.setVisibility(View.GONE);
                visJava = false;
            } else {
                dropJava.setVisibility(View.VISIBLE);
                visJava = true;
            }
        });
        u1Java.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Iepl36u-hFK2LrurCRryYPcx2LTHuM7o/view?usp=sharing"))));
        u2Java.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1df3gcTOhqtLn2jgIqHXK8BtNM5nIzEw-/view?usp=sharing"))));
        u3Java.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1xR3tI1vSNCaFjMVk6yiFLzmdl9nkhgq-/view?usp=sharing"))));
        u4Java.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1PzICkTJwJJE3YsrV3oqNUulkOcVsL0VS/view?usp=sharing"))));


        u1Php=findViewById(R.id.mca_sem1_notes_php_unit1);
        u2Php=findViewById(R.id.mca_sem1_notes_php_unit2);
        u3Php=findViewById(R.id.mca_sem1_notes_php_unit3);
        u4Php=findViewById(R.id.mca_sem1_notes_php_unit4);
        php=findViewById(R.id.mca_sem1_notes_php);
        dropPhp=findViewById(R.id.drop_element_php);
        php.setOnClickListener(v -> {
            if (visPhp) {
                dropPhp.setVisibility(View.GONE);
                visPhp = false;
            } else {
                dropPhp.setVisibility(View.VISIBLE);
                visPhp = true;
            }
        });
        u1Php.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1koPHjcYk6GgVPVRR58DnsJ6wtdh-tXGa/view?usp=sharing"))));
        u2Php.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/14yhJ_u7AZANVbDlBasoYxgZw2MIh0Ei2/view?usp=sharing"))));
        u3Php.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1aCtKg6-9c-mlqqxvxtgUs1ob8uJVuXhg/view?usp=sharing"))));
        u4Php.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/18srwQcpL5YTAEXYnD-2M_Ej1xRYwYKMo/view?usp=sharing"))));


        adbms=findViewById(R.id.mca_sem1_notes_adbms);
        dropAdbms=findViewById(R.id.drop_element_adbms);
        u1Db=findViewById(R.id.mca_sem1_notes_adbms_unit1);
        u2Db=findViewById(R.id.mca_sem1_notes_adbms_unit2);
        u3Db=findViewById(R.id.mca_sem1_notes_adbms_unit3);
        u4Db=findViewById(R.id.mca_sem1_notes_adbms_unit4);
        adbms.setOnClickListener(v -> {
            if (visDb) {
                dropAdbms.setVisibility(View.GONE);
                visDb = false;
            } else {
                dropAdbms.setVisibility(View.VISIBLE);
                visDb = true;
            }
        });
        u1Db.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1qd7n3jASWrNODh0niAhGgmsE0S8KDZVa/view?usp=sharing"))));
        u2Db.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Q3sPCmh9VyutK4gCm19KV6mJNQ8P7TEv/view?usp=sharing"))));
        u3Db.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1LdnvpnEF_IeRvgmQd_0a-uHSRZMXRioB/view?usp=sharing"))));
        u4Db.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1BCaEwGSKiVrB6CPYwmhpwwIQpLGBXiI6/view?usp=sharing"))));



        se=findViewById(R.id.mca_sem1_notes_se);
        dropSe=findViewById(R.id.drop_element_se);
        u1Se=findViewById(R.id.mca_sem1_notes_se_unit1);
        u2Se=findViewById(R.id.mca_sem1_notes_se_unit2);
        u3Se=findViewById(R.id.mca_sem1_notes_se_unit3);
        u4Se=findViewById(R.id.mca_sem1_notes_se_unit4);
        se.setOnClickListener(v -> {
            if (visSe) {
                dropSe.setVisibility(View.GONE);
                visSe = false;
            } else {
                dropSe.setVisibility(View.VISIBLE);
                visSe = true;
            }
        });
        u1Se.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1DwqynphYau_hKE6o3Ic7U0285LpgAGM8/view?usp=sharing"))));
        u2Se.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1s4qdP7IgHGncw3stcmTcJ83atQfGxJX-/view?usp=sharing"))));
        u3Se.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1DGhRSuJ5hoHuLU5jtkUfrRzc7NOQlw5P/view?usp=sharing"))));
        u4Se.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1pOypKBi_m4AY1H1JtfdPZuIbYMqwCKuf/view?usp=sharing"))));


        dcn=findViewById(R.id.mca_sem1_notes_dcn);
        dropDcn=findViewById(R.id.drop_element_dcn);
        u1Dcn=findViewById(R.id.mca_sem1_notes_dcn_unit1);
        u2Dcn=findViewById(R.id.mca_sem1_notes_dcn_unit2);
        u3Dcn=findViewById(R.id.mca_sem1_notes_dcn_unit3);
        u4Dcn=findViewById(R.id.mca_sem1_notes_dcn_unit4);
        dcn.setOnClickListener(v -> {
            if (visDcn) {
                dropDcn.setVisibility(View.GONE);
                visDcn = false;
            } else {
                dropDcn.setVisibility(View.VISIBLE);
                visDcn = true;
            }
        });
        u1Dcn.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1UTw_IpoXIx3k8LnHybC5lUEwmFylMPPx/view?usp=sharing"))));
        u2Dcn.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1yDlu0NMGsGoudcv6j5_Vr5np-3sardhU/view?usp=sharing"))));
        u3Dcn.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1edHuRknXJzD0SM755m9m5yKgbcCZjiqw/view?usp=sharing"))));
        u4Dcn.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JKiktDgKYmldG6FqxrMxO5KIiDjaPK8D/view?usp=sharing"))));

    }
}