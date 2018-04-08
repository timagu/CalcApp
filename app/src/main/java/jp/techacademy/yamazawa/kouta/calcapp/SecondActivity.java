package jp.techacademy.yamazawa.kouta.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    //結果表示

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_second);
        Intent intent = getIntent();
        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");
        Double value1_double = Double.parseDouble(value1);
        Double value2_double = Double.parseDouble(value2);
        TextView textView = (TextView) findViewById(R.id.textView);

        public void onClick(View v) {
            if (v.getId() == R.id.button1) {
                textView.setText(value1 + "＋" + value2 + "=" + String.valueOf(value1_double + value2_double));
            } else if (v.getId() == R.id.button2) {
                textView.setText(value1 + "－" + value2 + "=" + String.valueOf(value1_double - value2_double));
            } else if (v.getId() == R.id.button3) {
                textView.setText(value1 + "×" + value2 + "=" + String.valueOf(value1_double * value2_double));
            } else if (v.getId() == R.id.button4) {
                textView.setText(value1 + "÷" + value2 + "=" + String.valueOf(value1_double / value2_double));
            }
        }
        /*Intent intent = getIntent();
        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");
        Double value1_double = Double.parseDouble(value1);
        Double value2_double = Double.parseDouble(value2);
        TextView textView = (TextView) findViewById(R.id.textView);*/


    }
}
