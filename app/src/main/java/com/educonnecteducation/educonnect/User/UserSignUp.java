package com.educonnecteducation.educonnect.User;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.educonnecteducation.educonnect.MainActivity;
import com.educonnecteducation.educonnect.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Objects;

public class UserSignUp extends AppCompatActivity {
    LinearLayout googleVerification;
    FirebaseAuth auth;
    FirebaseDatabase database;
    GoogleSignInClient mGoogleSignInClient;
    int RC_SIGN_IN=20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);
        googleVerification=findViewById(R.id.google_verification);

        auth=FirebaseAuth.getInstance();
        database=FirebaseDatabase.getInstance();
        GoogleSignInOptions gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail().build();
        mGoogleSignInClient= GoogleSignIn.getClient(this,gso);

        googleVerification.setOnClickListener(v -> googleSignIn());
        GoogleSignInAccount account=GoogleSignIn.getLastSignedInAccount(getApplication());
        if (account!=null){
            Intent intent=new Intent(UserSignUp.this, MainActivity.class);
            startActivity(intent);
            finish();

        }



    }

    private void googleSignIn() {
        Intent intent=mGoogleSignInClient.getSignInIntent();
        startActivityForResult(intent,RC_SIGN_IN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==RC_SIGN_IN){
            Task<GoogleSignInAccount> task=GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account=task.getResult(ApiException.class);
                firebaseAuth(account.getIdToken());
            } catch (ApiException e) {
                Toast.makeText(this, "Please select your Google account", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void firebaseAuth(String idToken) {
        AuthCredential credential= GoogleAuthProvider.getCredential(idToken,null);
        auth.signInWithCredential(credential)
                .addOnCompleteListener(task -> {
                   if (task.isSuccessful()){
                      GoogleSignInAccount account=GoogleSignIn.getLastSignedInAccount(getApplication());
                       assert account != null;
                       HashMap<String,Object> hashMap=new HashMap<>();
                       hashMap.put("userId",account.getId());
                       hashMap.put("userName",account.getDisplayName());
                       hashMap.put("userEmail",account.getEmail());
                       hashMap.put("userProfile", Objects.requireNonNull(account.getPhotoUrl()).toString());
                       database.getReference().child("users").child(Objects.requireNonNull(account.getId())).updateChildren(hashMap);
                       Intent intent=new Intent(UserSignUp.this,UserMobileNumber.class);
                       intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                       startActivity(intent);
                       Toast.makeText(this, "Google SignIn Successfully\n"+account.getEmail(), Toast.LENGTH_SHORT).show();
                   }
                   else {
                       Toast.makeText(UserSignUp.this, "Something Went Wrong..", Toast.LENGTH_SHORT).show();
                   }
                });
    }
}