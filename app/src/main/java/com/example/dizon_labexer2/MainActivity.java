package com.example.dizon_labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ets1, ets2, ets3, ets4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ets1 = findViewById(R.id.school1);
        ets2 = findViewById(R.id.school2);
        ets3 = findViewById(R.id.school3);
        ets4 = findViewById(R.id.school4);


    }
    public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("data1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String sc1 = ets1.getText().toString();
        String sc2 = ets2.getText().toString();
        String sc3 = ets3.getText().toString();
        String sc4 = ets4.getText().toString();
        editor.putString("s1", sc1);
        editor.putString("s2", sc1);
        editor.putString("s3", sc1);
        editor.putString("s4", sc1);

        editor.commit();
        Toast.makeText(this, "Data has been saved", Toast.LENGTH_SHORT).show();


    }
    public void switchActivity(View v){
        startActivity(new Intent(this, MainActivity.class));}

}

