package com.example.dizon_labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_school);

        final EditText school1 = (EditText) findViewById(R.id.school1);
        final EditText school2 = (EditText) findViewById(R.id.school2);
        final EditText school3 = (EditText) findViewById(R.id.school3);
        final EditText school4 = (EditText) findViewById(R.id.school4);
        Button verifyBtn = (Button) findViewById(R.id.verfiyBtn);
        Button addSchools = (Button) findViewById(R.id.addSchool);

        verifyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String newSchool1 = school1.getText().toString();
                String newSchool2 = school2.getText().toString();
                String newSchool3 = school3.getText().toString();
                String newSchool4 = school4.getText().toString();


                SharedPreferences.Editor editor = preferences.edit();

                editor.putString(newSchool1+newSchool2+newSchool3+newSchool4+"data","");
                editor.commit();

                Intent VerifySchool = new Intent(com.example.dizon_labexer2.MainActivity.this, com.example.dizon_labexer2.VerifySchool.class);
                startActivity(VerifySchool);
            }
        });

        addSchools.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent addSchool = new Intent(MainActivity.this, VerifySchool.class);
                startActivity(addSchool);
            }
        });
    }
}
