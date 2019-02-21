package com.example.bom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bom.R;


public class MainActivity extends AppCompatActivity {

    TextView countTV;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTV = findViewById(R.id.count);

    }

    public void upBtnClicked1 (View view) {
        count++;
        countTV.setText(""+count);
    }
    public void downBtnClicked1 (View view) {
        while(count>=0) {
            count--;
            countTV.setText("" + count);
        }
    }

    public void upBtnClicked2 (View view) {
        count++;
        countTV.setText(""+count);
    }
    public void downBtnClicked2 (View view) {
        while(count>=0) {
            count--;
            countTV.setText("" + count);
        }
    }

    public void upBtnClicked3 (View view) {
        count++;
        countTV.setText(""+count);
    }
    public void downBtnClicked3 (View view) {
        while(count>=0) {
            count--;
            countTV.setText("" + count);
        }
    }

}
