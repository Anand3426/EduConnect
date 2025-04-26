package com.educonnecteducation.educonnect.User;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.educonnecteducation.educonnect.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Objects;

public class SignUpAcademicsDetails extends AppCompatActivity {
    TextInputEditText fname,lname;
    TextView dob;
    RadioButton male,female,other;
    Button submitUserInfo;
    ImageView dob_pick;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_academics_details);
        fname=findViewById(R.id.signup_user_fname);
        lname=findViewById(R.id.signup_user_lname);
        dob=findViewById(R.id.signup_user_dob);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        other=findViewById(R.id.transgender);
        submitUserInfo=findViewById(R.id.signup_submit_userInfo);
        dob_pick=findViewById(R.id.dob_pick);

        dob_pick.setOnClickListener(v -> showDatePickerDialog());

        submitUserInfo.setOnClickListener(v -> {
            String gender;

            if (male.isChecked()){
                gender="male";
            }
            else if (female.isChecked()) {
                gender="female";
            }
            else if (other.isChecked()) {
                gender="transgender";

            }
            else {
                gender = null;
            }
            if (!Objects.requireNonNull(fname.getText()).toString().trim().isEmpty() &&
                    !Objects.requireNonNull(lname.getText()).toString().trim().isEmpty() &&
                    !dob.getText().toString().trim().isEmpty() && (gender!=null)){


                GoogleSignInAccount account= GoogleSignIn.getLastSignedInAccount(getApplication());
                assert account != null;
                HashMap<String,Object> hashMap=new HashMap<>();
                hashMap.put("userFirstName",fname.getText().toString());
                hashMap.put("userLastName",lname.getText().toString());
                hashMap.put("userDOB",dob.getText().toString());
                hashMap.put("gender", gender);
                FirebaseDatabase.getInstance().getReference().child("users").child(Objects.requireNonNull(account.getId())).updateChildren(hashMap);
                Toast.makeText(this, "Data Submitted Successfully", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SignUpAcademicsDetails.this, SignUpCourseDetails.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);



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

    private void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        @SuppressLint("DefaultLocale") String selectedDate = String.format("%02d/%02d/%04d",dayOfMonth, month + 1, year);
        dob.setText(selectedDate);
    }
}