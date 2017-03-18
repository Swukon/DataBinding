package com.wukun.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.wukun.mvvmdemo.model
 *  @文件名:   Teacher
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 20:33
 *  @描述：    TODO
 */

public class Teacher extends BaseObservable {
  //使用DataBinding提供的ObservableFields来创建实体类
  public ObservableField<String> name = new ObservableField<>();
  public ObservableField<String> number = new ObservableField<>();

  public Teacher() {
  }

  public Teacher(String name, String number) {
    this.name.set(name);
    this.number.set(number);
  }
}
