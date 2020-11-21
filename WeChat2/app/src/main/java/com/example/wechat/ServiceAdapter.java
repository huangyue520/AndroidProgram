package com.example.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ServiceAdapter extends ArrayAdapter<Friend> {
    private int resourceId;
    public ServiceAdapter(Context context, int textViewResourceId,
                         List<Friend> objects) {
        super(context, textViewResourceId,objects);
        resourceId=textViewResourceId;
    }


    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        Friend friend=getItem(position);//获取当前fruit实例
        View view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        ImageView friendIcon=(ImageView) view.findViewById(R.id.service_icon);
        TextView friendName=(TextView) view.findViewById(R.id.service_name);friendIcon.setImageResource(friend.getImageId());
        friendName.setText(friend.getName());
        return view;
    }
}
