package com.example.healtech;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import info.hoang8f.widget.FButton;

import com.example.healtech.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.login_btn);
        loginButton.setOnClickListener(this);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }

    private boolean checkValid(String username, String password) {
        return username.length() > 0 && password.length() > 0;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_btn) {
            if (checkValid(username.getText().toString(), password.getText().toString())) {

            }
        }
    }
}