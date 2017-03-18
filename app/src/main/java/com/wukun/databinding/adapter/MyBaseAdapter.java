package com.wukun.databinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/*
 *  @项目名：  MVVMDemo 
 *  @包名：    com.wukun.databinding.adapter
 *  @文件名:   MyBaseAdapter
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/3/18 13:43
 *  @描述：    TODO
 */

public class MyBaseAdapter<T> extends BaseAdapter {
  private List<T> list; //传入的数据集合
  private int layoutId; //item布局的资源id
  private int variableId; //系统自动生成的
  private LayoutInflater mInflater;

  public MyBaseAdapter(Context context, List<T> list, int layoutId, int variableId) {
    this.list = list;
    this.layoutId = layoutId;
    this.variableId = variableId;
    mInflater = LayoutInflater.from(context);
  }

  @Override public int getCount() {
    return list.size() == 0 ? 0 : list.size();
  }

  @Override public Object getItem(int position) {
    return list.get(position);
  }

  @Override public long getItemId(int position) {
    return position;
  }

  @Override public View getView(int position, View convertView, ViewGroup viewGroup) {
    ViewDataBinding binding;
    if (convertView == null) {
      //注意布局加载方式为DataBindingUtil类中的inflate方法
      binding = DataBindingUtil.inflate(mInflater, layoutId, viewGroup, false);
    } else {
      binding = DataBindingUtil.getBinding(convertView);
    }
    binding.setVariable(variableId, list.get(position));
    return binding.getRoot();
  }
}
