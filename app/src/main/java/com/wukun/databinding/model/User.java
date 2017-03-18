package com.wukun.databinding.model;
/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.wukun.databinding.model
 *  @文件名:   User
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 0:42
 *  @描述：    TODO
 */

public class User {
  public String name;
  public String myBlog;
  public int age;

  public void setName(String name) {
    this.name = name;
  }

  public User(String name,  int age,String myBlog) {
    this.name = name;
    this.age = age;
    this.myBlog = myBlog;
  }

  public void setMyBlog(String myBlog) {

    this.myBlog = myBlog;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getMyBlog() {
    return myBlog;
  }

  public int getAge() {
    return age;
  }

}
