package com.example.getextra_and_putextra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtv1;
    TextView txtv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtv1 = findViewById(R.id.txtv_getExtra1);
        txtv2 = findViewById(R.id.txtv_getExtra2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String getDataN = bundle.get("NAME").toString();
            String getDataF = (String) bundle.get("FIRST_NAME");
            txtv1.setText("Hello " + getDataN);
            txtv2.setText(getDataF);
        }
    }
}
/*

 * if You have this Problem : java.lang.ClassCastException: android.text.SpannableString cannot be cast to java.lang.String ;
 * So know that :
 * SpannableString is not String directly. so, you can not cast. but, it can be converted to string.
 * you can convert something to string with concatenating with empty string.
 * Or
 * Add .toString() method
 *
 *
 * */