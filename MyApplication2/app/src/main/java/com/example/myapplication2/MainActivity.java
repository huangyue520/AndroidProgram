package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);

    }

    private void initFruits() {
        for(int i=0;i<2;i++){
            Fruit apple=new Fruit("苹果", R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana=new Fruit("香蕉",R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit cherry=new Fruit("樱桃",R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit grape=new Fruit("葡萄",R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit mango=new Fruit("芒果",R.drawable.mango_pic);
            fruitList.add(mango);
            Fruit orange=new Fruit("橘子",R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit pear=new Fruit("梨",R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit pineapple=new Fruit("凤梨",R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry=new Fruit("草莓",R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit watermelon=new Fruit("西瓜",R.drawable.watermelon_pic);
            fruitList.add(watermelon);
        }
    }

//    private String getRandomLengthName(String name){
//        Random random = new Random();
//        int length=random.nextInt(20)+1;
//        StringBuilder builder=new StringBuilder();
//        for(int i=0;i<length;i++){
//            builder.append(name);
//        }
//        return builder.toString();
//    }
}