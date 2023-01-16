package com.example.sumoftwonumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        textView = findViewById(R.id.output);
        button = findViewById(R.id.calculate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Is it working!", Toast.LENGTH_SHORT).show();
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
//                Toast.makeText(MainActivity.this, "sum is " + sum, Toast.LENGTH_SHORT).show();
                textView.setText("sum is " + sum);
            }

        });
    }
}