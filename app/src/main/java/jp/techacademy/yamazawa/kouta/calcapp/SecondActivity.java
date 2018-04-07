package jp.techacademy.yamazawa.kouta.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    //結果表示
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_second);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");
        Double.parseDouble(value1);
        Double.parseDouble(value2);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value1 + value2));
    }

}
