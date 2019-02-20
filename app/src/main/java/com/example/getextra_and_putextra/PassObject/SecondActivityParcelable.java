package com.example.getextra_and_putextra.PassObject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.getextra_and_putextra.R;

import java.util.ArrayList;

public class SecondActivityParcelable extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_parcelable);


        TextView textv = findViewById(R.id.textViewObj);
        //User user;
        ArrayList<User> user;
        user = getIntent().getParcelableArrayListExtra("USER_INFO");


        //textv.setText(user.getName() + " " + user.getAge());
        System.out.println("uuuuuuuuuu: " + user);
        Log.d("list yyyyyyyyyyy", String.valueOf(user));
        //textv.setText(user.getName());

        String text = "Hello " + user.get(0).getName() + " Ah you have " + user.get(0).getAge();
        textv.setText(text);
    }
}
