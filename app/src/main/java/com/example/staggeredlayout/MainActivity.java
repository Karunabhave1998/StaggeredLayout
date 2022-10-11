package com.example.staggeredlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    UserModel userModel;
    UserAdapter userAdapter;
    List<UserModel> userModelList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler_v);
        recyclerView.setHasFixedSize(true);

       GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        /*StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        staggeredGridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);*/

        userAdapter=new UserAdapter(getApplicationContext(),userModelList,this);
        recyclerView.setAdapter(userAdapter);

        loadVerticalMethod();






    }

    private void loadVerticalMethod() {

        userModel=new UserModel(R.drawable.nature1);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature8);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature3);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature2);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature4);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature6);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature8);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature7);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature1);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature7);
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.nature3);
        userModelList.add(userModel);


    }

    public void OnClick(int adapterPosition) {
    }
}