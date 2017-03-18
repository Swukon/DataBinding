package com.wukun.databinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.wukun.databinding.R;
import com.wukun.databinding.databinding.ActivityImageBinding;
import com.wukun.databinding.model.Image;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.wukun.databinding.view
 *  @文件名:   ImageActivity
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 11:04
 *  @描述：    显示图片
 */

public class ImageActivity extends AppCompatActivity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //1.获取ViewDataBinding对象
    ActivityImageBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_image);
    //2.获取数据
    Image image = new Image("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3552326974,2224462816&fm=23&gp=0.jpg");
    //3.绑定数据
    binding.setImage(image);
  }
}
