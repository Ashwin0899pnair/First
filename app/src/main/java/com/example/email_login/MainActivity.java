package com.example.email_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Submit;
    private EditText Name;
    private EditText Password;
    private int login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkvalue();
        if (login==1){
            Intent i = new Intent ( MainActivity.this, display_details.class);
            startActivity(i);
        }

        Name = findViewById(R.id.name);
        Password = findViewById(R.id.password);
        Submit = findViewById(R.id.login);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitbtn(Name.getText().toString(),Password.getText().toString());
            }
        });
    }

    public void submitbtn(String userName, String userPassword) {
        if((userName.equals("Ashwin") && userPassword.equals("A1B2C3"))||(userName.equals("Kaustubh") && userPassword.equals("A1B2C3")||(userName.equals("Arnav") && userPassword.equals("A1B2C3")))) {
            setvalue();
            Intent i = new Intent ( MainActivity.this, display_details.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Invalid user", Toast.LENGTH_LONG).show();
        }

    }
    private void setvalue(){

        SharedPreferences settings1 = getSharedPreferences("Start",0);
        SharedPreferences.Editor editor1 = settings1.edit();
        editor1.putInt("POWER1",1);
        editor1.commit();
    }

    private void checkvalue() {
        SharedPreferences settings1 = getSharedPreferences("Start",0);
        login = settings1.getInt("POWER1",0);
    }



}

