package com.educonnecteducation.educonnect.User;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.educonnecteducation.educonnect.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class UserMobileNumber extends AppCompatActivity {
    Toolbar toolbar;
    ImageView exit_sheet;
    TextView countDownTimer,resendOtp,userMobileNumber;
    LinearLayout show_resend_otp,sendOtp,verifyOtp;
    EditText mobileNumber,b1,b2,b3,b4,b5,b6;
    ProgressBar pbSendingOtp,pbVerifyOtp,pbResendOtp;
    String fireBaseBackendOtp;

    @SuppressLint({"SetTextI18n","MissingInflatedId"})
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_mobile_number);

        toolbar=findViewById(R.id.toolbar_mobile_sign_up);
        mobileNumber=findViewById(R.id.mobileNumber);
        sendOtp=findViewById(R.id.send_mobile_otp);
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(UserMobileNumber.this,R.style.bottomsheetstyle);
        View view= LayoutInflater.from(UserMobileNumber.this).inflate(R.layout.activity_bottomsheet_mobile_otp,findViewById(R.id.bottomsheet_mobileOtpVerify));
        bottomSheetDialog.setContentView(view,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        b1=bottomSheetDialog.findViewById(R.id.inputotp1);
        b2=bottomSheetDialog.findViewById(R.id.inputotp2);
        b3=bottomSheetDialog.findViewById(R.id.inputotp3);
        b4=bottomSheetDialog.findViewById(R.id.inputotp4);
        b5=bottomSheetDialog.findViewById(R.id.inputotp5);
        b6=bottomSheetDialog.findViewById(R.id.inputotp6);
        exit_sheet=bottomSheetDialog.findViewById(R.id.exitbottomsheet);
        countDownTimer=bottomSheetDialog.findViewById(R.id.coundown_timer);
        show_resend_otp=bottomSheetDialog.findViewById(R.id.show_resend_otp);
        resendOtp=bottomSheetDialog.findViewById(R.id.resend_otp);
        userMobileNumber=bottomSheetDialog.findViewById(R.id.user_mobile_number);
        verifyOtp=bottomSheetDialog.findViewById(R.id.verify_otp);

        pbSendingOtp=findViewById(R.id.progessBar_sending_otp);
        pbVerifyOtp=bottomSheetDialog.findViewById(R.id.progessBar_verify_otp);
        pbResendOtp=bottomSheetDialog.findViewById(R.id.progessBar_resend_otp);
        setSupportActionBar(toolbar);
        GoogleSignInAccount account=GoogleSignIn.getLastSignedInAccount(getApplication());



        sendOtp.setOnClickListener(ve -> {
            if (!mobileNumber.getText().toString().isEmpty()){
                if ((mobileNumber.getText().toString().trim()).length()==10){
                    pbSendingOtp.setVisibility(View.VISIBLE);
                    sendOtp.setVisibility(View.GONE);
                    PhoneAuthProvider.getInstance().verifyPhoneNumber(
                            "+91" + mobileNumber.getText().toString(),
                            5,
                            TimeUnit.SECONDS,
                            UserMobileNumber.this,
                            new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                                @Override
                                public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                                    pbSendingOtp.setVisibility(View.GONE);
                                    sendOtp.setVisibility(View.VISIBLE);
                                }

                                @Override
                                public void onVerificationFailed(@NonNull FirebaseException e) {
                                    pbSendingOtp.setVisibility(View.GONE);
                                    sendOtp.setVisibility(View.VISIBLE);
                                    Toast.makeText(UserMobileNumber.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onCodeSent(@NonNull String backedOtp, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                    bottomSheetDialog.show();
                                    startTime();
                                    String mbNumber=mobileNumber.getText().toString();
                                    userMobileNumber.setText("+91-"+mbNumber);
                                    pbSendingOtp.setVisibility(View.GONE);
                                    sendOtp.setVisibility(View.VISIBLE);
                                    fireBaseBackendOtp=backedOtp;
                                }
                            }
                    );
                }
                else {
                    Toast.makeText(this, "Please Enter Correct Number", Toast.LENGTH_SHORT).show();
                }

            }
            else {
                Toast.makeText(this, "Please Enter Mobile Number", Toast.LENGTH_SHORT).show();
            }

        });


        verifyOtp.setOnClickListener(v -> {
            if (!b1.getText().toString().trim().isEmpty() && !b2.getText().toString().trim().isEmpty() && !b3.getText().toString().trim().isEmpty() &&
                    !b4.getText().toString().trim().isEmpty() && !b5.getText().toString().trim().isEmpty() && !b6.getText().toString().trim().isEmpty()){
              String userEnterOtp=b1.getText().toString()+
                      b2.getText().toString()+
                      b3.getText().toString()+
                      b4.getText().toString()+
                      b5.getText().toString()+
                      b6.getText().toString();

              if (fireBaseBackendOtp!=null){
                  pbVerifyOtp.setVisibility(View.VISIBLE);
                  verifyOtp.setVisibility(View.GONE);

                  PhoneAuthCredential phoneAuthCredential=PhoneAuthProvider.getCredential(fireBaseBackendOtp,userEnterOtp);
                  FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential)
                          .addOnCompleteListener(task -> {
                              pbVerifyOtp.setVisibility(View.GONE);
                              verifyOtp.setVisibility(View.VISIBLE);
                              if (task.isSuccessful()){
                                  assert account != null;
                                  HashMap<String,Object>hashMap=new HashMap<>();
                                  hashMap.put("UserMobileNumber",mobileNumber.getText().toString());
                                  FirebaseDatabase.getInstance().getReference().child("users").child(Objects.requireNonNull(account.getId())).updateChildren(hashMap);
                                  Toast.makeText(this, "OTP Verification Successfully", Toast.LENGTH_SHORT).show();
                                  Intent intent=new Intent(UserMobileNumber.this, SignUpAcademicsDetails.class);
                                  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                  startActivity(intent);
                              }
                              else {
                                  Toast.makeText(this, "Enter the Correct OTP", Toast.LENGTH_SHORT).show();
                                  clearEnterOtp();
                              }
                          });

              }
              else {
                  Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
              }


            }
            else {
                Toast.makeText(this, "Please Enter All Number of OTP", Toast.LENGTH_SHORT).show();
                clearEnterOtp();
            }

        });
        exit_sheet.setOnClickListener(v -> bottomSheetDialog.dismiss());
        resendOtp.setOnClickListener(v ->{
            resendOtp.setVisibility(View.GONE);
            pbResendOtp.setVisibility(View.VISIBLE);
                PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+91" + mobileNumber.getText().toString(),
                5,
                TimeUnit.SECONDS,
                UserMobileNumber.this,
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    @Override
                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                        show_resend_otp.setVisibility(View.GONE);

                    }

                    @Override
                    public void onVerificationFailed(@NonNull FirebaseException e) {
                        show_resend_otp.setVisibility(View.GONE);
                        Toast.makeText(UserMobileNumber.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onCodeSent(@NonNull String newBackedOtp, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                        startTime();
                        show_resend_otp.setVisibility(View.GONE);
                        fireBaseBackendOtp=newBackedOtp;
                        Toast.makeText(UserMobileNumber.this, "OTP Sended Successfully", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    });
        numberToMove();

    }

    private void clearEnterOtp() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
    }

    private void numberToMove() {
        b1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()){
                    b2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        b2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (!s.toString().trim().isEmpty()){
                    b1.requestFocus();
                }

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()){
                    b3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        b3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (!s.toString().trim().isEmpty()){
                    b2.requestFocus();
                }

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()){
                    b4.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        b4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (!s.toString().trim().isEmpty()){
                    b3.requestFocus();
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()){
                    b5.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        b5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (!s.toString().trim().isEmpty()){
                    b4.requestFocus();
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()){
                    b6.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        b6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (!s.toString().trim().isEmpty()){
                    b5.requestFocus();
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void startTime() {
        countDownTimer.setVisibility(View.VISIBLE);


    }
}