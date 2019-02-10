package com.example.dell.transferdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class other extends AppCompatActivity {

    TextView text;
    Button add,sub;
    String s1;
    int n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Intent i = getIntent();
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        text = findViewById(R.id.text);
        s1 = i.getStringExtra("number1");
        n2 = i.getIntExtra("number2",0);
        text.setText("numbers are : "+s1+" , "+n2);
    }

    public void addNumber(View view) {
        int result = Integer.parseInt(s1)+n2;
        Intent i = new Intent();
        i.putExtra("result",result);
        setResult(RESULT_OK,i);
        finish();
    }

    public void subNumber(View view) {
        int result = Integer.parseInt(s1)-n2;
        Intent i = new Intent();
        i.putExtra("result",result);
        setResult(RESULT_OK,i);
        finish();
    }
}
