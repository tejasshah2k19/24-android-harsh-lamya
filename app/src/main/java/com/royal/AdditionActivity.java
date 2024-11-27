package com.royal;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);


        EditText n1 = findViewById(R.id.edtN1);
        EditText n2 = findViewById(R.id.edtN2);
        Button btnAdd = findViewById(R.id.btnAdd);
        TextView tvAns = findViewById(R.id.tvAns);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  x =  Integer.parseInt(n1.getText().toString());//data
                int y = Integer.parseInt(n2.getText().toString());
                //Logcat
                Log.i("MyDaya",x+"");

                int ans = x+y;
                tvAns.setText(ans+"");

            }
        });


    }
}

class A implements  Runnable{
    public void run(){

    }
}

