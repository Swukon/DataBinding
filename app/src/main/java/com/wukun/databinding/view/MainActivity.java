package com.wukun.databinding.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.wukun.databinding.R;

/*
 *  @项目名：  MVVMDemo
 *  @包名：    com.wukun.mvvmdemo.view
 *  @文件名:   MainActivity
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 11:04
 *  @描述：    主页面
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private Button btnBasic, btnImage, btnMore, btnClick, btnListView, btnDataNotify;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btnDataNotify = (Button) findViewById(R.id.btnDataNotify);
    btnListView = (Button) findViewById(R.id.btnListView);
    btnBasic = (Button) findViewById(R.id.btnBasic);
    btnImage = (Button) findViewById(R.id.btnImage);
    btnMore = (Button) findViewById(R.id.btnMore);
    btnClick = (Button) findViewById(R.id.btnClick);
    btnDataNotify.setOnClickListener(this);
    btnListView.setOnClickListener(this);
    btnClick.setOnClickListener(this);
    btnBasic.setOnClickListener(this);
    btnImage.setOnClickListener(this);
    btnMore.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    Intent intent = null;
    switch (v.getId()) {
      case R.id.btnBasic:
        intent = new Intent(MainActivity.this, BasicActivity.class);
        startActivity(intent);
        break;
      case R.id.btnImage:
        intent = new Intent(MainActivity.this, ImageActivity.class);
        startActivity(intent);
        break;
      case R.id.btnMore:
        intent = new Intent(MainActivity.this, MoreMethodActivity.class);
        startActivity(intent);
        break;
      case R.id.btnClick:
        intent = new Intent(MainActivity.this, ClickActivity.class);
        startActivity(intent);
        break;
      case R.id.btnListView:
        intent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
        break;
      case R.id.btnDataNotify:
        intent = new Intent(MainActivity.this, DataNotifyActivity.class);
        startActivity(intent);
        break;
      default:
        break;
    }
  }
}
