package com.example.wechat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentOne extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentOne() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentOne.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentOne newInstance(String param1, String param2) {
        FragmentOne fragment = new FragmentOne();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

    }
    private ListView friendList;
    private List<Friend> chatList=new ArrayList<Friend>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }



    private void initFruits() {
        for(int i=0;i<2;i++){
            Friend apple=new Friend("宝贝儿", R.drawable.lisa);
            chatList.add(apple);
            Friend banana=new Friend("马哥",R.drawable.mayun);
            chatList.add(banana);
            Friend cherry=new Friend("小马",R.drawable.mahuateng);
            chatList.add(cherry);
            Friend grape=new Friend("王建林叔叔",R.drawable.wangjianlin);
            chatList.add(grape);
            Friend mango=new Friend("东子",R.drawable.liuqiangdong);
            chatList.add(mango);
            Friend orange=new Friend("小军",R.drawable.leijun);
            chatList.add(orange);
            Friend pear=new Friend("小川",R.drawable.trump);
            chatList.add(pear);
            Friend pineapple=new Friend("老婆",R.drawable.yangmi);
            chatList.add(pineapple);
            Friend strawberry=new Friend("乖乖",R.drawable.zhaolusi);
            chatList.add(strawberry);
            Friend watermelon=new Friend("母老虎",R.drawable.dongmingzhu);
            chatList.add(watermelon);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_one,container,false);
        friendList=view.findViewById(R.id.chat_list);
        FriendAdapter fadapter=new FriendAdapter(getActivity(),R.layout.friend_layout,chatList);
        initFruits();
        friendList.setAdapter(fadapter);
        return view;
    }
}