package com.wukun.databinding.model;
/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.wukun.databinding.model
 *  @文件名:   Beauty
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 13:36
 *  @描述：    TODO
 */

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class Beauty {
  public String beautyNum;
  public String imageUrl;

  public Beauty(String beautyNum, String imageUrl) {
    this.beautyNum = beautyNum;
    this.imageUrl = imageUrl;
  }

  @BindingAdapter({"imageUrl"})
  public static void beautyImage(ImageView imageView, String url) {
    Glide.with(imageView.getContext()).load(url).into(imageView);
  }
}
