package com.example.dell.transferdata;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1,number2;
    Button send;
    TextView resulttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this,"Inside On Create",Toast.LENGTH_SHORT).show();

        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        send = findViewById(R.id.send);
        resulttext = findViewById(R.id.resulttext);

    }

    public void datasend(View v)
    {
        String n1,n2;


        n1 = number1.getText().toString();

        n2 = number2.getText().toString();

        Intent intent = new Intent(MainActivity.this,other.class);
        if(n1.isEmpty()|| n2.isEmpty())
        {
            Toast.makeText(this, "insert Numbers...", Toast.LENGTH_SHORT).show();
        }else {
            intent.putExtra("number1", n1);
            intent.putExtra("number2", Integer.parseInt(n2));
            startActivityForResult(intent, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==1)
        {
            if(resultCode==RESULT_OK)
            {
                int ans = data.getIntExtra("result",0);
                resulttext.setText("result : "+ans);
            }else
            {
                Toast.makeText(this,"invalid step",Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"On Start",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"On Resume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"On Restart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"On Stop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"On Destroy",Toast.LENGTH_SHORT).show();
    }
}
