package com.example.wechat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTwo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTwo extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentTwo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTwo.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTwo newInstance(String param1, String param2) {
        FragmentTwo fragment = new FragmentTwo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    private ListView friendList;
    private List<Friend> addressList=new ArrayList<Friend>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private void initFruits() {
        for(int i=0;i<3;i++){
            Friend apple=new Friend("宝贝儿", R.drawable.lisa);
            addressList.add(apple);
            Friend banana=new Friend("马哥",R.drawable.mayun);
            addressList.add(banana);
            Friend cherry=new Friend("小马",R.drawable.mahuateng);
            addressList.add(cherry);
            Friend grape=new Friend("王建林叔叔",R.drawable.wangjianlin);
            addressList.add(grape);
            Friend mango=new Friend("东子",R.drawable.liuqiangdong);
            addressList.add(mango);
            Friend orange=new Friend("小军",R.drawable.leijun);
            addressList.add(orange);
            Friend pear=new Friend("小川",R.drawable.trump);
            addressList.add(pear);
            Friend pineapple=new Friend("老婆",R.drawable.yangmi);
            addressList.add(pineapple);
            Friend strawberry=new Friend("乖乖",R.drawable.zhaolusi);
            addressList.add(strawberry);
            Friend watermelon=new Friend("母老虎",R.drawable.dongmingzhu);
            addressList.add(watermelon);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_two,container,false);
        friendList=view.findViewById(R.id.address_list);
        FriendAdapter fadapter=new FriendAdapter(getActivity(),R.layout.friend_layout,addressList);

        initFruits();
        friendList.setAdapter(fadapter);
        return view;
    }
}