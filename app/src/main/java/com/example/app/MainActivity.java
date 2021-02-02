package com.example.app;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setText(View view){
        TextView textView = (TextView) findViewById(R.id.textView3);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName2);
        textView.setText(editText.getEditableText());
    }
}