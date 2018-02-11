package com.example.android.tesxsight2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    private EditText password;
    private Button btnLogin;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        addListenerOnButton();
    }


//    public void addListenerOnButton(){
//        password = (EditText) findViewById(R.id.input_Password);
//        btnLogin = (Button) findViewById(R.id.btn_Login);
//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//                Toast.makeText(loginActivity.this, password.getText(), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }

    public void submitLogin(View view) {
        password = (EditText) findViewById(R.id.input_Password);
        email = (EditText) findViewById(R.id.input_Email);

        if (email.getText().toString().length() == 0) {
            email.setError("First name is required!");
        } else {
            Intent i = new Intent(getApplicationContext(), MainMenu.class);
            startActivity(i);
        }


    }
}
