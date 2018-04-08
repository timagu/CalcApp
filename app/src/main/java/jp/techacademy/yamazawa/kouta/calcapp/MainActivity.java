package jp.techacademy.yamazawa.kouta.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    //コンストラクタ
    EditText mEditText1;
    EditText mEditText2;

    //状態保存
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //数値を入力する。//数値データを格納
        //ID「editText1」の値をmEditText1に代入
        mEditText1 = (EditText) findViewById(R.id.editText1);
        //ID「editText1」の値をmEditText1に代入
        mEditText2 = (EditText) findViewById(R.id.editText2);


        //SecondActivity.javaへ遷移
        // －ボタンを押した場合
        //SecondActivity.javaへ遷移
        // ×ボタンを押した場合
        //SecondActivity.javaへ遷移
        // ÷ボタンを押した場合
        //SecondActivity.javaへ遷移

        // ＋ボタンを押した場合
        //id button1の値をPulsButtonへ代入
        Button PlusButton = (Button) findViewById(R.id.button1);
        Button MinusButton = (Button) findViewById(R.id.button2);
        Button MultiplButton = (Button) findViewById(R.id.button3);
        Button divisionButton = (Button) findViewById(R.id.button4);

        PlusButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //SecondActivity.javaへ遷移
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                mEditText1.getText().toString();

                //コンストラクタ
                String str1 = mEditText1.getText().toString();
                String str2 = mEditText2.getText().toString();
                String value1 = intent.getStringExtra("VALUE1");
                String value2 = intent.getStringExtra("VALUE2");
                Double value1_double = Double.parseDouble(value1);
                Double value2_double = Double.parseDouble(value2);
                Double Anser = 0.0;

                //やりたい四則演算子を押す
                    //＋ボタンを押した場合
                if (v.getId() == R.id.button1) {
                    Anser = value1_double + value2_double;
                    // －ボタンを押した場合
                } else if (v.getId() == R.id.button2) {
                    Anser = value1_double - value2_double;
                    // ×ボタンを押した場合
                } else if (v.getId() == R.id.button3) {
                    Anser = value1_double * value2_double;
                    // ÷ボタンを押した場合
                } else if (v.getId() == R.id.button4) {
                    Anser = value1_double / value2_double;
                }

                intent.putExtra("ANSWER",Anser);
                //str1をVALUE1へ遷移
                //intent.putExtra("VALUE1", str1);
                //str1をVALUE1へ遷移
                //intent.putExtra("VALUE2", str2);

                //SecondActivity.javaへ遷移(画面遷移)
                startActivity(intent);

            }
        });
    }
}
