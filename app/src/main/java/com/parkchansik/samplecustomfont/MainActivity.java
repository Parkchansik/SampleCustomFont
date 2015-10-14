package com.parkchansik.samplecustomfont;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.text_message);
        tv.setTypeface(FontManager.getInstance().getTypeface(this, FontManager.NANUM));//모르는 부분은 아니다 알긴아는데 어렵네
    }
}
