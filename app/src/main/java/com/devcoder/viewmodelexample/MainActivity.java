package com.devcoder.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTextView = findViewById(R.id.tvNumber);
        MyViewModel model= ViewModelProviders.of(this).get(MyViewModel.class);
        String myRandomNumber=model.getNumber();
        mTextView.setText(myRandomNumber);
    }
}
