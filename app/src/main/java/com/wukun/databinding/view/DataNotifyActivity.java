package com.wukun.databinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.wukun.databinding.R;
import com.wukun.databinding.databinding.ActivityDataNotifyBinding;
import com.wukun.databinding.model.Student;
import com.wukun.databinding.model.Teacher;

/*
 *  @项目名：  MVVMDemo
 *  @包名：    com.wukun.databinding.view
 *  @文件名:   DataNotifyActivity
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 11:04
 *  @描述：    数据更新
 */

public class DataNotifyActivity extends AppCompatActivity {
  private Student student;
  private Teacher teacher;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //1.获取ViewDataBinding对象
    ActivityDataNotifyBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_notify);
    //2.获取数据
    student = new Student("小学生", "11111");
    binding.setStudent(student);
    teacher = new Teacher("老师", "0x00");
    binding.setTeacher(teacher);
    //点击按钮，更新数据,同时更新UI
    binding.btnStudent.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        student.setName("放学别走");
        student.setNumber("55555");
      }
    });

    binding.btnTeacher.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        teacher.name.set("李老师上课");
        teacher.number.set("0x1111");
      }
    });
  }
}
