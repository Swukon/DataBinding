package com.wukun.databinding.model;
/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.wukun.databinding.model
 *  @文件名:   Image
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 11:52
 *  @描述：    image实体类
 */

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class Image {

  public String imageUrl;

  public Image(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * 使用ImageLoader显示图片
   */
  @BindingAdapter({ "imageUrl" }) //添加自定义属性@BindingAdapter({"imageUrl"})
  public static void imageLoader(ImageView imageView, String url) {
    //方法必须声明是static，否则会报错。
    Glide.with(imageView.getContext()).load(url).into(imageView);
  }
}
