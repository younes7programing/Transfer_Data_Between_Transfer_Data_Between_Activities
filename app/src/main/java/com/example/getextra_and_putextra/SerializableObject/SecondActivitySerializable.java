package com.example.getextra_and_putextra.SerializableObject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.getextra_and_putextra.R;

public class SecondActivitySerializable extends AppCompatActivity {

    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_serializable);

        txtv = findViewById(R.id.txvSr);
        UserS users = new UserS();
        users = (UserS) getIntent().getSerializableExtra("USER_INFO");
        txtv.setText("Hello " + users.getName() + "  votre pseudo est : " + users.getPseudo());

    }


}
