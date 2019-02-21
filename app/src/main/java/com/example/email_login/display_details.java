package com.example.email_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class display_details extends AppCompatActivity {
    private Button Submit;
    private int login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_details);


        Submit = findViewById(R.id.logout);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue();
                Intent b = new Intent(display_details.this, MainActivity.class);
                startActivity(b);


            }

        });
    }

        private void setvalue(){

            SharedPreferences settings1 = getSharedPreferences("Start",0);
            SharedPreferences.Editor editor1 = settings1.edit();
            editor1.putInt("POWER1",0);
            editor1.commit();
        }

        private void checkvalue() {
            SharedPreferences settings1 = getSharedPreferences("Start",0);
            login = settings1.getInt("POWER1",0);
        }
    }

