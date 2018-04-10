package jp.techacademy.yamazawa.kouta.calcapp;

import android.app.Dialog;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.app.AlertDialog;

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


        //数字の場合
        View.OnClickListener myOnClickListener = new View.OnClickListener(){
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


                //入力した数値が、何か？
                if (mEditText1.getText().toString().isEmpty() || mEditText2.getText().toString().isEmpty()){
                    //ゼロの場合
                    showAlertDialog();// こちらでエラーの場合のメッセージをいれる
                    return;
                }

                try {
                    //String→Double変換
                    Double value1_double = Double.parseDouble(str1);
                    Double value2_double = Double.parseDouble(str2);
                    switch (v.getId()) {
                        case R.id.button1:
                            Anser = value1_double + value2_double;
                            break;
                        case R.id.button2:
                            Anser = value1_double - value2_double;
                            break;
                        case R.id.button3:
                            Anser = value1_double * value2_double;
                            break;
                        case R.id.button4:
                            Anser = value1_double / value2_double;
                            break;
                    }
                }catch (NumberFormatException e){
                    showAlertDialog();
                    return;
                }

                //anserの値ををANSWERへ渡す
                intent.putExtra("ANSWER",Anser);

                //SecondActivity.javaへ遷移(画面遷移)
                startActivity(intent);
            }
        };



        Button PlusButton = (Button) findViewById(R.id.button1);
        PlusButton.setOnClickListener(myOnClickListener);

        Button MinusButton = (Button) findViewById(R.id.button2);
        MinusButton.setOnClickListener(myOnClickListener);

        Button MultiplButton = (Button) findViewById(R.id.button3);
        MultiplButton.setOnClickListener(myOnClickListener);

        Button DivisionButton = (Button) findViewById(R.id.button4);
        DivisionButton.setOnClickListener(myOnClickListener);
    }

    private void  showAlertDialog(){
        // AlertDialog.Builderクラスを使ってAlertDialogの準備をする
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("入力エラー");
        alertDialogBuilder.setMessage("英数字を入力して下さい。");
        alertDialogBuilder.setPositiveButton("OK", null);
        alertDialogBuilder.show();
    }
}
