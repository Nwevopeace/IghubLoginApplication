package com.example.myloginapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class ForgotPassword extends AppCompatActivity {

    private EditText etEmail2;
    private Button btnReset;

    private String email;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        etEmail2 = findViewById(R.id.etEmail2);
        btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = etEmail2.getText().toString().trim();

                validate();
            }
        });
    }

    private void validate() {
        if(email.isEmpty() || !email.contains("@")){
            etEmail2.setError("email must be valid");
        } else {
            Toast.makeText(getApplicationContext(), "Password Reset Sent Successfully", Toast.LENGTH_SHORT).show();
        }
    }
}