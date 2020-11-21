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
 * Use the {@link FragmentFour#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentFour extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentFour() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentFour.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentFour newInstance(String param1, String param2) {
        FragmentFour fragment = new FragmentFour();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    private ListView friendList;
    private List<Friend> serviceList=new ArrayList<Friend>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private void initFruits() {
        for(int i=0;i<1;i++){
            Friend apple=new Friend("朋友圈", R.drawable.ground);
            serviceList.add(apple);
            Friend banana=new Friend("支付",R.drawable.pay);
            serviceList.add(banana);
            Friend cherry=new Friend("扫一扫",R.drawable.sweep);
            serviceList.add(cherry);
            Friend grape=new Friend("收藏",R.drawable.collection);
            serviceList.add(grape);
            Friend mango=new Friend("相册",R.drawable.photo);
            serviceList.add(mango);
            Friend orange=new Friend("卡包",R.drawable.cardbag);
            serviceList.add(orange);
            Friend pear=new Friend("表情",R.drawable.expression);
            serviceList.add(pear);
            Friend pineapple=new Friend("设置",R.drawable.setting);
            serviceList.add(pineapple);

        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_four,container,false);
        friendList=view.findViewById(R.id.service_list);
        ServiceAdapter sadapter=new ServiceAdapter(getActivity(),R.layout.service_layout,serviceList);
        initFruits();
        friendList.setAdapter(sadapter);
        return view;
    }
}