package com.wukun.databinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.wukun.databinding.R;
import com.wukun.databinding.databinding.ActivityBasicBinding;
import com.wukun.databinding.model.User;

/*
 *  @项目名：  MVVMDemo
 *  @包名：    com.wukun.databinding.view
 *  @文件名:   BasicActivity
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 11:04
 *  @描述：    基本用法
 */

public class BasicActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //1.获取ViewDataBinding对象
    ActivityBasicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic);
    //2.获取数据
    User user = new User("卡卡洛特",24,"www.hao123.com");
    //3.绑定数据
    binding.setUser(user);
  }
}
