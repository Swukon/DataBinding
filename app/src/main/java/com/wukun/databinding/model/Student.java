package com.wukun.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.wukun.databinding.BR;



/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.wukun.databinding.model
 *  @文件名:   Student
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 20:28
 *  @描述：    TODO
 */

public class Student extends BaseObservable {
  @Bindable  //给需要改变的字段的get方法添加上@Bindable注解
  public String name;
  @Bindable
  public String number;

  public Student(String name, String number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public String getNumber() {
    return number;
  }

  public void setName(String name) {
    this.name = name;
    //给需要改变的字段的set方法加上notifyPropertyChanged(BR.xxxx);
    notifyPropertyChanged(BR.name);
  }

  public void setNumber(String number) {
    this.number = number;
    notifyPropertyChanged(BR.number);
  }
}
