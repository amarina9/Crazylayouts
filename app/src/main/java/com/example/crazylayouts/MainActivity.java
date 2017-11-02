package com.example.crazylayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void A_Linear (View v){

        Intent intent = new Intent(this, Linear1.class);
        startActivity(intent);
    }


    public void A_Relative(View v){

        Intent intent = new Intent(this, relative1.class);
        startActivity(intent);

    }
}
