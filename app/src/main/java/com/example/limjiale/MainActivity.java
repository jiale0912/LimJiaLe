package com.example.limjiale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_spm= (Button) findViewById(R.id.btn_spm);
        btn_spm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SPM.class));
            }
        });



        Button btn_Olevel= (Button) findViewById(R.id.btn_O_level);
        btn_Olevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OLevel.class));
            }
        });

        Button btn_UEC= (Button) findViewById(R.id.btn_UEC);
        btn_UEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, UEC.class));
            }
        });


    }
}



