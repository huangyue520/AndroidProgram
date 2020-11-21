package com.example.wechat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EnterAdapter extends RecyclerView.Adapter<EnterAdapter.ViewHolder> {
    private ArrayList<Friend> friendList;

    @NonNull


    @Override
    public void onBindViewHolder(EnterAdapter.ViewHolder holder, int position) {
        Friend friend = friendList.get(position);
        holder.entertainmenticon.setImageResource(friend.getImageId());
        holder.entertainmentname.setText(friend.getName());
    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }



    static class ViewHolder extends RecyclerView.ViewHolder{
        View friendView;
        ImageView entertainmenticon;
        TextView entertainmentname;
        public ViewHolder(View view){
            super(view);
            friendView = view;
            entertainmenticon =(ImageView)view.findViewById(R.id.entertainment_icon);
            entertainmentname =(TextView)view.findViewById(R.id.entertainment_name);
        }
    }

    public EnterAdapter(FragmentActivity activity, int entertainment_layout, ArrayList<Friend> friendList){
        this.friendList =friendList;
    }

    @Override
    public EnterAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.entertainment_layout,parent,false);
        final ViewHolder holder = new ViewHolder(view);
//        holder.friendView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int position = holder.getAbsoluteAdapterPosition();
//                Friend friend = friendList.get(position);
//                Toast.makeText(v.getContext(),"you clicked view"+friend.getName(), Toast.LENGTH_SHORT).show();
//            }
//        });
//        holder.entertainmenticon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int position = holder.getAbsoluteAdapterPosition();
//                Friend friend = friendList.get(position);
//                Toast.makeText(v.getContext(),"you clicked image"+friend.getName(), Toast.LENGTH_SHORT).show();
//            }
//        });
        return holder;
    }


}

