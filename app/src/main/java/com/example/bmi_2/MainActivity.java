package com.example.bmi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        height=findViewById(R.id.et1);
        weight=findViewById(R.id.et2);
        send=findViewById(R.id.btn1);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,CountBMI.class);
                Bundle bundle = new Bundle();
                bundle.putString("height",height.getText().toString());
                bundle.putString("width",weight.getText().toString());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });


    }
}
