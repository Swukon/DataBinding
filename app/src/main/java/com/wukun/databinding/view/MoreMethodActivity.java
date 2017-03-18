package com.wukun.databinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.wukun.databinding.R;
import com.wukun.databinding.databinding.ActivityMoreMethodBinding;
import com.wukun.databinding.model.Person;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.wukun.databinding.view
 *  @文件名:   MoreMethodActivity
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 11:04
 *  @描述：    更多用法
 */

public class MoreMethodActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //1.获取ViewDataBinding对象
    ActivityMoreMethodBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_more_method);
    //2.获取数据
    Person person = new Person("百事可乐","www.google.cn");
    person.setPerson(true);
    //3.绑定数据
    binding.setPerson(person);
  }
}
