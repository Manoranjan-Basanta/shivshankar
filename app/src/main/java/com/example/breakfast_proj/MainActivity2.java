package com.example.breakfast_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
public class MainActivity2 extends AppCompatActivity {
  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.textView) ;
        TextView textView = findViewById(R.id.textView);
        String sentence = "This is a colorful sentence";
        SpannableString spannableString = new SpannableString(sentence);
        spannableString.setSpan(new ForegroundColorSpan(Color.RED), 0, 4, 0);
        spannableString.setSpan(new ForegroundColorSpan(Color.BLUE), 5, 7, 0);
        spannableString.setSpan(new ForegroundColorSpan(Color.GREEN), 8, 9, 0);
        spannableString.setSpan(new ForegroundColorSpan(Color.YELLOW), 10, 18, 0);
        spannableString.setSpan(new ForegroundColorSpan(Color.MAGENTA), 19, 27, 0);
        textView.setText(spannableString);
    }
}