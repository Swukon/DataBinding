package com.wukun.databinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.wukun.databinding.R;
import com.wukun.databinding.databinding.ActivityClickBinding;

/*
 *  @项目名：  MVVMDemo
 *  @包名：    com.wukun.databinding.view
 *  @文件名:   ClickActivity
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 11:04
 *  @描述：    点击事件
 */

public class ClickActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //1.获取ViewDataBinding对象
    ActivityClickBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_click);
    //事件绑定 -- 单击
    binding.setMyClick( new View.OnClickListener(){

      @Override public void onClick(View view) {
        Toast.makeText(ClickActivity.this,"发生了点击事件",Toast.LENGTH_SHORT).show();
      }
    });

    //事件绑定 -- 长按
  binding.btnLongClick.setOnLongClickListener(new View.OnLongClickListener(){

    @Override public boolean onLongClick(View view) {
      Toast.makeText(ClickActivity.this,"发生了长按事件",Toast.LENGTH_SHORT).show();
      return false;
    }
  });

  }
}
