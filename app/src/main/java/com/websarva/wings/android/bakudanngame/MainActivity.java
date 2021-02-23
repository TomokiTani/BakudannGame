package com.websarva.wings.android.bakudanngame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    爆弾変数の定義
    private ImageButton bakudann[] = new ImageButton[16];
//    テキスト変数の定義
    private TextView text;
//    ボタン変数の定義
    private Button reset;
    private Button reverse;
//    爆弾の決定
    int bom = (int)(Math.random()*16) + 1;
//    インテント変数の定義
    Intent intent;
//    バイブレーションの機能をon,off判定する変数の定義
    boolean vibrationswitch;
//    outが出たかどうか判定する変数の定義
    boolean out = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        インテントオブジェクトの取得
        intent = getIntent();
        //        渡されたデータを取得
        vibrationswitch = intent.getBooleanExtra("onOff",true);
//        爆弾オブジェクトの取得
        for (int i=0; i<=15; i++){
            String idname = "Bakudann" + (i+1);
            int resID = getResources().getIdentifier(idname, "id",
                    getPackageName());
            bakudann[i] = (ImageButton)findViewById(resID);
            bakudann[i].setOnClickListener(new Listener());
        }
//        テキストオブジェクトの取得
        text = findViewById(R.id.textView);
//        リセットボタンオブジェクトの取得
        reset = findViewById(R.id.reset);
//        戻るボタンオブジェクトの取得
        reverse = findViewById(R.id.reverse);
//        リスナの設定

        reset.setOnClickListener(new resetListener());
        reverse.setOnClickListener(new reverseListener());

    }

    //        イベントハンドラの記述
    private class Listener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            int id = view.getId();
            switch (id){
                case R.id.Bakudann1:
                    if (bom == 1){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[0].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann2:
                    if (bom == 2){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[1].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann3:
                    if (bom == 3){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[2].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann4:
                    if (bom == 4){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[3].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann5:
                    if (bom == 5){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[4].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann6:
                    if (bom == 6){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[5].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann7:
                    if (bom == 7){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[6].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann8:
                    if (bom == 8){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[7].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann9:
                    if (bom == 9){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[8].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann10:
                    if (bom == 10){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[9].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann11:
                    if (bom == 11){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[10].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann12:
                    if (bom == 12){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[11].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann13:
                    if (bom == 13){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[12].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann14:
                    if (bom == 14){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[13].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann15:
                    if (bom == 15){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[14].setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.Bakudann16:
                    if (bom == 16){
                        text.setText("OUT");
                        out = true;

                        if (vibrationswitch == true){
                            ((Vibrator)getSystemService(Context.VIBRATOR_SERVICE)).vibrate(100);
                        }
                    }
                    else{
                        bakudann[15].setVisibility(View.INVISIBLE);
                    }
                    break;
            }
            if( out == true){
                for (int i=0; i<=15 ; i++){
                    bakudann[i].setClickable(false);
                }
            }
        }
    }

    private class resetListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            text.setText("");
            bom = (int)(Math.random()*16) + 1;
            for(int i=0; i<=15; i++){
                bakudann[i].setVisibility(View.VISIBLE);
                bakudann[i].setClickable(true);
            }
            out = false;
        }
    }

    private class reverseListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            finish();
        }
    }
}