package com.royal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText edtFirstName;
    private EditText edtLastName;
    private EditText edtEmail;
    private EditText edtPassword;
    private RadioButton rbtGenderMale;
    private RadioButton rbtGenderFemale;
    private Button btnSignup;

    private  RadioGroup rbtGenderGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_signup);

         //bind
        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        rbtGenderMale = findViewById(R.id.rbtMale);
        rbtGenderFemale = findViewById(R.id.rbtFemale);
        btnSignup = findViewById(R.id.btnSignup);
        rbtGenderGroup = findViewById(R.id.rbtGender);


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName,lastName,email,password,gender="";

                firstName = edtFirstName.getText().toString();
                lastName = edtLastName.getText().toString();
                email = edtEmail.getText().toString();
                password = edtPassword.getText().toString();

                if(rbtGenderMale.isChecked()){
                    gender = "male";
                }else if(rbtGenderFemale.isChecked()){
                    gender = "female";
                }else{
                    gender ="";
                }
                boolean isError = false;
                if(firstName.trim().isEmpty()){
                    isError=true;
                    edtFirstName.setError("Please Enter FirstName");
                }
                if(lastName.trim().isEmpty()){
                    isError=true;
                    edtLastName.setError("Please Enter LastName");
                }
                if(email.trim().isEmpty()){
                    isError=true;
                    edtEmail.setError("Please Enter Email");
                }
                if(password.trim().isEmpty()){
                    isError=true;
                    edtPassword.setError("Please Enter Password");
                }
                if(gender.trim().isEmpty()){
                    isError=true;
                }

                if(!isError){
                    Intent intent = new Intent(getApplicationContext(),AdditionActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Please Correct Error(s)",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}