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

        //id button1の値をPulsButtonへ代入
        Button PlusButton = (Button) findViewById(R.id.button1);
        //id button2の値をMinusButtonへ代入
        Button MinusButton = (Button) findViewById(R.id.button2);
        //id button3の値をMultiplButtonへ代入
        Button MultiplButton = (Button) findViewById(R.id.button3);
        //id button4の値をDivisionButtonへ代入
        Button DivisionButton = (Button) findViewById(R.id.button4);

        PlusButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //SecondActivity.javaへ遷移
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                mEditText1.getText().toString();

                //コンストラクタ
                Double Anser = 0.0;

                //テキストボックスに入力された文字列を取得
                String str1 = mEditText1.getText().toString();
                String str2 = mEditText2.getText().toString();

                //str1の値をVALUE1へ渡す
                intent.putExtra("VALUE1", str1);
                //str1の値をVALUE1へ渡す
                intent.putExtra("VALUE2", str2);

                //String→Double変換
                Double value1_double = Double.parseDouble(str1);
                Double value2_double = Double.parseDouble(str2);

                Anser = value1_double + value2_double;

                //anserの値ををANSWERへ渡す
                intent.putExtra("ANSWER",Anser);

                //SecondActivity.javaへ遷移(画面遷移)
                startActivity(intent);

            }
        });

        MinusButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //SecondActivity.javaへ遷移
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                mEditText1.getText().toString();

                //コンストラクタ
                Double Anser = 0.0;

                //テキストボックスに入力された文字列を取得
                String str1 = mEditText1.getText().toString();
                String str2 = mEditText2.getText().toString();

                //str1の値をVALUE1へ渡す
                intent.putExtra("VALUE1", str1);
                //str1の値をVALUE1へ渡す
                intent.putExtra("VALUE2", str2);

                //String→Double変換
                Double value1_double = Double.parseDouble(str1);
                Double value2_double = Double.parseDouble(str2);

                Anser = value1_double - value2_double;

                //anserの値ををANSWERへ渡す
                intent.putExtra("ANSWER",Anser);

                //SecondActivity.javaへ遷移(画面遷移)
                startActivity(intent);

            }
        });

        MultiplButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //SecondActivity.javaへ遷移
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                mEditText1.getText().toString();

                //コンストラクタ
                Double Anser = 0.0;

                //テキストボックスに入力された文字列を取得
                String str1 = mEditText1.getText().toString();
                String str2 = mEditText2.getText().toString();

                //str1の値をVALUE1へ渡す
                intent.putExtra("VALUE1", str1);
                //str1の値をVALUE1へ渡す
                intent.putExtra("VALUE2", str2);

                //String→Double変換
                Double value1_double = Double.parseDouble(str1);
                Double value2_double = Double.parseDouble(str2);

                Anser = value1_double * value2_double;

                //anserの値ををANSWERへ渡す
                intent.putExtra("ANSWER",Anser);

                //SecondActivity.javaへ遷移(画面遷移)
                startActivity(intent);

            }
        });

        DivisionButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //SecondActivity.javaへ遷移
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                mEditText1.getText().toString();

                //コンストラクタ
                Double Anser = 0.0;

                //テキストボックスに入力された文字列を取得
                String str1 = mEditText1.getText().toString();
                String str2 = mEditText2.getText().toString();

                //str1の値をVALUE1へ渡す
                intent.putExtra("VALUE1", str1);
                //str1の値をVALUE1へ渡す
                intent.putExtra("VALUE2", str2);

                //String→Double変換
                Double value1_double = Double.parseDouble(str1);
                Double value2_double = Double.parseDouble(str2);

                Anser = value1_double / value2_double;

                //anserの値ををANSWERへ渡す
                intent.putExtra("ANSWER",Anser);

                //SecondActivity.javaへ遷移(画面遷移)
                startActivity(intent);

            }
        });
    }
}
