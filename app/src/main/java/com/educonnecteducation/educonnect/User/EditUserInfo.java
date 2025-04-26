package com.educonnecteducation.educonnect.User;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.educonnecteducation.educonnect.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Objects;

public class EditUserInfo extends AppCompatActivity {
    ImageView dob,userProfile;
    TextView user_dob,user_mobile,user_email;
    Toolbar toolbarUser;
    Button saveUserInfo;
    EditText user_fname,user_lname;
    RadioButton male,female,transgender;
    DatabaseReference reference;


    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user_info);
        dob=findViewById(R.id.dob_pick);
        dob.setOnClickListener(v -> showDatePickerDialog());

        saveUserInfo=findViewById(R.id.submit_userInfo);
        user_fname=findViewById(R.id.user_fname);
        user_lname=findViewById(R.id.user_lname);
        user_mobile=findViewById(R.id.user_mobile);
        user_email=findViewById(R.id.user_email);
        user_dob=findViewById(R.id.user_dob);
        male=findViewById(R.id.edit_male);
        female=findViewById(R.id.edit_female);
        transgender=findViewById(R.id.edit_transgender);
        userProfile=findViewById(R.id.edit_user_profile);

        toolbarUser=findViewById(R.id.toolbar_editUserProfile);
        setSupportActionBar(toolbarUser);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        reference= FirebaseDatabase.getInstance().getReference("users");
        GoogleSignInAccount account= GoogleSignIn.getLastSignedInAccount(getApplication());
        assert account != null;
        reference.child(Objects.requireNonNull(account.getId())).get().addOnCompleteListener(task -> {
            if (task.isSuccessful()){
                DataSnapshot dataSnapshot=task.getResult();
                String fName= String.valueOf(dataSnapshot.child("userFirstName").getValue());
                String lName= String.valueOf(dataSnapshot.child("userLastName").getValue());
                String email=String.valueOf(dataSnapshot.child("userEmail").getValue());
                String mb=String.valueOf(dataSnapshot.child("UserMobileNumber").getValue());
                String gender=String.valueOf(dataSnapshot.child("gender").getValue());
                String dob=String.valueOf(dataSnapshot.child("userDOB").getValue());
                String photoUrl=String.valueOf(dataSnapshot.child("userProfile").getValue());
                user_fname.setText(fName);
                user_lname.setText(lName);
                user_email.setText(email);
                user_mobile.setText(mb);
                user_dob.setText(dob);
                switch (gender){
                    case "male":
                        male.setChecked(true);
                        break;
                    case "female":
                        female.setChecked(true);
                        break;
                    case "transgender":
                        transgender.setChecked(true);
                }
                Glide.with(this).load(photoUrl).into(userProfile);


            }

        });


        saveUserInfo.setOnClickListener(v -> {
            String gender;

            if (male.isChecked()){
                gender="male";
            }
            else if (female.isChecked()) {
                gender="female";
            }
            else if (transgender.isChecked()) {
                gender="transgender";

            }
            else {
                gender = null;
            }
            if (!Objects.requireNonNull(user_fname.getText()).toString().trim().isEmpty() &&
                    !Objects.requireNonNull(user_lname.getText()).toString().trim().isEmpty() &&
                    !user_dob.getText().toString().trim().isEmpty() && (gender!=null)){


                GoogleSignInAccount account1= GoogleSignIn.getLastSignedInAccount(getApplication());
                assert account1 != null;
                HashMap<String,Object> hashMap=new HashMap<>();
                hashMap.put("userFirstName",user_fname.getText().toString());
                hashMap.put("userLastName",user_lname.getText().toString());
                hashMap.put("userDOB",user_dob.getText().toString());
                hashMap.put("gender", gender);
                FirebaseDatabase.getInstance().getReference().child("users").child(Objects.requireNonNull(account1.getId())).updateChildren(hashMap);
                Toast.makeText(this, "Information Submitted Successfully", Toast.LENGTH_SHORT).show();
                onBackPressed();



            }
            else {
                Toast.makeText(this, "Please fill the All Field", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void showDatePickerDialog() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this::onDateSet, year, month, day);
        datePickerDialog.show();
    }
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        //  Handle the selected date here
        @SuppressLint("DefaultLocale") String selectedDate = String.format("%02d/%02d/%04d",dayOfMonth, month + 1, year);
        user_dob.setText(selectedDate);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}