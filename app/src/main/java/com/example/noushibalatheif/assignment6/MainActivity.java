package com.example.noushibalatheif.assignment6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonClicked(View v)
    {
        EditText editext=(EditText)findViewById(R.id.editext);

        TextView textview=(TextView)findViewById(R.id.textview);


        String i=editext.getText().toString();


        textview.setText(i);
    }
}
