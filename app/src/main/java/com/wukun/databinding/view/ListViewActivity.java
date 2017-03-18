package com.wukun.databinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.wukun.databinding.BR;
import com.wukun.databinding.R;
import com.wukun.databinding.adapter.MyBaseAdapter;
import com.wukun.databinding.databinding.ActivityListviewBinding;
import com.wukun.databinding.model.Beauty;
import java.util.ArrayList;
import java.util.List;



/*
 *  @项目名：  MVVMDemo
 *  @包名：    com.wukun.databinding.view
 *  @文件名:   ListViewActivity
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 11:04
 *  @描述：    ListView用法
 */

public class ListViewActivity extends AppCompatActivity {
  private List<Beauty> list;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //1.获取ViewDataBinding对象
    ActivityListviewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_listview);
    list = new ArrayList<>();
    //加载数据
    initData();

    MyBaseAdapter<Beauty>
        adapter = new MyBaseAdapter<>(ListViewActivity.this, list, R.layout.item_listview, BR.beauty);
    //绑定数据
    binding.setAdapter(adapter);

  }

  private void initData() {
    Beauty beauty1 = new Beauty("第一个美女", "https://ss0.baidu.com/7Po3dSag_xI4khGko9WTAnF6hhy/image/h%3D360/sign=09dbe94f0e33874483c5297a610ed937/55e736d12f2eb93864afcdedd7628535e4dd6feb.jpg");
    Beauty beauty2 = new Beauty("第二个美女", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490423169&di=fc6192e335271872c0a64ad9de96c89f&imgtype=jpg&er=1&src=http%3A%2F%2Ff.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Fb151f8198618367a9f738e022a738bd4b21ce573.jpg");
    Beauty beauty3 = new Beauty("第三个美女", "https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D360/sign=f87618dd0e33874483c5297a610ed937/55e736d12f2eb93895023c7fd7628535e4dd6fcb.jpg");
    Beauty beauty4 = new Beauty("第四个美女", "https://ss2.baidu.com/-vo3dSag_xI4khGko9WTAnF6hhy/image/h%3D360/sign=b9a4961ad71b0ef473e89e58edc451a1/b151f8198618367ac7d2a1e92b738bd4b31ce5af.jpg");
    Beauty beauty5 = new Beauty("第五个美女", "https://ss3.baidu.com/9fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D360/sign=bb3bb9c96981800a71e58f08813433d6/d50735fae6cd7b89f4327ac50a2442a7d9330e1d.jpg");
    list.add(beauty1);
    list.add(beauty2);
    list.add(beauty3);
    list.add(beauty4);
    list.add(beauty5);
  }
}
