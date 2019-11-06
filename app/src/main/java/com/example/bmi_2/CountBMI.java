package com.example.bmi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;

public class CountBMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_bmi);


        Bundle bundle = getIntent().getExtras();
        String height = bundle.getString("height" );
        String width = bundle.getString("width");

        float fh = Float.parseFloat(height);      // 取得 身高輸入值
        float fw = Float.parseFloat(width);     // 取得 體重輸入值
        float fresult;                                     // BMI值 計算結果
        TextView result = (TextView)findViewById(R.id.tv3);// 取得 顯示結果 物件
        fh = fh/100; // 計算BMI
        fh = fh*fh;  // 計算BMI

        NumberFormat nf = NumberFormat.getInstance();   // 數字格式
        nf.setMaximumFractionDigits(2);                 // 限制小數第二位
        fresult = fw/fh;                                // 計算BMI
        result.setText(nf.format(fw/fh) );           // 顯示BMI計算結果
        TextView dia = (TextView)findViewById(R.id.tv4);// 取得 顯示診斷 物件
        // 診斷結果 顯示
        if (fresult<18.5)
            dia.setText("體重過輕");
        else if (18.5 <= fresult && fresult< 24)
            dia.setText("正常範圍");
        else if (24 <=fresult && fresult < 27)
            dia.setText("過    重");
        else if (27 <=fresult && fresult < 30)
            dia.setText("輕度肥胖");
        else if (30 <= fresult && fresult < 35)
            dia.setText("中度肥胖");
        else if (fresult >= 35)
            dia.setText("重度肥胖        ");




    }
}
