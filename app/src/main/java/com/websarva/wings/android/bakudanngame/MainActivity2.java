package com.websarva.wings.android.bakudanngame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    //        ボタン変数の定義
    private Button startButton;
    private Switch vibrationswitch;
//    振動ボタンのon,offを判定する変数
    private boolean onOff = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        ボタンオブジェクトの取得
        startButton = findViewById(R.id.startbutton);
        vibrationswitch = findViewById(R.id.vibration);

//        リスナの設定
        startButton.setOnClickListener(new startListener());
        vibrationswitch.setOnClickListener(new vibrationListener());
    }
//    イベントハンドラの記述
    private class startListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
//            インテントオブジェクトの生成
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
//            第二画面に渡すデータの格納
            intent.putExtra("onOff", onOff);
//            第二画面の起動
            startActivity(intent);
        }
    }

    private class vibrationListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            if (onOff == false){
                onOff = true;
            }
            else {
                onOff = false;
            }
        }
    }
}