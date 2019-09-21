package com.example.dizon_labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VerifySchool extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText verify = (EditText) findViewById(R.id.verifyField);

        Button btnSave = (Button) findViewById(R.id.saveBtn);
        Button btnVerify = (Button) findViewById(R.id.nxtBtn);

        btnSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String verifySchool =  verify.getText().toString();
                SharedPreferences preferences = getSharedPreferences("MYPREFS",MODE_PRIVATE);

                String verifying = preferences.getString(verifySchool+"data", "School not competing");
                SharedPreferences.Editor editor = preferences.edit();

                editor.commit();

                Intent verifyScreen = new Intent(VerifySchool.this, MainActivity.class);
                startActivity(verifyScreen);

            }

        });

        btnVerify.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent addSchool = new Intent(VerifySchool.this, MainActivity.class);
                startActivity(addSchool);
            }
        });

    }
}
