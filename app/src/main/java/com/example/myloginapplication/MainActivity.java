package com.example.myloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<string> extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private Button btnLogin, btnRegister, btnReset;
    private TextView txtForgotPassword;
    private String email, password;
    private TextView txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnReset = findViewById(R.id.btnReset);
        btnRegister = findViewById(R.id.btnRegister);
        txtForgotPassword = findViewById(R.id.txtForgotPassword);
        txtSignUp = findViewById(R.id.txtSignUp);

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    email = etEmail.getText().toString().trim();
                    password = etPassword.getText().toString().trim();

                    validate();
                }
            });
            txtForgotPassword.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ForgotPassword.class);// you can also use MainActivity.this
                    startActivity(intent);
                }
            });

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

    }

        private void validate(){
            if(email.isEmpty()){
                etEmail.setError("email cannot be empty!");
            } else if (password.isEmpty() || password.length() < 4) {
                etPassword.setError("Password cannot be less than 4 characters!");
            } else {
                Toast.makeText(MainActivity.this, "Credentials successfully validated", Toast.LENGTH_LONG).show();
            }
        }
    }


    //whsts the issue u want me to solve...?
