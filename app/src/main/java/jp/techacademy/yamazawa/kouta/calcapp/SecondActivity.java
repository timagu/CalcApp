package jp.techacademy.yamazawa.kouta.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;

import javax.xml.transform.TransformerFactoryConfigurationError;

public class SecondActivity extends AppCompatActivity {
    //結果表示

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_second);
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.textView);
        Double Anser = intent.getDoubleExtra("ANSWER",0.0);

        textView.setText(String.valueOf(Anser));

        /*if (v.getId() == R.id.button1) {
            textView.setText(value1 + "＋" + value2 + "=" + String.valueOf(value1_double + value2_double));
        } else if (v.getId() == R.id.button2) {
            textView.setText(value1 + "－" + value2 + "=" + String.valueOf(value1_double - value2_double));
        } else if (v.getId() == R.id.button3) {
            textView.setText(value1 + "×" + value2 + "=" + String.valueOf(value1_double * value2_double));
        } else if (v.getId() == R.id.button4) {
            textView.setText(value1 + "÷" + value2 + "=" + String.valueOf(value1_double / value2_double));
        }*/
    }
}
