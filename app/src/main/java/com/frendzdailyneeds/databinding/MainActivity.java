package com.frendzdailyneeds.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.frendzdailyneeds.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


       binding.tvOne.setText("This is first Line");
       binding.tvTwo.setText("This is second Line");
       binding.tvThree.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this,TutorialTwo.class));
           }
       });
    }
}
