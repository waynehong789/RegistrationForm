package com.example.hasee.registrationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClicked(View aView){

        String FN = ((EditText)findViewById(R.id.editTextFN)).getText().toString();
        String LN = ((EditText)findViewById(R.id.editTextLN)).getText().toString();
        TextView resultView = (TextView)findViewById(R.id.textViewResult);
        resultView.setText("Congratulations"+ " "+ FN+ " " + LN + ". Your registration was succesfully.");
    }
}
