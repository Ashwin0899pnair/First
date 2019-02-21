package com.example.bom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Submit;
    private EditText Name;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.name);
        Password = findViewById(R.id.password);
        Submit = findViewById(R.id.login);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitbtn(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    public void submitbtn(String userName, String userPassword) {
        if ((userName.equals("Ashwin") && userPassword.equals("A1B2C3")) || (userName.equals("Kaustubh") && userPassword.equals("A1B2C3")) || (userName.equals("Arnav") && userPassword.equals("A1B2C3"))) {
            Intent i = new Intent(MainActivity.this, purchase.class);
            startActivity(i);
        } else {

            Toast.makeText(this, "Invalid user", Toast.LENGTH_LONG).show();
        }

    }

}
