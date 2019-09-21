package com.example.dizon_labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VerifySchool extends AppCompatActivity {
EditText ets1,ets2, ets3,ets4;
SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_school);

        ets1 = findViewById(R.id.verifyField);

    }
    public void validataData(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        String s1SP= sp.getString("s1", null);
        String s2SP= sp.getString("s2", null);
        String s3SP= sp.getString("s3", null);
        String s4SP= sp.getString("s4", null);
        String sc1 = ets1.getText().toString();

        if(s1SP.equals(sc1) || s2SP.equals(sc1) || s3SP.equals(sc1) || s4SP.equals(sc1)) {
            Toast.makeText(this, "School is participating in UAAP", Toast.LENGTH_SHORT).show();
        }
    else
    {
        Toast.makeText(this, "School is not participating in UAAP", Toast.LENGTH_SHORT).show();
    }


     }
}
