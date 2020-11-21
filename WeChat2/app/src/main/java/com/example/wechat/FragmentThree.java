package com.example.wechat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentThree#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentThree extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentThree() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentThree.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentThree newInstance(String param1, String param2) {
        FragmentThree fragment = new FragmentThree();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    private  RecyclerView friendList;
    List<Friend> entertainmentList=new ArrayList<>();
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
            Friend apple=new Friend("附近", R.drawable.around);
            entertainmentList.add(apple);
            Friend banana=new Friend("游戏",R.drawable.game);
            entertainmentList.add(banana);
            Friend cherry=new Friend("音乐",R.drawable.music);
            entertainmentList.add(cherry);
            Friend grape=new Friend("阅读",R.drawable.read);
            entertainmentList.add(grape);
            Friend mango=new Friend("购物",R.drawable.shopping);
            entertainmentList.add(mango);
            Friend orange=new Friend("直播",R.drawable.live);
            entertainmentList.add(orange);
            Friend pear=new Friend("运动",R.drawable.sport);
            entertainmentList.add(pear);
            Friend pineapple=new Friend("美食",R.drawable.food);
            entertainmentList.add(pineapple);
            Friend strawberry=new Friend("自习室",R.drawable.study);
            entertainmentList.add(strawberry);
            Friend watermelon=new Friend("应用商城",R.drawable.app);
            entertainmentList.add(watermelon);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_three,container,false);
        friendList=view.findViewById(R.id.entertainment_list);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        friendList.setLayoutManager(layoutManager);
        EnterAdapter eadapter=new EnterAdapter(getActivity(),R.layout.entertainment_layout, (ArrayList<Friend>) entertainmentList);
        friendList.setAdapter(eadapter);
        initFruits();
        return view;
    }




}