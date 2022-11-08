package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button btn;
    private EditText edA, edB, edC;
    private int counter = 0;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        edA = findViewById(R.id.editTextA);

        String a_value = edA.getText().toString(); // "4"

        // R - класс Resources
        btn.setOnClickListener(view -> {
            counter++;
            tv.setText(Integer.toString(counter));
        });

    }

/*
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {

        } else {

        }
    }

 */
}