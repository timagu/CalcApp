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

        //やりたい四則演算子を押す
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

        PlusButton.setOnClickListener(new View.OnClickListener(){
            public void OnClick(View v){
                //SecondActivity.javaへ遷移
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
