package com.wukun.databinding.model;
/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.wukun.databinding.model
 *  @文件名:   Student
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 12:11
 *  @描述：    学生类
 */

public class Person {
  private String name;
  private String myBlog;
  private Boolean isPerson;

  public Person(String name, String myBlog) {
    this.name = name;
    this.myBlog = myBlog;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMyBlog(String myBlog) {
    this.myBlog = myBlog;
  }

  public void setPerson(Boolean person) {
    isPerson = person;
  }

  public String getName() {
    return name;
  }

  public String getMyBlog() {
    return myBlog;
  }

  public Boolean getPerson() {
    return isPerson;
  }
}
