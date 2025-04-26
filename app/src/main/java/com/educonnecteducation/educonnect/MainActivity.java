package com.educonnecteducation.educonnect;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bumptech.glide.Glide;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.educonnecteducation.educonnect.CollegeInfo.AboutDepartment;
import com.educonnecteducation.educonnect.CollegeInfo.AboutDeveloper;
import com.educonnecteducation.educonnect.CollegeInfo.AboutFaculty;
import com.educonnecteducation.educonnect.SideBarItem.AboutUs;
import com.educonnecteducation.educonnect.SideBarItem.HelpAndSupport;
import com.educonnecteducation.educonnect.User.UserMyProfile;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    CardView card;
    ImageView openDrawer,closeDrawer,header_userProfile;
    DrawerLayout drawerLayout;
    BottomNavigationView bottomNavigationView;
    NavigationView navigationView;
    LinearLayout userProfileShow;
    TextView header_userName,header_userMobile,header_userEmail;
    DatabaseReference reference;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider = findViewById(R.id.slidebar);
        openDrawer=findViewById(R.id.open_drawer);
        card=findViewById(R.id.card);
        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.navigationview_home);
        navigationView.setNavigationItemSelectedListener(this);
        View headerview=navigationView.getHeaderView(0);
        userProfileShow=headerview.findViewById(R.id.user_Profile_show);
        closeDrawer=headerview.findViewById(R.id.close_drawer);
        openDrawer.setOnClickListener(v -> drawerLayout.openDrawer(GravityCompat.END));
        closeDrawer.setOnClickListener(v -> drawerLayout.closeDrawer(GravityCompat.END));

        userProfileShow.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this, UserMyProfile.class);
            startActivity(intent);
            drawerLayout.closeDrawer(GravityCompat.END);
        });

        header_userName=headerview.findViewById(R.id.userName);
        header_userMobile=headerview.findViewById(R.id.userMobile);
        header_userEmail=headerview.findViewById(R.id.userEmail);
        header_userProfile=headerview.findViewById(R.id.header_userProfile);
        reference= FirebaseDatabase.getInstance().getReference("users");
        GoogleSignInAccount account= GoogleSignIn.getLastSignedInAccount(getApplication());
        assert account != null;
        reference.child(Objects.requireNonNull(account.getId())).get().addOnCompleteListener(task -> {
            if (task.isSuccessful()){
                DataSnapshot dataSnapshot=task.getResult();

                String fName= String.valueOf(dataSnapshot.child("userFirstName").getValue());
                String lName= String.valueOf(dataSnapshot.child("userLastName").getValue());
                String name= String.valueOf(dataSnapshot.child("userName").getValue());
                String email=String.valueOf(dataSnapshot.child("userEmail").getValue());
                String mb=String.valueOf(dataSnapshot.child("UserMobileNumber").getValue());
                String photoUrl=String.valueOf(dataSnapshot.child("userProfile").getValue());
                String oo="null";
                if (!fName.equals(oo) && !lName.equals(oo)) {
                    header_userName.setText(fName + " " + lName);
                }
                else {
                    header_userName.setText(name);
                }
                header_userEmail.setText(email);
                header_userMobile.setText(mb);
                Glide.with(this).load(photoUrl).into(header_userProfile);

            }

        });





        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Educonnect%20Slider%20Images%2Fwelcome1.jpg?alt=media&token=18baa128-4e6f-4af9-bee4-ef2bbbd7c0fa", "Welcome to EduConnect.", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Educonnect%20Slider%20Images%2FsyllabusAndQuestion.jpg?alt=media&token=2ebab22c-e031-4410-8c56-10d5e6ea0b8a", "Explore Syllabus , Exam pattern and Question Paper all in one app.", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/educonnect-8b7b5.appspot.com/o/Educonnect%20Slider%20Images%2FNotes.jpg?alt=media&token=1e911242-8f2f-41b4-a050-23263f4a8015", "Access the Notes to Improve your Education Learning", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int id=item.getItemId();

            if (id==R.id.bottom_nav_home){
                loadFrog(new fragmentHome(),false);

            } else if (id==R.id.bottom_nav_academics){
                loadFrog(new fragmentAcademicsResources(),false);

            }
            return true;
        });
        bottomNavigationView.setSelectedItemId(R.id.bottom_nav_home);
    }


    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.END)){
            drawerLayout.closeDrawer(GravityCompat.END);
        }
        else
            super.onBackPressed();
    }

    public void loadFrog(Fragment fragment, Boolean flag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag)
            ft.add(R.id.container,fragment);
        else
            ft.replace(R.id.container,fragment);
        ft.commit();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.nav_helpSupport){
            Intent intent=new Intent(MainActivity.this, HelpAndSupport.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_aboutUs){
            Intent intent=new Intent(MainActivity.this, AboutUs.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_aboutDept){
            Intent intent=new Intent(MainActivity.this, AboutDepartment.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_aboutFaculty){
            Intent intent=new Intent(MainActivity.this, AboutFaculty.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_aboutDeveloper){
            Intent intent=new Intent(MainActivity.this, AboutDeveloper.class);
            startActivity(intent);
        }
        drawerLayout.closeDrawer(GravityCompat.END);
        return false;


    }

}