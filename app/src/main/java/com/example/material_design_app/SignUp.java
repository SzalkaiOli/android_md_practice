package com.example.material_design_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class SignUp extends AppCompatActivity {

    ImageView image;
    TextView logoText, sloganText;
    TextInputLayout name, username, email, phoneNum, password;
    Button signup_btn, callLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        // Hooks
        image = findViewById(R.id.logo_image);
        logoText = findViewById(R.id.logo_name);
        sloganText = findViewById(R.id.slogan_name);
        name = findViewById(R.id.name);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        phoneNum = findViewById(R.id.phoneNum);
        password = findViewById(R.id.password);
        signup_btn = findViewById(R.id.signup_btn);
        callLogin = findViewById(R.id.login_screen);

        // Shared animations
        callLogin.setOnClickListener(view -> {
            Intent intent = new Intent(SignUp.this, Login.class);

            Pair[] pairs = new Pair[10];
            pairs[0] = new Pair<View, String>(image, "logo_image");
            pairs[1] = new Pair<View, String>(logoText, "logo_name");
            pairs[2] = new Pair<View, String>(sloganText, "slogan_name");
            pairs[3] = new Pair<View, String>(name, "name");
            pairs[4] = new Pair<View, String>(username, "username");
            pairs[5] = new Pair<View, String>(email, "email");
            pairs[6] = new Pair<View, String>(phoneNum, "phoneNum");
            pairs[7] = new Pair<View, String>(password, "password");
            pairs[8] = new Pair<View, String>(signup_btn, "signup_btn");
            pairs[9] = new Pair<View, String>(callLogin, "login_screen");

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUp.this, pairs);
            startActivity(intent, options.toBundle());
        });
    }
}