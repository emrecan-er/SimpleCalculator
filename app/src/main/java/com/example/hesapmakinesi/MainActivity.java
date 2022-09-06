package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         number1Text =findViewById(R.id.number1Text);
         number2Text = findViewById(R.id.number2Text);
         resultTest = findViewById(R.id.resultText);
    }

    public void toplama(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultTest.setText("Sayi Giriniz !!");

        }
        else {
            float no1 = Float.parseFloat()//stringi floata ceviriyo
            float no2 = Float.parseFloat(number2Text.getText().toString());
            float sonuc = no1 + no2;
            resultTest.setText("Sonuc : " + sonuc);
        }

    }
    public void bolme(View view){
        float no1=Float.parseFloat(number1Text.getText().toString());//stringi floata ceviriyo
        float no2=Float.parseFloat(number2Text.getText().toString());
        float sonuc=no1/no2;
        resultTest.setText("Sonuc : " +sonuc);
    }
    public void carpma(View view){
        float no1=Float.parseFloat(number1Text.getText().toString());//stringi floata ceviriyo
        float no2=Float.parseFloat(number2Text.getText().toString());
        float sonuc=no1*no2;
        resultTest.setText("Sonuc : " +sonuc);
    }
    public void cikarma(View view){
        float no1=Float.parseFloat(number1Text.getText().toString());//stringi floata ceviriyo
        float no2=Float.parseFloat(number2Text.getText().toString());
        float sonuc=no1-no2;
        resultTest.setText("Sonuc : " +sonuc);
    }





}