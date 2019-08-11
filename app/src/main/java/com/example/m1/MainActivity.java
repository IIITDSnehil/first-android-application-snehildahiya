package com.example.m1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void sendMessage(View view){
            //d for log in debug mode
            Log.d( "MYCODE", "IT WORKS");
            Intent newIntent = new Intent(this,Main2Activity.class);
             startActivity(newIntent);
        }

}
