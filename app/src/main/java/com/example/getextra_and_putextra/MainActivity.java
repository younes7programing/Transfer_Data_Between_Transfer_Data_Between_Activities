package com.example.getextra_and_putextra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import com.example.getextra_and_putextra.PassObject.User;
import com.example.getextra_and_putextra.SerializableObject.UserS;

import java.util.ArrayList;

/*
 *Transfer_Data_Between_Transfer_Data_BetwTransfer_Data_Between_Activities_Parcelable_Serializable
 * Please note that serialization can cause performance issues: it takes time,
 * and a lot of objects will be allocated (and thus, have to be garbage collected)
 * */


public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //set content view AFTER ABOVE sequence (to avoid crash)
        this.setContentView(R.layout.activity_main);


    }

    //First Button ==> Send Data from String
    public void btnGoSecondActivity(View view) {
        userName = findViewById(R.id.editt_userName);
        name = findViewById(R.id.edt_name);

        Intent intent = new Intent(getApplicationContext(), com.example.getextra_and_putextra.SecondActivity.class);
        intent.putExtra("NAME", name.getText());
        intent.putExtra("FIRST_NAME", userName.getText() + " ");
        startActivity(intent);
    }

    // Second Button ==>  Send Data  with Parcelable Method
    public void Parcelable(View view) {
        //User user;
        //user.setName("Younes");
        // user.setage(100);

        ArrayList<User> userP;
        userP = new ArrayList<>();
        userP.add(new User("Younes", 100));

        Intent intent = new Intent(getApplicationContext(), com.example.getextra_and_putextra.PassObject.SecondActivityParcelable.class);
        intent.putParcelableArrayListExtra("USER_INFO", userP);
        startActivity(intent);
    }


    //Third Button ==>  Send Data  with Serializable Method
    public void bt_serializable(View view) {

        UserS user = new UserS();
        user.setName("younes");
        user.setPseudo("Me");
        Intent intent = new Intent(getApplicationContext(), com.example.getextra_and_putextra.SerializableObject.SecondActivitySerializable.class);
        intent.putExtra("USER_INFO", user);
        startActivity(intent);
    }
}


