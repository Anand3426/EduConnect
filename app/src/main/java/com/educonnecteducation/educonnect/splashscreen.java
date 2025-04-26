package com.educonnecteducation.educonnect;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.educonnecteducation.educonnect.User.UserSignUp;

@SuppressLint("CustomSplashScreen")
public class splashscreen extends AppCompatActivity {
    Animation top,bottom;
    ImageView imageView,clg_logo;
    TextView textView,eng,dept,college;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);
        top= AnimationUtils.loadAnimation(splashscreen.this,R.anim.top_animation);
        bottom= AnimationUtils.loadAnimation(splashscreen.this,R.anim.bottom_animation);
        imageView=findViewById(R.id.imageView);
        textView=findViewById(R.id.slogan);
        eng=findViewById(R.id.engagewith);
        dept=findViewById(R.id.dept_name);
        college=findViewById(R.id.college_name);
        clg_logo=findViewById(R.id.college_logo);

        imageView.setAnimation(top);
        textView.setAnimation(bottom);
        eng.setAnimation(bottom);
        dept.setAnimation(bottom);
        college.setAnimation(bottom);
        clg_logo.setAnimation(bottom);



        new Handler().postDelayed(() -> {
            Intent  iHome=new Intent(splashscreen.this, UserSignUp.class);
            startActivity(iHome);
            finish();

        },3000);


    }
}