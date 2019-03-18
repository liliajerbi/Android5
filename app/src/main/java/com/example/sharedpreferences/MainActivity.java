package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);
        final SharedPreferences sharePreference = MainActivity.this.getSharedPreferences("com.example.sharedpreferences", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharePreference.edit();
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText rememberMe = findViewById(R.id.rememberMe);
                String rememberLogin = rememberMe.getText().toString();
                editor.putString("save" ,rememberLogin);
                editor.putString("save", rememberLogin);
                editor.apply();
                textView.setText(sharePreference.getString("save", "Empty"));
            }
        });
        textView.setText(sharePreference.getString("save", "Empty"));

    }
}
