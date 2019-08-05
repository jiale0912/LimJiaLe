package com.example.limjiale;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class UEC extends Activity {
    private CheckBox c1;
    private CheckBox c2;
    private CheckBox c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_uec);
        c1 = findViewById(R.id.cb3B);
        c2 = findViewById(R.id.engC);
        c3 = findViewById(R.id.MathB);
    }

    public void submit(View view) {
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
