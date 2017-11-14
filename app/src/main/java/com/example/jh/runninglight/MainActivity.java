package com.example.jh.runninglight;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * 自定义跑马灯效果！
 */
public class MainActivity extends AppCompatActivity {

    private MarqueeTextView marqueeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marqueeTextView =(MarqueeTextView)findViewById(R.id.tv_scroll);

        ViewGroup.MarginLayoutParams margin1 = new ViewGroup.MarginLayoutParams(
                marqueeTextView.getLayoutParams());
        margin1.setMargins(283,0,0,0);//设置滚动区域位置：在左边距400像素，顶边距10像素的位置
        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(margin1);
        layoutParams1.height =160;//设滚动区域高度
        layoutParams1.width =800; //设置滚动区域宽度

        marqueeTextView.setLayoutParams(layoutParams1);
        marqueeTextView.setScrollWidth(800);
        marqueeTextView.setCoordinateY(150);
        marqueeTextView.setCurrentPosition(800);//设置滚动信息从滚动区域的右边出来
        marqueeTextView.setSpeed(5);
        marqueeTextView.setTextColor(Color.BLACK);

        marqueeTextView.setText("我是滚动字幕啊12345，我是滚动字幕啊12345");
    }
}
