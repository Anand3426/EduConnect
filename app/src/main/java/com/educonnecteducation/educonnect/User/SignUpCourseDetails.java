package com.educonnecteducation.educonnect.User;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.educonnecteducation.educonnect.MainActivity;
import com.educonnecteducation.educonnect.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Objects;

public class SignUpCourseDetails extends AppCompatActivity {
    String SelectedCourseField,SelectedCollegeName,SelectedCourseType,SelectedCourseStream,SelectedCourseYear;
    Spinner SpiCollegeName,SpiCourseType,SpiCourseField,SpiCourseStream,SpiCourseYear;
    Button submit_userInfo;
    Toolbar toolbar;
    ImageView image;

    ArrayAdapter<CharSequence> adapterCollegeName,adapterCourseType,adapterCourseField,adapterCourseStream,adapterCourseYear;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_course_details);
        SpiCollegeName=findViewById(R.id.spinner_college_name);
        SpiCourseType=findViewById(R.id.spinner_CourseType);
        SpiCourseField=findViewById(R.id._spinner_field);
        SpiCourseStream=findViewById(R.id.spinner_stream_specialization);
        SpiCourseYear=findViewById(R.id._spinner_course_year);
        submit_userInfo =findViewById(R.id.submit_userInfo);
        toolbar=findViewById(R.id.toolbar_signup_user_academics);
        image=findViewById(R.id.academic_details_photo);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Application%20Photo%2Faaddccbb-modified.png?alt=media&token=0f710eb4-9b71-42c9-bf66-650f3267f55c")
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(image);



        adapterCollegeName=ArrayAdapter.createFromResource(this,R.array.college_name,R.layout.spinner_layout);
        adapterCollegeName.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        SpiCollegeName.setAdapter(adapterCollegeName);
        SpiCollegeName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SelectedCollegeName=SpiCollegeName.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        adapterCourseType=ArrayAdapter.createFromResource(this,R.array.course_type,R.layout.spinner_layout);
        adapterCourseType.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        SpiCourseType.setAdapter(adapterCourseType);
        SpiCourseType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SelectedCourseType=SpiCourseType.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        adapterCourseStream=ArrayAdapter.createFromResource(this,R.array.course_stream,R.layout.spinner_layout);
        adapterCourseStream.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        SpiCourseStream.setAdapter(adapterCourseStream);
        SpiCourseStream.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SelectedCourseStream=SpiCourseStream.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        adapterCourseField=ArrayAdapter.createFromResource(this,R.array.course_field,R.layout.spinner_layout);
        adapterCourseField.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        SpiCourseField.setAdapter(adapterCourseField);

        SpiCourseField.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SelectedCourseField=SpiCourseField.getSelectedItem().toString();

                int parentID=parent.getId();
                if (parentID == R.id._spinner_field){
                    switch(SelectedCourseField){
                        case "Choose your Field":adapterCourseYear=ArrayAdapter.createFromResource(parent.getContext(),
                                R.array.default_select_year,R.layout.spinner_layout);
                            break;
                        case"BCA(Bachelor of Computer Application)":adapterCourseYear=ArrayAdapter.createFromResource(parent.getContext(),
                                R.array.bca_course_year,R.layout.spinner_layout);
                            break;
                        case"MCA(Master of Computer Application)":adapterCourseYear=ArrayAdapter.createFromResource(parent.getContext(),
                                R.array.mca_course_year,R.layout.spinner_layout);
                            break;
                        default:break;

                    }
                    adapterCourseYear.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
                    SpiCourseYear.setAdapter(adapterCourseYear);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        SpiCourseYear.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SelectedCourseYear=SpiCourseYear.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        submit_userInfo.setOnClickListener(v -> {
            if (SelectedCollegeName.equals("Choose Your College")){
                Toast.makeText(this, "Please choose the College Name From the College list", Toast.LENGTH_LONG).show();
            }
            else if (SelectedCourseType.equals("Choose your Course")) {
                Toast.makeText(this, "Please choose the Course from the Course list", Toast.LENGTH_LONG).show();
            }
            else if (SelectedCourseField.equals("Choose your Field")) {
                Toast.makeText(this, "Please choose the Field from the Field list", Toast.LENGTH_LONG).show();
            }
            else if (SelectedCourseStream.equals("Choose your Stream Specialization")) {
                Toast.makeText(this, "Please choose the Specialization from the Stream list", Toast.LENGTH_LONG).show();
            }
            else if (SelectedCourseYear.equals("Choose your MCA Course Year")) {
                Toast.makeText(this, "Please choose the MCA year from the MCA Year list", Toast.LENGTH_LONG).show();
            }
            else if (SelectedCourseYear.equals("Choose your BCA Course Year")) {
                Toast.makeText(this, "Please choose the BCA year from the BCA Year list", Toast.LENGTH_LONG).show();
            }
            else {
                GoogleSignInAccount account1= GoogleSignIn.getLastSignedInAccount(getApplication());
                assert account1 != null;
                HashMap<String,Object> hashMap=new HashMap<>();
                hashMap.put("Stud_CollegeName",SelectedCollegeName);
                hashMap.put("Stud_CourseType",SelectedCourseType);
                hashMap.put("Stud_CourseField",SelectedCourseField);
                hashMap.put("Stud_CourseStream",SelectedCourseStream);
                hashMap.put("Stud_CourseYear",SelectedCourseYear);
                FirebaseDatabase.getInstance().getReference().child("users").child(Objects.requireNonNull(account1.getId())).updateChildren(hashMap);
                Toast.makeText(this, "Data Submitted Successfully", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SignUpCourseDetails.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);


            }

        });





    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;


    }
}