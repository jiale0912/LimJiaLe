package com.example.limjiale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SPM extends AppCompatActivity {
    private CheckBox c1;
    private CheckBox c2;
    private CheckBox c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_uec);
        c1 = findViewById(R.id.cb5c);
        c2 = findViewById(R.id.engMalayC);
        c3 = findViewById(R.id.MathB);
    }

    public void evaluate(View view) {
        if(c1.isChecked() && c2.isChecked() && c3.isChecked())
        {
            Toast.makeText(this,"You can join",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Can try for another Branch", Toast.LENGTH_SHORT).show();
        }
    }
}
