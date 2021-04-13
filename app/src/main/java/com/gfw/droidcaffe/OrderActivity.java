package com.gfw.droidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {
    public static final String TAG_ACTIVITY = OrderActivity.class.getSimpleName();
    public void displayToast (String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }


    public void LaunchPayActivity(View view) {
        Intent intent = new Intent(this, bayarActivity.class);
        startActivity(intent);
    }

   }
