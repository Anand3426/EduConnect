package com.educonnecteducation.educonnect.User;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.educonnecteducation.educonnect.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class UserMyProfile extends AppCompatActivity {
    ImageView editUserInfo,editUserAcademics,userImage,exitBottomSheet,logOutButton;
    Toolbar toolbar;
    DatabaseReference reference;
    LinearLayout cancel,logOut;
    TextView Stud_CollegeName,Stud_CourseType,Stud_CourseField,Stud_CourseStream,Stud_CourseYear;
    String DStud_CollegeName,DStud_CourseType,DStud_CourseField,DStud_CourseStream,DStud_CourseYear;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_my_profile);
        editUserInfo=findViewById(R.id.edit_user_info);
        editUserAcademics=findViewById(R.id.edit_user_academics);
        logOutButton=findViewById(R.id.logOutAccount);
        toolbar=findViewById(R.id.toolbar_userProfile);
        setSupportActionBar(toolbar);

        Stud_CollegeName=findViewById(R.id.Stud_CollegeName);
        Stud_CourseType=findViewById(R.id.Stud_CourseType);
        Stud_CourseField=findViewById(R.id.Stud_CourseField);
        Stud_CourseStream=findViewById(R.id.Stud_CourseStream);
        Stud_CourseYear=findViewById(R.id.Stud_CourseYear);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        editUserInfo.setOnClickListener(v -> {
            Intent intent=new Intent(UserMyProfile.this, EditUserInfo.class);
            startActivity(intent);
        });
        editUserAcademics.setOnClickListener(v -> {
            Intent intent=new Intent(UserMyProfile.this, EditUserAcademics.class);
            startActivity(intent);
        });
        TextView userName=findViewById(R.id.userName);
        TextView userEmail=findViewById(R.id.userEmail);
        TextView userMobile=findViewById(R.id.userMobile);
        userImage=findViewById(R.id.userPhoto);



        reference= FirebaseDatabase.getInstance().getReference("users");
        GoogleSignInAccount account= GoogleSignIn.getLastSignedInAccount(getApplication());
        assert account != null;
        reference.child(Objects.requireNonNull(account.getId())).get().addOnCompleteListener(task -> {
            if (task.isSuccessful()){
                DataSnapshot dataSnapshot=task.getResult();
                String name= String.valueOf(dataSnapshot.child("userName").getValue());
                String fName= String.valueOf(dataSnapshot.child("userFirstName").getValue());
                String lName= String.valueOf(dataSnapshot.child("userLastName").getValue());
                String email=String.valueOf(dataSnapshot.child("userEmail").getValue());
                String mb=String.valueOf(dataSnapshot.child("UserMobileNumber").getValue());
                String photoUrl=String.valueOf(dataSnapshot.child("userProfile").getValue());
                String oo="null";

                DStud_CollegeName=String.valueOf(dataSnapshot.child("Stud_CollegeName").getValue());
                DStud_CourseType=String.valueOf(dataSnapshot.child("Stud_CourseType").getValue());
                DStud_CourseField=String.valueOf(dataSnapshot.child("Stud_CourseField").getValue());
                DStud_CourseStream=String.valueOf(dataSnapshot.child("Stud_CourseStream").getValue());
                DStud_CourseYear=String.valueOf(dataSnapshot.child("Stud_CourseYear").getValue());

                Stud_CollegeName.setText(DStud_CollegeName);
                Stud_CourseType.setText(DStud_CourseType);
                Stud_CourseField.setText(DStud_CourseField);
                Stud_CourseStream.setText(DStud_CourseStream);
                Stud_CourseYear.setText(DStud_CourseYear);


                userEmail.setText(email);
                userMobile.setText(mb);
                Glide.with(this).load(photoUrl).into(userImage);
                if (fName.equals(oo) && lName.equals(oo)){
                        userName.setText(name);
                }
                else
                    userName.setText(fName+" "+lName);



            }

        });
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(UserMyProfile.this,R.style.bottomsheetstyle);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View view= LayoutInflater.from(UserMyProfile.this).inflate(R.layout.activity_bottom_sheet_log_out_account,findViewById(R.id.bottomSheet_logout));
        bottomSheetDialog.setContentView(view,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        cancel=bottomSheetDialog.findViewById(R.id.logOutCancel);
        logOut=bottomSheetDialog.findViewById(R.id.logOutLogout);
        exitBottomSheet=bottomSheetDialog.findViewById(R.id.logout_exitbottomsheet);
        assert exitBottomSheet != null;
        exitBottomSheet.setOnClickListener(v -> bottomSheetDialog.dismiss());
        logOutButton.setOnClickListener(v -> bottomSheetDialog.show());
        cancel.setOnClickListener(v -> bottomSheetDialog.dismiss());
        logOut.setOnClickListener(v -> {
            GoogleSignIn.getClient(getApplicationContext(), GoogleSignInOptions.DEFAULT_SIGN_IN).signOut();
            Intent intent=new Intent(UserMyProfile.this, UserSignUp.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        });



    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}